/**
 * Database behavior for Connection
 */
component extends="DAO" output="false" accessors="true"
{

	property name="ColdBooksConnectionFactory" type="any";	
	
	public function init()
	{
		super.init();
		return this;
	}
	
	public function loadConnection( id )
	{
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbConnection WHERE id = :id", datasource=getDsn());
		query.addParam(name="id", value=id);
		connection = query.execute().getResult();
		
		var entity = getColdBooksConnectionFactory().newConnection();
		entity.populateFromQuery(connection, 1);
		
		return entity;
	}
	
	public function loadConnectionByConnectionId( connectionId ){
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbConnection WHERE connectionId = :connectionId", datasource=getDsn());
		query.addParam(name="connectionId", value=connectionId);
		connection = query.execute().getResult();
		
		var entity = getColdBooksConnectionFactory().newConnection();
		entity.populateFromQuery(connection, 1);
		
		return entity;
	}
	
	public function loadConnectionByName( name ){
		var query = new Coldbooks.model.cf.Query(sql="SELECT * FROM QbConnection WHERE name = :name", datasource=getDsn());
		query.addParam(name="name", value=name);
		connection = query.execute().getResult();
		
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
				lastConnectionDateTime,
				companyFile,
				country,
				qbXmlMajorVersion,
				qbXmlMinorVersion,
				createdDate,
				modifiedDate
			)
			VALUES
			(
				:name,
				:description,
				:passwordHash,
				:supportUrl,
				:webserviceUrl,
				:fileId,
				:isReadOnly,
				:connectionId,
				:personalDataPref,
				:schedulerInterval,
				:schedulerUnit,
				:lastConnectionDateTime,
				:companyFile,
				:country,
				:qbXmlMajorVersion,
				:qbXmlMinorVersion,
				:createdDate,
				:modifiedDate
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
				name = :name,
				description = :description,
				passwordHash = :passwordHash,
				supportUrl = :supportUrl,
				webserviceUrl = :webserviceUrl,
				fileId = :fileId,
				isReadOnly = :isReadOnly,
				connectionId = :connectionId,
				personalDataPref = :personalDataPref,
				schedulerInterval = :schedulerInterval,
				schedulerUnit = :schedulerUnit,
				lastConnectionDateTime = :lastConnectionDateTime,
				companyFile = :companyFile,
				country = :country,
				qbXmlMajorVersion = :qbXmlMajorVersion, 
				qbXmlMinorVersion = :qbXmlMinorVersion,
				createdDate = :createdDate,
				modifiedDate = :modifiedDate
			WHERE id = :id
		", datasource=getDsn());
		
		bindQueryToObjet(query, Connection);
		
		result = query.execute();
	}
	
	public function deleteConnection( Connection )
	{
		Connection.setModifiedDate(now());
	
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