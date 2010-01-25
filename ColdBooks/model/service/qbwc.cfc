<cfcomponent output="false" wsdlfile="QBWebConnectorSvc-intuit.wsdl" accessors="true">
	
	<cfproperty name="ColdBooksConnectionService" type="any" />
	<cfproperty name="ColdBooksConnectionDao" type="any" />
	<cfproperty name="ColdBooksSession" type="any" />
	<cfproperty name="ColdBooksTranslator" type="any" />
	<cfproperty name="version" type="any" />
	<cfproperty name="runAsBatch" type="boolean" />

	<cffunction name="serverVersion" access="public" returntype="Any">
		<cfreturn getVersion() />
	</cffunction>
	
	<cffunction name="clientVersion" access="public" returntype="Any">
		<cfargument name="strVersion" type="string" />
		<cfset var result = "" />
		
		<!--- this system requires the QBWC 2.0.0.116 or better --->
		<cfset var version = listToArray(strVersion, ".") />
		
		<!--- make sure the first number is at least 2 --->
		<cfif version[1] IS 1>
			<cfset result = "E: ColdBooks requires at least a QBWC version 2 later." />
		<cfelseif version[1] IS 2 AND version[2] IS 0 AND version[3] IS 0 AND version[4] LT 116>
			<cfset result = "W: You are using QBWC version #strVersion#.  ColdBooks has only been designed to work with version 2.0.0.116 or later." />
		</cfif>
		
		<cfreturn result />
	</cffunction>

	<cffunction name="authenticate" access="public" returntype="Any">
		<cfargument name="username" type="string" />
		<cfargument name="password" type="string" />
		<cfset var result = ArrayNew(1) />
		
		<!--- get the connection the user is connecting to --->
		<cfset var Connection = getColdBooksConnectionService().getConnectionByConnectionId(username) />
		
		<!--- validate this connection's password --->
		<cfif Connection.comparePassword(password)>
			<!--- we're good --->
			
			<!--- create a new connection session --->
			<cfset result[1] = getColdBooksSession().newSession(username, Connection) />
			<!--- is there work to do? --->
			<cfif connection.hasPendingMessage() AND NOT isNull(Connection.getCompanyFile())>
				<!--- use the specified file --->
				<cfset result[2] = Connection.getCompanyFile() />
			<cfelseif connection.hasPendingMessage() AND isNull(Connection.getCompanyFile())>
				<!--- use the currently open file --->
				<cfset result[2] = "" />
			<cfelse>
				<!--- nothing to do --->		
				<cfset result[2] = "none" />
			</cfif>
			<cfset result[3] = Connection.getScheduledSeconds() />
			<cfset result[4] = Connection.getScheduledSeconds() />
		<cfelse>
			<!--- we're bad --->
			
			<cfset result[1] = "" />
			<!--- nvu means this is a non valid user --->
			<cfset result[2] = "nvu" />
			<cfset result[3] = "" />
			<cfset result[4] = "" /> 
		</cfif>
		
		<!--- return the array as a Java array --->
		<cfreturn convertToJavaArray(result) />
	</cffunction>

	<cffunction name="closeConnection" access="public" returntype="Any">
		<cfargument name="ticket" type="String" />
		<cfset result = "Rock On!" />
		
		<!---<cflog text="Session Ran for: #getColdBooksSession().getDuration(ticket)# ms" />--->
		
		<cfset getColdBooksSession().deleteSession(ticket) />
		
		<cfreturn result />
	</cffunction>
	
	<cffunction name="sendRequestXML" access="public" returntype="String">
		<cfargument name="ticket" type="String" />
		<cfargument name="strHCPResponse" type="String" />
		<cfargument name="strCompanyFileName" type="String" />
		<cfargument name="qbXMLCountry" type="String" />
		<cfargument name="qbXMLMajorVers" type="Any" />
		<cfargument name="qbXMLMinorVers" type="Any" />
		<cfset var ColdBooksSession = getColdBooksSession() />
		<cfset var result = "" />
		
		<cfset var Connection = getColdBooksSession().getConnection(ticket) />
		
		<cfset Connection.setCompanyFile(strCompanyFileName) />
		<cfset Connection.setCountry(qbXMLCountry) />
		<cfset Connection.setQbXMLMajorVersion(qbXMLMajorVers) />
		<cfset Connection.setQbXMLMinorVersion(qbXMLMinorVers) />
		<cfset Connection.setLastConnectionDateTime(now()) />
		<cfset ColdBooksConnectionDao.saveConnection(Connection) />
		
		<!--- on the first request, QuickBooks volunteers some information --->
		<!--- because this code is essentially asynchronous, I can't find a use for this and I've commented it out
		<cfif Len(strHCPResponse)>
			<cfset var Objects = getColdBooksTranslator().toObjects(strHCPResponse, qbXMLCountry, qbXMLMajorVers, qbXMLMinorVers) />
			<cfdump var="#Objects#" output="console">
		</cfif> --->
		
		<cfif getrunAsBatch() AND NOT ColdBooksSession.getOverrideBatch(ticket)>
			<cfset var xml = Connection.getNextPendingMessageSetXml() />
		<cfelse>
			<cfset var xml = Connection.getNextPendingMessageXml() />
		</cfif>
		
		<cfreturn Connection.wrapXmlRequests(xml) />
	</cffunction>
	
	<cffunction name="receiveResponseXML" access="public" returntype="Any">
		<cfargument name="wcTicket" type="String" />
		<cfargument name="response" type="String" />
		<cfargument name="hresult" type="String" />
		<cfargument name="message" type="String" />
		<cfset var ColdBooksSession = getColdBooksSession() />
		<cfset var Connection = ColdBooksSession.getConnection(wcTicket) />
		<cfset var totalRequests = ColdBooksSession.getTotalRequests(wcTicket) />
		
		<!--- is the response an error message? --->
		<cfif NOT Len(response)>
			<!---
				We had an error from Quickbooks.  Sadly, if we're running batches and not individual transactions
				then QB doesn't tell us which specific message was the problem.  In this case we're going to shut
				off batch mode temporarily and rerun each transaction individually.
			--->
			<!--- check to see if we're in batch mode --->
			<cfif getRunAsBatch() AND NOT ColdBooksSession.getOverrideBatch(wcTicket)>
				<cflog text="There was an error running the batch.  We'll retry the transactions individually.: Hresult: #hresult#, Message: #message#." />
				<cfset ColdBooksSession.setOverrideBatch(wcTicket, true) />
			<cfelse>
				<!--- the first transaction failed, we need to log an error --->
				<cfset connection.recordError(hresult & " " & message) />

				<!--- we can now switch back to batch processing, if configured to do so --->
				<cfif getRunAsBatch()>
					<!--- turn off the individual running for the rest of the batch --->
					<cfset ColdBooksSession.setOverrideBatch(wcTicket, false) />
				</cfif>
			</cfif>
		<cfelse>
			<!--- no errors --->
			<!--- handle the response (IE, make cfc callback, record the response, etc) ---> 
			<cfif getrunAsBatch()>
				<cfset Connection.handleResponseSet(response) />
			<cfelse>
				<cfset Connection.handleResponse(response) />
			</cfif>
		</cfif>
		
		<cfset var pendingRequests = Connection.getPendingRequestCount() />
		
		<cfreturn JavaCast("int", 100 - round((pendingRequests/totalRequests)*100)) />
	</cffunction>
	
	<cffunction name="getLastError" access="public" returntype="Any">
		<cfargument name="ticket" type="String" />
		<cfset var error = getColdBooksSession().getError(ticket) />
		<cfreturn "#error.message# | #error.detail# | #error.tagcontext[1].template# (#error.tagcontext[1].line#)" />
	</cffunction>
	
	<cffunction name="convertToJavaArray" access="private">
		<cfargument name="array">
		<cfset var objStringClass = CreateObject("java", "java.lang.String").GetClass() />
		<cfset var objReflect = CreateObject("java", "java.lang.reflect.Array") />
		<cfset var arrJavaValue = objReflect.NewInstance(objStringClass, JavaCast( "int", ArrayLen(arguments.array) )) />
		<cfset var x = 0 />
		
		<cfloop from="1" to="#ArrayLen(arguments.array)#" index="x">
			<cfset objReflect.Set(arrJavaValue, JavaCast( "int", x-1 ), JavaCast( "string", arguments.array[x] ) ) />
		</cfloop>
		
		<cfreturn arrJavaValue/>
	</cffunction>
	
	<cffunction name="setError" access="public" hint="In the case that something in this component throws an error, something out (advice) can catch it and set it back in here to associate with the session. This will allow it to be reported back to the QBWC">
		<cfargument name="connectionId" type="String" />
		<cfargument name="error" type="String" />
		<cfset getColdBooksSession().setError(connectionId, error) />		
	</cffunction>

</cfcomponent>