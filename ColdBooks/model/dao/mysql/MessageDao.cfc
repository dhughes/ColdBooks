/**
 * Database behavior for Message
 */
component extends="ColdBooks.model.dao.DAO" output="false" accessors="true"
{

	property name="ColdBooksMessageFactory" type="any";
	property name="maxMessages";

	public function init()
	{
		super.init();
		return this;
	}
	
	public function loadMessage( id )
	{
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbMessage WHERE id = :id ", datasource=getDsn());
		query.addParam(name="id", value=id);
		var Message = query.execute().getResult();
		
		var entity = getColdBooksMessageFactory().newMessage(Message.connectionId);
		entity.populateFromQuery(Message, 1);
		
		return entity;
	}

	public function isDuplicateMessage(Message){
		var request = Message.getRequest();
		var requestID = XmlParse(request).XmlRoot.XmlAttributes["requestID"];
		request = replace(request, requestID, "{________-____-____-____-____________}");

		var query = new Coldbooks.model.cf.Query(sql="
			SELECT *
			FROM QbMessage
			WHERE connectionId = :connectionId  
				AND response IS NULL
				AND error IS NULL
				AND request LIKE :request 
			ORDER BY id ASC
			",
			datasource=getDsn()
		);

		query.addParam(name="connectionId", value=Message.getConnectionId());
		query.addParam(name="request", value=request);

		return query.execute().getResult().recordcount GT 0;
	}

	public function saveMessage( Message, allowDuplicateMessages=true )
	{
		// if we are NOT allowing duplicate messages then need to try reading this exact message
		// from the db
		if(!allowDuplicateMessages && isDuplicateMessage(Message)){
			writelog("Did not log duplicate message: #Message.getRequest()#");
			return;
		}

		if(val(Message.getId())){
			updateMessage(Message);
		} else {
			insertMessage(Message);
		}
	}

	private function insertMessage(Message){
		Message.setModifiedDate(now());
		Message.setCreatedDate(now());
	
		var query = new Coldbooks.model.cf.Query(sql="
			INSERT INTO QbMessage
			(
				connectionId,
				messageId,
				request,
				response,
				callbackType,
				callbackCFC,
				callbackFunction,
				returnFormat,
				error,
				createdDate,
				modifiedDate,
				runAfterDateTime
			)
			VALUES
			(
				:connectionId ,
				:messageId ,
				:request ,
				:response ,
				:callbackType ,
				:callbackCFC ,
				:callbackFunction ,
				:returnFormat ,
				:error ,
				:createdDate ,
				:modifiedDate ,
				:runAfterDateTime 
			)
		", datasource=getDsn());
		
		bindQueryToObjet(query, Message);
				
		result = query.execute();
		
		Message.setId(result.getPrefix().generatedKey);		
	}

	private function updateMessage(Message){
		Message.setModifiedDate(now());
	
		var query = new Coldbooks.model.cf.Query(sql="
			UPDATE QbMessage
			SET
				connectionId = :connectionId ,
				messageId = :messageId ,
				request = :request ,
				response = :response ,
				callbackType = :callbackType ,
				callbackCFC = :callbackCFC ,
				callbackFunction = :callbackFunction ,
				returnFormat = :returnFormat ,
				error = :error ,
				createdDate = :createdDate ,
				modifiedDate = :modifiedDate ,
				runAfterDateTime = :runAfterDateTime 
			WHERE id = :id
		", datasource=getDsn());
		
		bindQueryToObjet(query, Message);
		
		result = query.execute();
	}
	
	function deleteMessage( Message )
	{
		Message.setModifiedDate(now());
	
		var query = new Coldbooks.model.cf.Query(sql="
			DELETE FROM QbMessage
			WHERE id = :id 
		", datasource=getDsn());
		
		bindQueryToObjet(query, Message);
		
		result = query.execute();
	}

	function deleteMessagesByIds( ids ){
		var query = new Coldbooks.model.cf.Query(sql="
			DELETE FROM QbMessage
			WHERE id in ( :ids )
		", datasource=getDsn());

		query.addParam(name="ids", value=ids, list="true");

		query.execute();
	}

	function deleteAllMessages(connectionID){
		var query = new Coldbooks.model.cf.Query(sql="
			DELETE FROM QbMessage
			WHERE connectionID = :connectionID 
		", datasource=getDsn());

		query.addParam(name="connectionID", value=connectionID);

		query.execute();
	}
	
	function connectionHasPendingRequests(connectionId){
		return getPendingRequestCountForConnection(connectionId, true) GT 0;
	}
	
	function getNextPendingMessageForConnection(connectionId){
		// there's no quick/easy way I found to limit to the top row AND have an order by, so for now we're just querying everything then getting the first record.
		var query = new Coldbooks.model.cf.Query(sql="
			SELECT *
			FROM  QbMessage
			WHERE connectionId = :connectionId 
				AND response IS NULL
				AND error IS NULL
				AND (runAfterDateTime IS NULL OR runAfterDateTime <= CURRENT_TIMESTAMP)
			ORDER BY id ASC
			",
			datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		var Message = query.execute().getResult();
		
		var entity = getColdBooksMessageFactory().newMessage(connectionId);
		entity.populateFromQuery(Message, 1);
		
		return entity;
	}
	
	function getPendingMessagesForConnectionAsQuery(connectionId, limitRows=true){
		var query = new Coldbooks.model.cf.Query(sql="
			SELECT *
			FROM  QbMessage
			WHERE connectionId = :connectionId 
				AND response IS NULL
				AND error IS NULL
				AND (runAfterDateTime IS NULL OR runAfterDateTime <= CURRENT_TIMESTAMP)
			ORDER BY id ASC
			",
			datasource=getDsn());

		if(limitRows){
			query.setMaxRows(getMaxMessages());
		}
		
		query.addParam(name="connectionId", value=connectionId);
		return query.execute().getResult();
	}

	function getRequestCountForConnection(connectionId){
		var sql = "SELECT COUNT(*) as count FROM QbMessage WHERE connectionId = :connectionId ";

		var query = new Coldbooks.model.cf.Query(sql=sql, datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		var result = query.execute().getResult();

		return result.count;
	}
	
	function getPendingRequestCountForConnection(connectionId, filterFutureMessages){
		var sql = "SELECT COUNT(*) as count FROM QbMessage WHERE connectionId = :connectionId AND response IS NULL AND error IS NULL ";
		if(structKeyExists(arguments, "filterFutureMessages") AND arguments.filterFutureMessages){
			sql &= " AND (runAfterDateTime IS NULL OR runAfterDateTime <= CURRENT_TIMESTAMP)";
		}
		var query = new Coldbooks.model.cf.Query(sql=sql, datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		var result = query.execute().getResult();

		return result.count;
	}

	function getErroredRequests(connectionId){

		var result = "";

		// I'd do the XML parsing below as part of this query, but MySQL only supports xpath 1.
		include this.cfml('
			<cfquery name="result" datasource="#getDsn()#">
				SELECT

				response, id

				FROM QbMessage
				WHERE connectionId = <cfqueryparam value="#arguments.connectionId#" />
				AND (error IS NOT NULL OR response LIKE <cfqueryparam cfsqltype="CF_SQL_VARCHAR" value="%Error%" />)
			</cfquery>
		');

		queryAddColumn(result, "requestName", []);
		queryAddColumn(result, "statusCode", []);
		queryAddColumn(result, "statusMessage", []);

		for(var i = 1 ; i <= result.recordCount ; i++){
			// parse out the XML values
			var response = xmlParse(result.response[i]);
			var requestName = XmlSearch(response, "name(//@statusMessage/..)");
			var statusCode = XmlSearch(response, "string(//@statusCode)");
			var statusMessage = XmlSearch(response, "string(//@statusMessage)");

			QuerySetCell(result, "requestName", requestName, i);
			QuerySetCell(result, "statusCode", statusCode, i);
			QuerySetCell(result, "statusMessage", statusMessage, i);
		}

		return result;
	}

	function getMessageHistory(connectionId, sortColumn, sortDirection, page, pageSize, errorsOnly){

		var result = "";
		var start = (page*pageSize)-(pageSize);

		include this.cfml('
			<cfquery name="result" datasource="#getDsn()#">
				SELECT id, messageId, request, response, callbackCfc, callbackFunction, returnFormat, createdDate, modifiedDate, runAfterDateTime, error
				FROM QbMessage
				WHERE connectionId = <cfqueryparam value="#connectionId#" />
				<cfif errorsOnly>
					AND (error IS NOT NULL OR response LIKE <cfqueryparam cfsqltype="CF_SQL_VARCHAR" value="%Error%" />)
				</cfif>
				ORDER BY #Iif(len(sortColumn), De(sortColumn), De('id'))# #sortDirection#
        	    LIMIT #start#, #pageSize#
			</cfquery>
		');

		for(var x = 1 ; x <= result.recordCount ; x++){
			querySetCell(result,"request",htmlEditFormat(result["request"][x]),x);
			querySetCell(result,"response",htmlEditFormat(result["response"][x]),x);	
		}
		
		return result;
	}

	function getErroredRequestCountForConnection(connectionId){
		var query = new Coldbooks.model.cf.Query(sql="SELECT COUNT(*) as count FROM QbMessage WHERE connectionId = :connectionId AND (error IS NOT NULL OR response LIKE '%Error%')", datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		var result = query.execute().getResult();
		
		return result.count;
	}
	
	function getMessageByMessageIdInQBFormat(messageId){
		// "fix" the messageId
		messageId = Mid(messageId, 2, 23) & Mid(messageId, 26, 12);
		
		return getMessageByMessageId(messageId);
	}
	
	function getMessageByMessageId(messageId){
		messageId = replace(messageId, "{", "");
		messageId = replace(messageId, "}", "");

		if(mid(messageId, 24, 1) == "-"){
			messageId = left(messageId, 23) & right(messageId, 12);
		}

		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbMessage WHERE messageId = :messageId ", datasource=getDsn());

		query.addParam(name="messageId", value=messageId);
		var Message = query.execute().getResult();
		
		var entity = getColdBooksMessageFactory().newMessage(Message["connectionId"][1]);
		entity.populateFromQuery(Message, 1);
		
		return entity;
	}
	
	function truncateLogs(numeric connectionId, logRetention, logTruncation){
		var truncationDate = dateAdd("d", -logTruncation, now());
		// let's start out by deleting old log entries (past the truncation days)
		// note, we never delete incomplete (no response or errors)
		var sql = "
			DELETE FROM QbMessage
			WHERE connectionId = :connectionId
				AND NOT (
					response IS NULL AND error IS NULL 
				)
				AND createdDate < Timestamp('#DateFormat(truncationDate, "yyyymmdd")##TimeFormat(truncationDate, "hhmmss")#') 
		";
		
		var query = new Coldbooks.model.cf.Query( sql=sql, datasource=getDsn() );
		query.addParam(name="connectionId", value=connectionId);
		query.execute();
		
		// next, we should have a smaller set of messages left (at least in theory).
		// from that set we need to delete anything that's is NOT to be retained.
		// for exampole, we need to delete any completed entries (but not errors)
		// if the logRetention value is "errors".  We don't delete anything if it's
		// set to "all"
		sql = "";
		
		if(logRetention IS "errored"){
			sql = "
				DELETE FROM QbMessage
				WHERE connectionId = :connectionId
					AND response IS NOT NULL
					AND error IS NULL 
			";
		} else if (logRetention IS "none"){
		 	sql = "
				DELETE FROM QbMessage
				WHERE connectionId = :connectionId
					AND (
						response IS NOT NULL
						OR error IS NOT NULL
					) 
			";
		}
		
		if(len(sql)){
			var query = new Coldbooks.model.cf.Query( sql=sql, datasource=getDsn() );
			query.addParam(name="connectionId", value=connectionId);
			query.execute();
		}
	}

}