component accessors="true"{

	property name="Validat" type="any";
	property name="ColdBooksConnectionDAO" type="any";	
	property name="ColdBooksConnectionFactory" type="any";	

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
		
		if(structkeyExists(data, "id") && Val(data.id)){
			var connection = loadConnection(data.id);
		} else {
			var connection = ColdBooksConnectionFactory.newConnection();
		}
	
		connection.populate(data);
		
		result = Validat.validate("Connection", connection).getErrors();
		
		if(result._errorCount IS 0){
			ColdBooksConnectionDAO.saveConnection(connection);
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
	
	function getConnectionLog(id, page, pageSize, sortColumn, sortDirection){
		var log = loadConnection(id).getLog(sortColumn, sortDirection);
		return queryconvertforgrid(log, page, pageSize);
	}
	
	function truncateLog(id){
		// truncate the log 
		loadConnection(id).truncateLog();
	}
	
}