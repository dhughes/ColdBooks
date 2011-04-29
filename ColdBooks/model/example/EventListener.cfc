component{

	function onBeforeAuthenticate(data){
		writelog("handling onBeforeAuthenticate event");
		writedump(StructKeyList(data), "console");
	}

	function onAfterAuthenticate(data){
		writelog("handling onAfterAuthenticate event");
		writedump(StructKeyList(data), "console");
	}

	function onCloseConnection(data){
		writelog("handling onCloseConnection event");
		writedump(StructKeyList(data), "console");
	}

	function onSendRequest(data){
		writelog("handling onSendRequest event");
		writedump(StructKeyList(data), "console");
	}

	function onConnectionError(data){
		writelog("handling onConnectionError event");
		writedump(StructKeyList(data), "console");
	}

	function onBeforeReceiveResponseXML(data){
		writelog("handling onBeforeReceiveResponseXML event");
		writedump(StructKeyList(data), "console");
	}

	function onAfterReceiveResponseXML(data){
		writelog("handling onAfterReceiveResponseXML event");
		writedump(StructKeyList(data), "console");
	}

	function onGetLastError(data){
		writelog("handling onGetLastError event");
		writedump(StructKeyList(data), "console");
	}

	function onError(data){
		writelog("handling onError event");
		writedump(StructKeyList(data), "console");
	}

}