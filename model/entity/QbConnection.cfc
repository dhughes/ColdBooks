/**
* I model ColdBook Connection.
*/
component extends="Entity" output="false" accessors="true" displayname="Connection" {
	
	//property name="ColdBooksJavaLoader" type="any";
	property name="ColdBooksMessageFactory" type="any";
	property name="ColdBooksMessageDao" type="any";
	//property name="ColdBooksTranslator" type="any";
	property name="ColdBooksSession" type="any";
	
	property name="id" type="numeric";
	property name="name" type="string";
	property name="description" type="string";
	property name="passwordHash" type="string";
	property name="supportUrl" type="string";
	property name="webserviceUrl" type="string";
	property name="fileId" type="string";
	property name="isReadOnly" type="boolean";
	property name="connectionId" type="string"; // this is translated into the owner Id
	property name="logRetention" type="string";
	property name="logTruncation" type="any";
	property name="personalDataPref" type="string";
	property name="schedulerInterval" type="string";
	property name="schedulerUnit" type="string";
	property name="lastConnectionDateTime" type="any";
	property name="companyFile" type="string";
	property name="country" type="string";
	property name="qbXmlMajorVersion" type="string";
	property name="qbXmlMinorVersion" type="string";
	property name="createdDate" type="any";
	property name="modifiedDate" type="any";
	property name="eventListeners" type="string";

	function handleEvent(event, data, coldBooksSession){
		var cfcs = getEventListenersArray();
		var error = "";
		
		for(var i = 1 ; i <= ArrayLen(cfcs) ; i++){
			var cfc = cfcs[i];
			var threadId = "EventHandler#createUUID()#";

			if(!FileExists(cfc)){
				// whoops, the file doesn't exist!
				throw("File '#cfc#' does not exist!");
			}

			// spawn a thread to prevent hosing the web service call (not sure why that happens)
			thread
				action="run"
				name="#threadId#"
				appname="AsyncEventHandler"
				cfc="#cfc#"
				data="#data#"
				connection="#this#"
				event="#event#"
				coldBooksSession="#coldBooksSession#"
			{
				var CFCProxy = CreateObject("Java", "coldfusion.cfc.CFCProxy").init(cfc);
				var func = CFCProxy.getMethod(event);

				if(IsDefined("func")){
					CFCProxy.invoke(event, [data, connection, coldBooksSession], getPageContext().getRequest(), getPageContext().getResponse());
				}

				thread.data = data;
				thread.coldBooksSession = coldBooksSession;
			}

			// join the thread....
			thread
				action="join"
				name="#threadId#";

			// save any errors
			if(structKeyExists(cfthread[threadId], "error")){
				writedump(cfthread[threadId].error, "console", "text", false, "Encountered Error. See ColdBooks log for more details.");
				return cfthread[threadId].error;
			}

			// put any modified values back into the data structure
			StructAppend(data, cfthread[threadId].data, true);
			StructAppend(coldBooksSession, cfthread[threadId].coldBooksSession, true);

		}

		return "";

	}

	function getEventListenersArray(){
		return ListToArray(geteventListeners(), chr(13)&chr(10));
	}

	function getSdkVersion(){
		var sdkVersion = getQbXmlMajorVersion() & getQbXmlMinorVersion();

		// does this SDK exist?
		var list = directoryList(expandPath("/ColdBooks/java/bin/com/alagad/ColdBooks/#ucase(getCountry())#"), false, "name", "v*");
		var versions = [];
		// loop over the list and create an array of versions
		for(var i = 1 ; i <= ArrayLen(list) ; i++){
			arrayAppend(versions, Right(list[i], Len(list[i])-1));
		}

		// sort the versions
		arraySort(versions, "numeric");

		// loop over the versions and see if the sdkVersion we're provided exits.
		// if not, then return the last one.
		for(var i = 1 ; i <= ArrayLen(versions) ; i++){
			if(versions[i] == sdkVersion){
				return sdkVersion;
			} else if(versions[i] > sdkVersion){
				return versions[i-1];
			}
		}

		// should never get here
		throw("should never have gotten here!!");
	}
	
	function sendXmlRequest(xml, callbackCFC, callbackFunction, returnFormat, delay, allowDuplicateMessages=true){
		// this needs to create and record a message
		var message = getColdBooksMessageFactory().newMessage(getId());
		
		validateReturnFormat(returnFormat);
		
		// add the message ID to the request (this could probably be faster with string processing)
		xml = XmlParse(xml);
		xml.XmlRoot.XmlAttributes["requestID"] = message.getQbMessageId();
		xml = trim(replace(toString(xml), '<?xml version="1.0" encoding="UTF-8"?>', ""));
		
		message.setRequest(xml);
		message.setCallbackType("component");
		message.setCallbackCFC(callbackCFC);
		message.setCallbackFunction(callbackFunction);
		message.setReturnFormat(returnFormat);

		// do we have any delay information?
		if(StructKeyExists(arguments, "delay")){
			message.setRunAfterDateTime(processDelay(delay));
		}
				
		// save the message
		getColdBooksMessageDao().saveMessage(message, allowDuplicateMessages);
		
		return message.getMessageId();
	}
	
	/*
	function sendRequest(object, callbackCFC, callbackFunction, returnFormat, delay, allowDuplicateMessages=true){
		// this needs to create and record a message
		var message = getColdBooksMessageFactory().newMessage(getId());
		
		validateReturnFormat(returnFormat);
		
		// set the object's message ID
		object.setRequestID(message.getQbMessageId());
		
		// add qbxml wrapper around this object  (I hate the busy work, but it's got to be done)
		var QBXML = getQbObjectFactory().createQBXML();
		var QBXMLMsgsRq = getQbObjectFactory().createQBXMLMsgsRq();
		QBXMLMsgsRq.setOnError("continueOnError");
		QBXMLMsgsRq.getHostQueryRqOrCompanyQueryRqOrCompanyActivityQueryRq().add(object);
		QBXML.setQBXMLMsgsRq(QBXMLMsgsRq);
		
		// get the XML for the request
		var xml = getColdBooksTranslator().toQBXML(QBXML, this);
		
		// just a couple of convenience variables
		var xmlBegin = '<?xml version="1.0" encoding="UTF-8" ?><?qbxml version="#getSdkVersion()#" ?><QBXML><QBXMLMsgsRq onError="continueOnError">';
		var xmlEnd = '</QBXMLMsgsRq></QBXML>';
		
		// get the request from the full message
		xml = Mid(xml, len(xmlBegin) + 1, Len(xml) - len(xmlBegin) - len(xmlEnd));

		// add the request to the message and save it.
		message.setRequest(xml);
		message.setCallbackType("component");
		message.setCallbackCFC(callbackCFC);
		message.setCallbackFunction(callbackFunction);
		message.setReturnFormat(returnFormat);

		// do we have any delay information?
		if(StructKeyExists(arguments, "delay")){
			message.setRunAfterDateTime(processDelay(delay));
		}

		// save the message
		getColdBooksMessageDao().saveMessage(message, allowDuplicateMessages);
		
		return message.getMessageId();
	}
	*/

	private function processDelay(delay){
		// do we have any delay information?
		if(IsDate(arguments.delay)){
			return arguments.delay;
		} else if(IsNumeric(arguments.delay)){
			return CreateODBCDateTime(now() + arguments.delay);
		} else {
			throw("The value '#arguments.delay#' passed into delay argument is not a datetime or a timespan.");
		}
	}
	
	function getRequestStatus(messageId){
		var Message = getColdBooksMessageDao().getMessageByMessageId(messageId);
		return Message.getStatus();
	}

	function getRequest(messageId){
		return getColdBooksMessageDao().getMessageByMessageId(messageId);
	}

	function getErroredRequests(){
		return getColdBooksMessageDao().getErroredRequests(getId());
	}

	function getLog(sortColumn, sortDirection, page, pageSize, errorsOnly){
		return getColdBooksMessageDao().getMessageHistory(getId(), sortColumn, sortDirection, page, pageSize, errorsOnly);
	}
	
	function truncateLog(){
		getColdBooksMessageDao().truncateLogs(getId(), getLogRetention(), getlogTruncation());
	}
	
	function wrapXmlRequests(xml){
		return '<?xml version="1.0" encoding="UTF-8" ?><?qbxml version="#getqbXmlMajorVersion()#.#getqbXmlMinorVersion()#" ?><QBXML><QBXMLMsgsRq onError="continueOnError">' & xml & '</QBXMLMsgsRq></QBXML>';
	}
	
	function wrapXmlResponse(xml){
		xml = replace(xml, '<?xml version="1.0" encoding="UTF-8"?>', "");
		return '<?xml version="1.0" encoding="UTF-8" ?><?qbxml version="#getqbXmlMajorVersion()#.#getqbXmlMinorVersion()#" ?><QBXML><QBXMLMsgsRs onError="continueOnError">' & xml & '</QBXMLMsgsRs></QBXML>';
	}
	
	function handleResponse(xml){
		// using the XML I need to find the request
		xml = XmlParse(xml);
		// record the event for each child
		if(ArrayLen(xml.XMLRoot.QBXMLMsgsRs.XmlChildren)){
			handleResponseMessage(xml.XMLRoot.QBXMLMsgsRs.XmlChildren[1]);
		}
	}
	
	private function handleResponseMessage(response){
		// get the requestId
		var requestId = response.XmlAttributes["requestId"];
		// get the request by its id for this connection
		var Message = getColdBooksMessageDao().getMessageByMessageIdInQBFormat(requestId);
		
		// update the request with the response
		Message.setResponse(toString(response));
		// save the message with the response
		getColdBooksMessageDao().saveMessage(Message);
		
		// next, run the call back function
		callBack(Message.getCallbackCFC(), Message.getCallbackFunction(), Message.getReturnFormat(), Message.getResponse(), requestId);
		
		// writelog("do callback to CFC for request #requestId# !!!!!!!!!!!!!!");
	}
	
	private function callBack(cfc, method, returnFormat, response, requestId){
		
		/*if(returnFormat == "object"){
			// we need to create a complete response object, serialize it then get the specific object back.
			response = getColdBooksTranslator().toObjects(wrapXmlResponse(response), this);
			response = response.getQBXMLMsgsRs().getHostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs();
		}*/

		var ColdBooksSession = getColdBooksSession();

		//var qbSessionData = getColdBooksSession().getAllValues(getConnectionId());

		// indicate that we're running a callback
		ColdBooksSession.setValue(getConnectionId(), "isRunning", true);
		ColdBooksSession.setValue(getConnectionId(), "threadPercentComplete", 0);
		
		// invoke the CFC
		// you may wonder why this is being done in a thread.... the reason is that the CFCProxy
		// seems to be causing java.lang.IllegalStateException in the QBWS service.  wrapping 
		// it up in a thread seems to surpress these problems.
		try{
			thread
				action="run"
				name="#requestId#"
				appname="AsyncCallback"
				priority="HIGH"   
				cfc="#cfc#"
				method="#method#"
				response="#response#"
				requestId="#requestId#"
				connection="#this#"
				connectionId="#getConnectionId()#"
				ColdBooksSession="#ColdBooksSession#"
			{
				writelog("spawned thread...");
				
				// indicate that we're running a callback
				ColdBooksSession.setValue(connectionId, "isRunning", true);
				ColdBooksSession.setValue(connectionId, "threadPercentComplete", 0);
				
				// do the callback
				try{
					var CFCProxy = CreateObject("Java", "coldfusion.cfc.CFCProxy").init(cfc);
					CFCProxy.invoke(method, [response, requestId, connection, ColdBooksSession.getAllValues(connectionId)], getPageContext().getRequest(), getPageContext().getResponse());
					writelog("finished working behind the scenes...");	
				} catch(any e){
					// record the error in session and note that we're done running
					ColdBooksSession.setError(connectionId, e);
	
					// save the error into the corrisponding message
					var Message = getColdBooksMessageDao().getMessageByMessageIdInQBFormat(requestId);
					Message.setError(serializeJSON(e));
					getColdBooksMessageDao().saveMessage(Message);
					
					writelog("Error while running callback.");
					writedump(e, "console");
				}
				
				// we're done.  We may or may not have had an error thrown by the error handler
				ColdBooksSession.setValue(connectionId, "completedRequests", ColdBooksSession.getValue(connectionId, "completedRequests")+1);
				ColdBooksSession.setValue(connectionId, "threadPercentComplete", 0);
				ColdBooksSession.setValue(connectionId, "isRunning", false);
				
				//writedump(ColdBooksSession.getAllValues(connectionId), "console", "text", false, "QB session in thread"  );
				
				writelog("Completed callback thread/process.");
				
				
					
			}
		} catch(any e){
			// there was some sort of error thrown when threading, but not within the thread
			writedump(e, "console");
			ColdBooksSession.setValue(connectionId, "completedRequests", ColdBooksSession.getValue(connectionId, "completedRequests")+1);
			ColdBooksSession.setValue(connectionId, "threadPercentComplete", 0);
			ColdBooksSession.setValue(getConnectionId(), "isRunning", false);
			writelog("We errored spawning thread!");
			
			
		}
		
		
	}
	
	function handleResponseSet(xml){
		// using the XML I need to find the request
		xml = XmlParse(xml);
		// record the event for each child
		var responseMessages = xml.XMLRoot.QBXMLMsgsRs.XmlChildren;
		
		for(var x = 1 ; x <= ArrayLen(responseMessages) ; x++){
			handleResponseMessage(responseMessages[x]);
		}
	}
	
	function hasPendingMessage(){
		return getColdBooksMessageDao().connectionHasPendingRequests(getId(), true);
	}
	
	function getNextPendingMessageXml(){
		return getColdBooksMessageDao().getNextPendingMessageForConnection(getId()).getRequest();
	}
	
	function cancelPendingMessages(){
		getColdBooksMessageDao().cancelPendingMessagesForConnection(getId());
	}
	
	function recordError(error){ 
		// this message is always associated with the next incomplete message
		var Message = getColdBooksMessageDao().getNextPendingMessageForConnection(getId());
		Message.setError(error);
		getColdBooksMessageDao().saveMessage(Message);
	}
	
	function getNextPendingMessageSetXml(){
		var messages = getColdBooksMessageDao().getPendingMessagesForConnectionAsQuery(getId());
		var xml = "";
		
		for(var x = 1 ; x <= messages.recordcount ; x++){
			xml &= messages["request"][x];
		}
		
		return xml;
	}

	function getRequestCount(){
		return getColdBooksMessageDao().getRequestCountForConnection(getId());
	}

	function getPendingRequestCount(){
		return getColdBooksMessageDao().getPendingRequestCountForConnection(getId(), true);
	}
	
	function getErroredRequestCount(){
		return getColdBooksMessageDao().getErroredRequestCountForConnection(getId());
	}
		
	private function validateReturnFormat(returnFormat){
		if(returnFormat != "object" && returnFormat != "xml"){
			throw("returnFormat must be 'object' or 'xml', not #returnFormat#");
		}
	}
	
	/*function getQbObjectFactory(){
		var loader = getColdBooksJavaLoader();

		if(!Len(getCountry()) || !Len(getQbXmlMajorVersion()) || !Len(getQbXmlMinorVersion())){
			throw(message="The QuickBooks Has Not Yet Connected", detail="The quickbooks instance for the connection #getName()# has not yet connected. QuickBooks must connect at least once before ColdBooks can enqueue messages for it.");
		}

		// I've got my loader, I now need to get the object factory for this country and version
		return loader.create("com.alagad.ColdBooks.#ucase(getCountry())#.v#getSdkVersion()#.ObjectFactory");
	}*/
	
	function setPassword(password){
		// if the password provided is the same as the hash do nothing.  we didn't change the password
		if(password != getpasswordHash()){
			setpasswordHash(getHashed(password));
		}
	}
	
	function comparePassword(password){
		if(getHashed(password) == getPasswordHash()){
			return true;
		} else {
			return false;
		}
	}
	
	function getScheduledSeconds(){
		if(val(getschedulerInterval()) && len(getschedulerUnit())){
			// figure out the seconds.
			if(getschedulerUnit() == "Hours"){
				// hours
				return getschedulerInterval() * 60 * 60;
			} else {
				// minutes
				return getschedulerInterval() * 60;
			}
		} else {
			// nothing scheduled
			return "";
		}
	}
	
	private function getHashed(password){
		return hash("This is my salt, how does it taste?" & password);
	}
	
	private function getQbOwnerId(){
		return "{" & left(getConnectionId(), 23) & "-" & right(getConnectionId(), 12) & "}";
	}
	
	private function getQbFileId(){
		return "{" & left(getFileId(), 23) & "-" & right(getFileId(), 12) & "}";
	}
	
	private function getQbPersonalDataPref(){
		if(getPersonalDataPref() == "notNeeded"){
			return "pdpNotNeeded";
		} else if(getPersonalDataPref() == "optional"){
			return "pdpOptional";			
		} else if(getPersonalDataPref() == "required"){
			return "pdpRequired";		
		} 
	}
		
	/// *** QBXML STUFF *** ///
	private function getQbSchedulerXml(){
		if(len(getSchedulerInterval()) && len(getSchedulerUnit())) {
			if(getSchedulerUnit() == "minutes"){
				return "	<Scheduler>
		<RunEveryNMinutes>#getSchedulerInterval()#</RunEveryNMinutes> 
	</Scheduler>";
			} else {
				return "	<Scheduler>
		<RunEveryNSeconds>#getSchedulerInterval()#</RunEveryNSeconds> 
	</Scheduler>";
			}
		} else {
			return "";
		}
	}
	
	function getQwsXml(){
		return "<?xml version=""1.0""?>
<QBWCXML> 
	<AppName>#getName()#</AppName> 
	<AppID></AppID> 
	<AppURL>#getWebServiceUrl()#</AppURL> 
	<AppDescription>#getDescription()#</AppDescription>
	<AppSupport>#getSupportUrl()#</AppSupport>
	<OwnerID>#getQbOwnerId()#</OwnerID>
	<FileID>#getQbFileId()#</FileID>
	<IsReadOnly>#iif(getIsReadOnly(), De('true'), De('false'))#</IsReadOnly> 
	<PersonalDataPref>#getQbPersonalDataPref()#</PersonalDataPref>
	<QBType>QBFS</QBType> 
	#getQbSchedulerXml()#
	<Style>RPC</Style>
	<UnattendedModePref>umpRequired</UnattendedModePref>
	<UserName>#getConnectionId()#</UserName>
</QBWCXML>";
	}
	
}