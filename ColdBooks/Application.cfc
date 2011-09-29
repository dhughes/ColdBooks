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
	<cfset this.mappings["/validat"] = this.mapRoot & "/validat" />
	<cfset this.mappings["/ram"] = "ram:///" />

	<cfset this.administrator = new CFIDE.adminapi.administrator() />
	<cfset this.datasource = new CFIDE.adminapi.datasource() />

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

	<cffunction name="databaseIsEmbedded" access="private">
		<cfset var ColdBooksData = this.datasource.getDatasources("ColdBooksData") />
		<cfreturn coldbooksdata.driver IS "Apache Derby Embedded" />
	</cffunction>

	<cffunction name="migrateToStandAlone" access="private">
		<!--- first, delete the existing DSN --->

		<cfset var ColdBooksData = this.datasource.getDatasources("ColdBooksData") />
		<cfset this.datasource.deleteDatasource("ColdBooksData") />

		<!--- now initialize the Database. this will not overwrite the existing DB --->
		<cfset initializeDatabase() />

	</cffunction>

	<cffunction name="startDerby" access="public">
		<cfset var ip = [127,0,0,1] />
		<cfset var ba = javaCast('byte[]', ip) />
		<cfset var inetAddress = createObject('java', 'java.net.Inet4Address').getByAddress(ba) />
		<cfset var nsc = createObject('java', 'org.apache.derby.drda.NetworkServerControl').init(inetAddress, '1527') />
		<!--- <cfdump var="#nsc#" output="console" />--->

		<cftry>
			<!--- try to ping the server.  If that fails, start it --->
			<cfset nsc.ping() />
			<!--- <cflog text="Derby is running" /> --->
			<cfcatch>
				<cflog text="Starting Derby" />
				<cfset nsc.start(javacast('null', '')) />
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

		<!--- insure derby is running in network mode --->
		<cfset startDerby() />

		<!--- are we logged into the CF admin? --->
		<cfif IsUserLoggedIn()>
			<!--- check to see if the DB exists --->
			<cfif NOT databaseExists()>
				<cfset initializeDatabase() />
				<!--- db should exist now.  Now we need to reload the app to get it to pickup our ORM settings --->
				<cflocation url="#cgi.script_name#?init=true" addtoken="false" />

			<!--- important info: previous versions (< 42) of ColdBooks used derby embedded.
				I'm changing the code to use derby client. If we already have an existing DSN
				for ColdBooksData we're going to see what DSN type it is and migrate to stand alone if need be.
			--->
			<!--- the DB exists. check to see if it is embedded rather than stand alone --->
			<cfelseif databaseIsEmbedded()>
				<!--- migrate the DB to be stand alone --->
				<cfset migrateToStandAlone() />

                <cflocation url="#cgi.script_name#?init=true" addtoken="false" />
			</cfif>

			
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
					
					<cfset CreateObject("component", "CFIDE.adminapi.datasource").setOther(
						name="ColdBooksData",
						url="jdbc:derby://127.0.0.1:1527/#dataDir#",
						class="org.apache.derby.jdbc.ClientDriver",
						driver="org.apache.derby.jdbc.ClientDriver",
						buffer=1048576,
						blob_buffer=1048576
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

		<!--- run any migrations we may have --->
		<cfset application.cs.getBean("ColdBooksMigrator").migrate() />

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