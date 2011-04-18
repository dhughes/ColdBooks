/**
 * Factory for creating Connections. 
 */
component output="false" accessors="true"
{

	property name="ColdBooksJavaLoader" type="any";
	property name="ColdBooksMessageFactory" type="any";
	property name="ColdBooksMessageDao" type="any";
	property name="ColdBooksTranslator" type="any";

	public function init()
	{
		return this;
	}
	
	public function newConnection()
	{
		var Connection =  new ColdBooks.model.entity.QbConnection();
		Connection.setConnectionId(createUUID());
		Connection.setFileId(createUUID());
		Connection.setColdBooksJavaLoader(getColdBooksJavaLoader());
		Connection.setColdBooksMessageFactory(getColdBooksMessageFactory());
		Connection.setColdBooksMessageDao(getColdBooksMessageDao());
		Connection.setColdBooksTranslator(getColdBooksTranslator());
		
		return Connection;
	}
}