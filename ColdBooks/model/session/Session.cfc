component accessors="true"{

	property name="timeout" type="any";

	this.sessions = {};
	
	function newSession(connectionId, Connection){
		this.sessions[connectionId] = StructNew();
		this.sessions[connectionId].lastConnected = now();
		this.sessions[connectionId].startTick = getTickCount();
		this.sessions[connectionId].Connection = Connection;
		this.sessions[connectionId].OverrideBatch = false;
		this.sessions[connectionId].error = "No error recorded.  You should check the ColdFusion logs for server errors.";
		this.sessions[connectionId].totalRequests = Connection.getPendingRequestCount();

		this.sessions[connectionId].values = {};

		return connectionId; 
	}

	function setValue(connectionId, name, value){
		this.sessions[connectionId].values[name] = value;
	}

	function getValue(connectionId, name){
		return this.sessions[connectionId].values[name];
	}

	function getAllValues(connectionId){
		//try{
		return this.sessions[connectionId].values;
		/*} catch(any e){
			writedump(this.sessions, "console");
			writedump(arguments.connectionId, "console");
			rethrow;
		}*/
	}

	function valueExists(connectionId, name){
		return structKeyExists(this.sessions[connectionId].values, name);
	}

	function setOverrideBatch(connectionId, value){
		maintainSession(connectionId);
		this.sessions[connectionId].OverrideBatch = value;
	}
	
	function getOverrideBatch(connectionId){
		maintainSession(connectionId);
		return this.sessions[connectionId].OverrideBatch;
	}
	
	function getDuration(connectionId){
		return getTickcount()-this.sessions[connectionId].startTick;
	}
	
	function getTotalRequests(connectionId){
		maintainSession(connectionId);
		this.sessions[connectionId].totalRequests = this.sessions[connectionId].Connection.getPendingRequestCount();
		return this.sessions[connectionId].totalRequests;
	}
	
	function deleteSession(connectionId){
		if(StructKeyExists(this.sessions, connectionId)){
			StructDelete(this.sessions, connectionId);
		}
	}
	
	function getConnection(connectionId){
		maintainSession(connectionId);
		
		return this.sessions[connectionId].Connection;
	}
	
	private function maintainSession(connectionId){
		if(dateAdd("s", getTimeout(), this.sessions[connectionId].lastConnected) LTE now()){
			throw("Session Timed Out");
		}
	
		this.sessions[connectionId].lastConnected = now();
	}
	
	function setError(connectionId, error){
		this.sessions[connectionId].error = error;
	}
	
	function getError(connectionId){
		return this.sessions[connectionId].error;
	}
}