/**
 * Database behavior for Connection
 */
component extends="ColdBooks.model.dao.DAO" output="false" accessors="true"
{

	property name="ColdBooksConnectionFactory" type="any";

	public function init()
	{
		super.init();
		return this;
	}

	public function loadConnection( id )
	{
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbConnection WHERE id = :id ", datasource=getDsn());
		query.addParam(name="id", value=id);
		connection = query.execute().getResult();
		
		var entity = getColdBooksConnectionFactory().newConnection();
		entity.populateFromQuery(connection, 1);
		
		return entity;
	}
	
	public function loadConnectionByConnectionId( connectionId ){
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbConnection WHERE connectionId = :connectionId ", datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		connection = query.execute().getResult();
		
		var entity = getColdBooksConnectionFactory().newConnection();
		if(connection.recordcount){
			entity.populateFromQuery(connection, 1);
		}
		
		return entity;
	}
	
	public function loadConnectionByName( name ){
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbConnection WHERE name = :name ", datasource=getDsn());
		query.addParam(name="name", value=name);
		connection = query.execute().getResult();

		if(!connection.recordCount){
			throw("Could Not Find Coldbooks Connection named '#name#'");
		}
		
		var entity = getColdBooksConnectionFactory().newConnection();
		entity.populateFromQuery(connection, 1);
		
		return entity;
	}

	public function saveConnection( Connection )
	{
		if(val(connection.getId())){
			updateConnection(Connection);
		} else {
			insertConnection(Connection);		
		}
	}

	private function insertConnection(Connection){
		Connection.setModifiedDate(now());
		Connection.setCreatedDate(now());
	
		var query = new Coldbooks.model.cf.Query(sql="
			INSERT INTO QbConnection
			(
				name,
				description,
				passwordHash,
				supportUrl,
				webserviceUrl,
				fileId,
				isReadOnly,
				connectionId,
				personalDataPref,
				schedulerInterval,
				schedulerUnit,
				logRetention,
				logTruncation,
				lastConnectionDateTime,
				companyFile,
				country,
				qbXmlMajorVersion,
				qbXmlMinorVersion,
				createdDate,
				modifiedDate,
				eventListeners
			)
			VALUES
			(
				:name ,
				:description ,
				:passwordHash ,
				:supportUrl ,
				:webserviceUrl ,
				:fileId ,
				:isReadOnly ,
				:connectionId ,
				:personalDataPref ,
				:schedulerInterval ,
				:schedulerUnit ,
				:logRetention ,
				:logTruncation ,
				:lastConnectionDateTime ,
				:companyFile ,
				:country ,
				:qbXmlMajorVersion ,
				:qbXmlMinorVersion ,
				:createdDate ,
				:modifiedDate ,
				:eventListeners 
			)
		", datasource=getDsn());
		
		bindQueryToObjet(query, Connection);
				
		result = query.execute();
		
		Connection.setId(result.getPrefix().generatedKey);		
	}

	private function updateConnection(Connection){
		Connection.setModifiedDate(now());
	
		var query = new Coldbooks.model.cf.Query(sql="
			UPDATE QbConnection
			SET
				name = :name ,
				description = :description ,
				passwordHash = :passwordHash ,
				supportUrl = :supportUrl ,
				webserviceUrl = :webserviceUrl ,
				fileId = :fileId ,
				isReadOnly = :isReadOnly ,
				connectionId = :connectionId ,
				personalDataPref = :personalDataPref ,
				schedulerInterval = :schedulerInterval ,
				schedulerUnit = :schedulerUnit ,
				logRetention = :logRetention ,
				logTruncation = :logTruncation ,
				lastConnectionDateTime = :lastConnectionDateTime ,
				companyFile = :companyFile ,
				country = :country ,
				qbXmlMajorVersion = :qbXmlMajorVersion ,
				qbXmlMinorVersion = :qbXmlMinorVersion ,
				createdDate = :createdDate ,
				modifiedDate = :modifiedDate ,
				eventListeners = :eventListeners 
			WHERE id = :id
		", datasource=getDsn());
		
		bindQueryToObjet(query, Connection);
		
		result = query.execute();
	}
	
	public function deleteConnection( Connection )
	{
		Connection.setModifiedDate(now());

		// delete messages for this connection
		var query = new Coldbooks.model.cf.Query(sql="
			DELETE FROM QbMessage
			WHERE connectionId = :id 
		", datasource=getDsn());

		bindQueryToObjet(query, Connection);
		query.execute();

		// delete the connection
		var query = new Coldbooks.model.cf.Query(sql="
			DELETE FROM QbConnection
			WHERE id = :id
		", datasource=getDsn());
		
		bindQueryToObjet(query, Connection);
		
		result = query.execute();
	}
	
	public function listConnections()
	{
		var connections = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbConnection ORDER BY name ASC", datasource=getDsn()).execute().getResult();
		
		var entities = [];
		
		for(var x = 1 ; x <= connections.recordCount ; x++){
			var entity = getColdBooksConnectionFactory().newConnection();
			entity.populateFromQuery(connections, x);
			ArrayAppend(entities, entity);
		}
		
		return entities;
	}

}