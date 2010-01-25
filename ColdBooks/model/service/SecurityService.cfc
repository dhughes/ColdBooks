<cfcomponent>

	<cffunction name="loggedIntoCFAdmin">
	
		<!--- 
			Let me try to explain the following code:  1) ColdBooks' application name is cfadmin, the same as, well, the cfadmin.  2) because the cfadmin uses the adminapi, if you're logged into the admin, you're logged 
			into the adminapi.  3) If logged into to the cfadmin while using the same application name, the following code will work.  If not logged in, it won't.  Thus, we can tell if the user is logged into the 
			cfadmin! 
		--->
		
		<cfset adminObj = createObject("component","cfide.adminapi.administrator") />
		
		<cftry>
			<cfset adminObj.isAdminUser() />
			<cfcatch>
				<cfreturn false />
			</cfcatch>
		</cftry>
		
		<cfreturn true />
	</cffunction>

</cfcomponent>