<cfcomponent output="false" extends="ModelGlue.gesture.eventrequest.phase.ModuleLoadingRequestPhase"
						 hint="Represents the beginning of the Model-Glue lifecycle.  Execution only does work when Model-Glue is not initialized."
>
	
<cfset this.name = "Initialization" />
	
<cffunction name="execute" returntype="void" output="false" hint="Executes the request phase.">
	<cfargument name="eventContext" hint="I am the event context to act upon.  Duck typed for speed.  Should have no queued events when execute() is called, but this isn't checked (to save time)." />
	
	<cfset var modelglue = arguments.eventContext.getModelGlue() />
	<cfset var event = "" />
	
	<!--- Only do anything if this is a initialization request. --->
	<cfif request._modelglue.bootstrap.initializationRequest>
		<!--- 
			Before event queue runs, we need to load any configured modules.
		--->
		
		<cfset loadModules(modelglue) />
		
		<!--- Add the newly loaded event to the queue. --->
		<cfset event =  modelglue.getEventHandler("modelglue.onApplicationInitialization") />
		<cfset arguments.eventContext.addEventHandler(event) />
		
		<!--- Tell the context to run its queue. --->
		<cfset arguments.eventContext.executeEventQueue() />
	
		<cfset event =  modelglue.getEventHandler("modelglue.onApplicationStoredInScope") />
		<cfset arguments.eventContext.addEventHandler(event) />
	</cfif>	
</cffunction>

</cfcomponent>