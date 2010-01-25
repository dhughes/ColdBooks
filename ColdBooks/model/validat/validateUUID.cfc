<cfcomponent
	output="false"
	extends="validat.validationRules.validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateUUID"
		hint="The default constructor for the validator rule, returning the initialized validator rule instance">

		<!--- call the base constructor --->
		<cfset super.init() />
			
		<!--- return the initialized validatoin rule --->
		<cfreturn this />	
	</cffunction> <!--- end: init() --->
	
	<!--- ------------------------------------------------------------ --->
	<!--- public methods --->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if the length of the data value is between the min and max values.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />
		
		<cfif isValid("UUID", arguments.data)>
			<cfreturn true />
		</cfif>
		
		<cfreturn "invalid" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>