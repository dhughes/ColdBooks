component accessors="true"{

	property name="timeout" type="any";

	// insure we have a set of sessions in the application scope:
	if(!structKeyExists(application, "ColdBooksSessions")){
		application.ColdBooksSessions = {};
	}
    
	// get a reference to the application.ColdBooksSessions struct
	//application.ColdBooksSessions = application.ColdBooksSessions;


	function newSession(connectionId, Connection){
		application.ColdBooksSessions[connectionId] = StructNew();
		application.ColdBooksSessions[connectionId].lastConnected = now();
		application.ColdBooksSessions[connectionId].startTick = getTickCount();
		application.ColdBooksSessions[connectionId].Connection = Connection;
		application.ColdBooksSessions[connectionId].OverrideBatch = false;
		application.ColdBooksSessions[connectionId].error = "";
		application.ColdBooksSessions[connectionId].totalRequests = Connection.getPendingRequestCount();

		application.ColdBooksSessions[connectionId].values = {};

		return connectionId; 
	}

	function setValue(connectionId, name, value){
		application.ColdBooksSessions[connectionId].values[name] = value;
	}

	function getValue(connectionId, name){
		return application.ColdBooksSessions[connectionId].values[name];
	}

	function getAllValues(connectionId){
		//try{
		return application.ColdBooksSessions[connectionId].values;
		/*} catch(any e){
			writedump(application.ColdBooksSessions, "console");
			writedump(arguments.connectionId, "console");
			rethrow;
		}*/
	}
	
	function deleteValue(connectionId, name){
		structDelete(application.ColdBooksSessions[connectionId], name);
	}

	function valueExists(connectionId, name){
		return structKeyExists(application.ColdBooksSessions[connectionId].values, name);
	}

	function setOverrideBatch(connectionId, value){
		maintainSession(connectionId);
		application.ColdBooksSessions[connectionId].OverrideBatch = value;
	}
	
	function getOverrideBatch(connectionId){
		maintainSession(connectionId);
		return application.ColdBooksSessions[connectionId].OverrideBatch;
	}
	
	function getDuration(connectionId){
		return getTickcount()-application.ColdBooksSessions[connectionId].startTick;
	}
	
	function getTotalRequests(connectionId){
		maintainSession(connectionId);
		application.ColdBooksSessions[connectionId].totalRequests = application.ColdBooksSessions[connectionId].Connection.getPendingRequestCount();
		return application.ColdBooksSessions[connectionId].totalRequests;
	}
	
	function deleteSession(connectionId){
		if(StructKeyExists(application.ColdBooksSessions, connectionId)){
			StructDelete(application.ColdBooksSessions, connectionId);
		}
	}
	
	function getConnection(connectionId){
		maintainSession(connectionId);
		
		return application.ColdBooksSessions[connectionId].Connection;
	}
	
	private function maintainSession(connectionId){
		if(dateAdd("s", getTimeout(), application.ColdBooksSessions[connectionId].lastConnected) LTE now()){
			throw("Session Timed Out");
		}
	
		application.ColdBooksSessions[connectionId].lastConnected = now();
	}
	
	function hasError(connectionId){
		
		return StructKeyExists(application.ColdBooksSessions, connectionId) && (!IsSimpleValue(application.ColdBooksSessions[connectionId].error) || Len(application.ColdBooksSessions[connectionId].error));
	}
	
	function setError(connectionId, error){
		application.ColdBooksSessions[connectionId].error = error;
	}
	
	function getError(connectionId){
		return application.ColdBooksSessions[connectionId].error;
	}
}