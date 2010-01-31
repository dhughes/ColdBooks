<cfcomponent output="false">

	<cfset this.name = "cfadmin" />
	<cfset this.realName = "ColdBooks" />
	<cfset this.applicationTimeout = createTimeSpan(1,0,0,0) />
	<cfset this.clientManagement = false />
	<cfset this.loginStorage = "session" />
	<cfset this.sessionManagement = true />
	<cfset this.sessionTimeout = createTimeSpan(0,0,30,0) />
	<cfset this.setClientCookies = false />
	<cfset this.setDomainCookies = false />
	<cfset this.scriptProtect = false />
	<!---<cfset this.debug = true />--->
		
	<cfset this.mapRoot = expandPath("/CFIDE/administrator/ColdBooks") />
	
	<!---// Create all necessary per-application mappings //--->
	<cfset this.mappings = structNew() />
	<cfset this.mappings["/ColdBooks"] = this.mapRoot />
	<cfset this.mappings["/coldspring"] = this.mapRoot & "/coldspring" />
	<cfset this.mappings["/modelglue"] = this.mapRoot & "/modelglue" />

	<cffunction name="databaseExists" access="private">
		<cftry>
			<!--- this query will insure the datasource and database exist --->
			<cfquery name="test" datasource="ColdBooksData">
				SELECT * FROM SYS.SYSTABLES
			</cfquery>
			<cfreturn true />
			<cfcatch>
				<cfreturn false />
			</cfcatch>
		</cftry>
	</cffunction>

	<cffunction name="onApplicationStart" returnType="boolean" output="false">
		<cfreturn true>
	</cffunction>

	<cffunction name="onApplicationEnd" returnType="void" output="false">
		<cfargument name="applicationScope" required="true" />
	</cffunction>

	<cffunction name="onSessionStart" returnType="void" output="false">
		
		<!---// Set flag letting MG know it needs to broadcast onSessionStart before onRequestStart //--->
		<cfset request._modelglue.bootstrap.sessionStart = true />

	</cffunction>

	<cffunction name="onSessionEnd" returnType="void" output="false">
		<cfargument name="sessionScope" type="struct" required="true" />
		<cfargument name="appScope" type="struct" required="false" />

		<cfset invokeSessionEvent( "modelglue.onSessionEnd", arguments.sessionScope, arguments.appScope ) />
	</cffunction>

	<cffunction name="onRequestStart" returnType="boolean" output="false">
		<cfargument name="thePage" type="string" required="true" />

		<!--- check to see if the DB exists --->
		<cfif NOT databaseExists()>
			<cfset initializeDatabase() />
			<!--- db should exist now.  Now we need to reload the app to get it to pickup our ORM settings --->
			<cflocation url="#cgi.script_name#?init=true" addtoken="false" />
		</cfif>

		<!---// Reload app and session if requested //--->
		<cfif structKeyExists( url, "init" ) AND url.init EQ "true" >
		
			<!---<cfif this.debug >
				<cflog file="#this.realName#" text="Reloading Application" />
			</cfif>--->

			<cfparam name="request.init" default="reloaded" />
			<cflock scope="application" timeout="10">
				<!--- <cfset structClear(session) /> --->
				<cfset structClear( application ) />
				<cfset onApplicationStart() />
				<cfset initializeBeanFactory() />
			</cflock>
		<cfelseif NOT structKeyExists( application, "cs" ) >
			<cflock scope="application" timeout="10">
				<cfset initializeBeanFactory() />
			</cflock>
		</cfif>

		<!---// Necessary code to determine if a cfc is being requested and
				remove the onRequest function from this currently running process,
				otherwise a blank page gets returned and no error thrown //--->
		<cfif listLast( arguments.thePage, "." ) EQ "cfc" OR isSOAPRequest() >
			<!--- Suppress debug output, especially for remote service calls, since debug output will destroy JSON or XML validity. --->
			<cfsetting showdebugoutput="false" />
			<cfset StructDelete( THIS, "OnRequest" ) />
		</cfif>

		<cfreturn true>
	</cffunction>

	<cffunction name="onRequest" returnType="void">
		<cfargument name="thePage" type="string" required="true" /><cfsilent>
		</cfsilent><cfinclude template="#arguments.thePage#">
	</cffunction>

	<cffunction name="onRequestEnd" returnType="void" output="false">
		<cfargument name="thePage" type="string" required="true" />

		<!---// Cleanup any persisting variables //--->
		<cfset structClear(variables) />
	</cffunction>

	<cffunction name="onMissingTemplate" returnType="boolean">
	    <cfargument type="string" name="thePage" required="true" />
	    <cfreturn true />
	</cffunction>

	<!---// -------------------------------------------------- //--->

	<cffunction name="initializeDatabase" output="false" access="private">
		<cfset var dataDir = server.coldfusion.rootDir & "/ColdBooksData" />
		
		<cfapplication name="cfadmin" />
		
		<cfif NOT databaseExists()>
			<cflock type="exclusive" timeout="30">
				<cfif NOT databaseExists()>
					
					<!--- if the database directory doesn't already exist, copy the template over --->
					<cfif NOT directoryExists(dataDir)>
						<cfzip 
					    	action="unzip" 
					    	destination="#server.coldfusion.rootDir#" 
					    	file="#expandPath("templateDB.zip")#" 
					    	recurse="yes" />
					</cfif>
					
					<cfset CreateObject("component", "CFIDE.adminapi.datasource").setDerbyEmbedded(
						name="ColdBooksData",
						database=dataDir
					) />
				</cfif>
			</cflock>
 		</cfif>
	</cffunction>
	
	<!---<cffunction name="databaseExists" output="false" access="private">
		<cfset var dataDir = server.coldfusion.rootDir & "/ColdBooksData" />
		<cfreturn ListFind(StructKeyList(CreateObject("component", "CFIDE.adminapi.datasource").getDatasources()), "ColdBooksData") IS NOT 0
			AND directoryExists(dataDir) />  
	</cffunction>--->

	<cffunction name="initializeBeanFactory" output="false" access="private">
	
		<!---// clear any previous references to ColdSpring //--->
		<cfset structDelete( application, "cs" ) />
		<cfset structDelete( application, "coldspring.beanfactory.root" ) />
	
		<!---// define and load a new instance of ColdSpring //--->
		<cfset application.cs = createObject( "component" , "coldspring.beans.DefaultXmlBeanFactory" ).init() />
		<cfset application.cs.loadBeansFromXmlFile( expandPath("/ColdBooks/config/coldspring.ColdBooks.xml"), true ) />
		
		<!---<cfif this.debug >
			<cflog file="#this.realName#" text="Reloading ColdSpring Bean Factory" />
		</cfif>--->
		
		<!---// does model-glue exist? if so reset the reference to the parent bean factory //--->
		<cfif structKeyExists( application, this.realName ) AND structKeyExists( application[this.realName], "framework" ) >
			<cfset application[this.realName].framework.getBeanFactory().setParent( application.cs ) />
		</cfif>

	</cffunction>

	<cffunction name="invokeSessionEvent" output="false" access="private">
		<cfargument name="eventName" type="string" required="true" />
		<cfargument name="sessionScope" type="struct" required="true" />
		<cfargument name="appScope" type="struct" required="false" />
	
		<cfset var MGInstances = createObject( "component", "ModelGlue.Util.ModelGlueFrameworkLocator" ).findInScope( arguments.appScope ) />
		<cfset var values = structNew() />
		<cfset var i = "" />
	
		<cfset values.sessionScope = arguments.sessionScope />
	
		<cfloop from="1" to="#arrayLen( MGInstances )#" index="i">
			<cfset MGInstances[ i ].executeEvent( arguments.eventName, values ) />
		</cfloop>
	</cffunction>

</cfcomponent>