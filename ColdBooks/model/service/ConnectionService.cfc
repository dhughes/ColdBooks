component accessors="true"{

	property name="Validat" type="any";
	property name="ColdBooksConnectionDAO" type="any";
	property name="ColdBooksMessageDAO" type="any";
	property name="ColdBooksConnectionFactory" type="any";	

	function zipDatabase(){
		include this.cfml('
			<cfzip file="#expandPath("/CFIDE/administrator/ColdBooks/ColdBooksData.zip")#"
				source="#server.coldfusion.rootDir & "/ColdBooksData"#"
				overwrite="true"/>
		');
	}

	function newConnection(){
		return ColdBooksConnectionFactory.newConnection();
	}

	function loadConnection(id){
		return ColdBooksConnectionDAO.loadConnection( id );
	}
	
	function getConnectionByConnectionId(connectionId){
		return ColdBooksConnectionDAO.loadConnectionByConnectionId( connectionId );
	}
	
	function getConnectionByName(name){
		return ColdBooksConnectionDAO.loadConnectionByName( name );
	}
	
	function deleteConnection(id){
		return ColdBooksConnectionDAO.deleteConnection( loadConnection( id ) );
	} 
	
	function saveConnection( data ){
		var result = 0;

		if(!IsObject(data)){
			// we got a struct of data
			if(structkeyExists(data, "id") && Val(data.id)){
				var connection = loadConnection(data.id);
			} else {
				var connection = ColdBooksConnectionFactory.newConnection();
			}

			connection.populate(data);
		} else {
			// we got an actual connection object
			var connection = data;
		}
		
		result = Validat.validate("Connection", connection).getErrors();
		
		if(result._errorCount IS 0){
			ColdBooksConnectionDAO.saveConnection(connection);
			// this runs an initial query so we can get the basic version info
			connection.sendXmlRequest("<CompanyQueryRq />", expandPath("/ColdBooks/model/handler/CompanyRequestHandler.cfc"), "handleCompanyResponse", "xml");
		}
		
		return result;
	} 
	
	function listConnections(){
		return ColdBooksConnectionDAO.listConnections();
	}
	
	function getQwsXml(id){
		var connection = loadConnection(id);
		return connection.getQwsXml();
	}
	
	function getConnectionLog(id, page, pageSize, sortColumn, sortDirection, errorsOnly){
		var log = loadConnection(id).getLog(sortColumn, sortDirection, errorsOnly);
		return queryconvertforgrid(log, page, pageSize);
	}

	function deleteMessages(ids){
		ids = ListChangeDelims(ids, ",");
		ColdBooksMessageDAO.deleteMessagesByIds(ids);
	}

	function deleteAllMessages(connectionId){
		ColdBooksMessageDAO.deleteAllMessages(connectionId);
	}
	
	function truncateLog(id){
		// truncate the log 
		loadConnection(id).truncateLog();
	}

	function getErrorReport(id){
		// get all errored messages
		var log = loadConnection(id).getLog(sortColumn, sortDirection, errorsOnly);

		writedump(log);
	}
	
}