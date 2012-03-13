<cfcomponent output="false" hint="I am a Model-Glue controller." extends="ModelGlue.gesture.controller.Controller">

	<cffunction name="init" access="public" output="false" hint="Constructor">
		<cfargument name="framework" />
		
		<cfset super.init(framework) />
		
		<cfreturn this />
	</cffunction>
	
	<!---<cffunction name="ConfigureColdBooks">
		<cfargument name="event" />
		
		<cfset beans.ColdBooksConfigurationService.configure() />

	</cffunction>--->

	<cffunction name="getErrorReport">
		<cfargument name="event" />
		<cfset event.setValue("errorReport", beans.ColdBooksConnectionService.getErrorReport(event.getValue("id"))) />
	</cffunction>

	<cffunction name="ZipAndSendDatabase">
		<cfargument name="event" />

		<cfset beans.ColdBooksConnectionService.zipDatabase() />
		<cflocation url="/CFIDE/administrator/ColdBooks/ColdBooksData.zip" />

	</cffunction>

	<cffunction name="InsureLoggedIntoCFAdmin">
		<cfargument name="event" />
		
		<cfif NOT beans.ColdBooksSecurityService.loggedIntoCFAdmin()>
			<!--- yea, I'm redirecting in a controller.  Deal with it --->
			<cflocation url="/CFIDE/administrator" addtoken="false" />
		</cfif>

	</cffunction>
	
	<cffunction name="SaveConnection">
		<cfargument name="event" />
		
		<cfset var result = beans.ColdBooksConnectionService.saveConnection( event.getAllValues() ) />
		
		<cfif result._errorCount>
			<cfset event.setValue("errors", result) />
			<cfset event.addResult("invalid") />
		<cfelse>
			<cfset event.addResult("saved") />
		</cfif>
		
	</cffunction>

	<cffunction name="ListConnections">
		<cfargument name="event" />

		<cfset event.setValue("connections", beans.ColdBooksConnectionService.listConnections()) />

	</cffunction>

	<cffunction name="getDbType">
		<cfargument name="event" />

		<cfset event.setValue("dbType", beans.ColdBooksDbConfig.GetConfigSetting("dbType")) />

	</cffunction>



	
	<cffunction name="DeleteConnection">
		<cfargument name="event" />
		
		<cfset beans.ColdBooksConnectionService.deleteConnection( event.getValue("id") ) />
		
	</cffunction>
	
	<cffunction name="GetConnection">
		<cfargument name="event" />
		
		<cfif val(event.getValue("id"))>
			<cfset event.setValue("Connection", beans.ColdBooksConnectionService.loadConnection( event.getValue("id") )) />
		<cfelse>
			<cfset event.setValue("Connection", beans.ColdBooksConnectionService.newConnection()) />
		</cfif>
		
	</cffunction>
	
	<cffunction name="GetQwsXml">
		<cfargument name="event" />
		
		<cfset event.setValue("qwsXml", beans.ColdBooksConnectionService.getQwsXml( event.getValue("id") )) />
	</cffunction>
	
	<cffunction name="GetLogRecord">
		<cfargument name="event" />
		
		<cfset event.setValue("message", beans.ColdBooksMessageService.loadMessage( event.getValue("id") )) />
	</cffunction>
	
	
	
</cfcomponent>
	
