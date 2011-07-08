/**
 * Database behavior for Message
 */
component extends="DAO" output="false" accessors="true"
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

	public function saveMessage( Message )
	{
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
	
	function getPendingMessagesForConnectionAsQuery(connectionId){
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

		query.setMaxRows(getMaxMessages());
		
		query.addParam(name="connectionId", value=connectionId);
		return query.execute().getResult();
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

	function getMessageHistory(connectionId, sortColumn, sortDirection){
	
		var query = new Coldbooks.model.cf.Query(sql="
			SELECT id, messageId, request, response, callbackCfc, callbackFunction, returnFormat, createdDate, modifiedDate, runAfterDateTime, error
			FROM QbMessage
			WHERE connectionId = :connectionId 
			ORDER BY #Iif(len(sortColumn), De(sortColumn), De('id'))# #sortDirection#
		", datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		var result = query.execute().getResult();
		
		for(var x = 1 ; x <= result.recordCount ; x++){
			querySetCell(result,"request",htmlEditFormat(result["request"][x]),x);
			querySetCell(result,"response",htmlEditFormat(result["response"][x]),x);	
		}
		
		return result;
	}

	function getErroredRequestCountForConnection(connectionId){
		var query = new Coldbooks.model.cf.Query(sql="SELECT COUNT(*) as count FROM QbMessage WHERE connectionId = :connectionId AND error IS NOT NULL", datasource=getDsn());
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
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbMessage WHERE messageId = :messageId", datasource=getDsn());
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