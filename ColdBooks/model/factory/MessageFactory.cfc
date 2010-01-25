/**
 * Factory for creating Messages. 
 */
component output="false" accessors="true"
{

	public function init()
	{
		return this;
	}
	
	public function newMessage(connectionId)
	{
		var Message =  new ColdBooks.model.entity.QbMessage();
		Message.setConnectionId(connectionId);
		Message.setMessageId(createUUID());
		return Message;
	}
}