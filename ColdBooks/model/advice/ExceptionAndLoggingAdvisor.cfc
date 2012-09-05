<cfcomponent extends="coldspring.aop.MethodInterceptor" accessors="true">
	
	<cfproperty name="Enabled" type="any" />
	
	<cffunction name="init" access="private" returntype="void" output="false">
		<!--- do nothing --->
	</cffunction>
	
	<cffunction name="doLog" access="private">
		<cfargument name="val" />

		<cfif getEnabled()>
			<cfif isSimpleValue(val)>
				<cflog text="#val#" />
			<cfelse>
				<cfdump var="#val#" output="console" expand="false"  />
			</cfif>
		</cfif>
	</cffunction>
	
	<cffunction name="invokeMethod" access="public" returntype="any">
		<cfargument name="methodInvocation" type="coldspring.aop.MethodInvocation" required="true" />
		<cfset var result = 0 />
		<cfset var methodName = arguments.methodInvocation.getMethod().getMethodName() />
		<cfset var args = arguments.methodInvocation.getArguments() />
		<cfset var arg = 0 />
		<cfset var resultVal = "" />
		<cfset var exception = 0 />
		
		<cfset doLog(["Preparing to run method '#methodName#' with arguments...", args]) />
		
		<cftry>
			<!--- run the method and get the result, if any --->
			<cfinvoke component="#arguments.methodInvocation.getTarget()#" method="#methodName#" returnvariable="result">
				<cfloop collection="#args#" item="arg">
					<cfif StructKeyExists(args, arg)>
						<cfinvokeargument name="#arg#" value="#args[arg]#" />
					</cfif>	
				</cfloop>
			</cfinvoke>
			<cfcatch>
				<!--- catch any errors and rethrow the with much more detail! --->
				<cfset doLog(["Exception while running method '#methodName#'...", cfcatch]) />
				
				<!--- set them back into the QBWC (which I know we're wrapping) --->
				<cfif ListFindNoCase("getLastError,receiveResponseXML,sendRequestXML,closeConnection", methodName) AND (StructKeyExists(args, "ticket") OR StructKeyExists(args, "wcTicket"))>
					<!--- get the ticket --->
					<cfif StructKeyExists(args, "wcTicket")>
						<cfset var connectionId = args.wcTicket />
					<cfelse>
						<cfset var connectionId = args.ticket />
					</cfif>
				</cfif>

				<!--- try to record this message --->
				<cftry>
					<cfset arguments.methodInvocation.getTarget().setError(connectionId, cfcatch) />
					<cfcatch>
						<cflog text="#toString(cfcatch)#" />
					</cfcatch>
				</cftry>
				<cfthrow message="#cfcatch.message# | #cfcatch.detail# | #cfcatch.tagcontext[1].template# (#cfcatch.tagcontext[1].line#)" />
			</cfcatch>
		</cftry>
		
		<cfif IsDefined("result")>
			<cfset resultVal = result />
		<cfelse>
			<cfset resultVal = "<<Undefined>>" />
		</cfif>
		
		<cfset doLog(["Completed running method '#methodName#' with result...", result]) />	
		
		<cfif IsDefined("result")>
			<cfheader name="Content-Type" value="text/xml">
			<cfreturn result />
		</cfif>
	</cffunction>
	
</cfcomponent>