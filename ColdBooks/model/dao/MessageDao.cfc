/**
 * Database behavior for Message
 */
component extends="DAO" output="false" accessors="true"
{

	property name="ColdBooksMessageFactory" type="any";	
	
	public function init()
	{
		super.init();
		return this;
	}
	
	public function loadMessage( id )
	{
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbMessage WHERE id = :id", datasource=getDsn());
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
				modifiedDate
			)
			VALUES
			(
				:connectionId,
				:messageId,
				:request,
				:response,
				:callbackType,
				:callbackCFC,
				:callbackFunction,
				:returnFormat,
				:error,
				:createdDate,
				:modifiedDate
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
				connectionId = :connectionId,
				messageId = :messageId,
				request = :request,
				response = :response,
				callbackType = :callbackType,
				callbackCFC = :callbackCFC,
				callbackFunction = :callbackFunction,
				returnFormat = :returnFormat,
				error = :error,
				createdDate = :createdDate,
				modifiedDate = :modifiedDate
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
	
	function connectionHasPendingRequests(connectionId){
		return getPendingRequestCountForConnection(connectionId) GT 0;
	}
	
	function getNextPendingMessageForConnection(connectionId){
		// there's no quick/easy way I found to limit to the top row AND have an order by, so for now we're just querying everything then getting the first record.
		var query = new Coldbooks.model.cf.Query(sql="
			SELECT *
			FROM  QbMessage
			WHERE connectionId = :connectionId
				AND response IS NULL
				AND error IS NULL
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
			ORDER BY id ASC
			",
			datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		return query.execute().getResult();
	}

	
	function getPendingRequestCountForConnection(connectionId){
		var query = new Coldbooks.model.cf.Query(sql="SELECT COUNT(*) as count FROM QbMessage WHERE connectionId = :connectionId AND response IS NULL AND error IS NULL", datasource=getDsn());
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
	
	

}