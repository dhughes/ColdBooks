<!---
License:
Copyright 2007, Alagad, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Copyright: Alagad, Inc. (http://www.alagad.com)
Author: Jeff Chastain (jeff.chastain@alagad.com)
$Id$

Release: 0.1.0

--->

<cfcomponent
	displayname="validateValueInList"
	output="false"
	hint="Value in list string validation rule"
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateValueInList"
		hint="The default constructor for the validator rule, returning the initialized validator rule instance">

		<!--- call the base constructor --->
		<cfset super.init() />
			
		<!--- return the initialized validatoin rule --->
		<cfreturn this />	
	</cffunction> <!--- end: init() --->
	
	<!--- ------------------------------------------------------------ --->
	<!--- public methods --->

	<!--- 
		function: 		validate
	
		description:	Check to see if data value is a valid prefix name.
		
		arguments:		list ( common seperated list of values to search for the data value within )
						caseSensitive ( boolean value, should the search be case sensitive - default: false )
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if data value is in the specified list.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />
		
		<!--- predefined lists --->
		<cfset var namePrefix = "Mr.,Mrs.,Ms.,Dr." />
		<cfset var nameSuffix = "Jr.,Sr." />
		
		<!--- check to see if the data value represents a simple string value --->
		<cfif NOT isSimpleValue( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validateValueInList' only accepts simple data types." />
		</cfif>
		
		<!--- check to see if a list was provided in the arguments collection --->
		<cfif NOT structKeyExists( arguments.args, 'list' ) >
			<cfthrow type="validat.missingArgs" message="validat: The validation rule 'validateValueInList' requires an argument named 'list' that contains the list of values to validate the data value against." />
		</cfif>
		
		<!--- default the caseSensitive argument to false --->
		<cfparam name="arguments.args.caseSensitive" default="false" />
		
		<!--- check if the list argument is a predefined list identifier --->
		<cfswitch expression="#arguments.args.list#" >

			<!--- person name prefix list --->
			<cfcase value="namePrefix" >
				<cfset arguments.args.list = namePrefix />
			</cfcase>

			<!--- person name suffix list --->
			<cfcase value="nameSuffix" >
				<cfset arguments.args.list = nameSuffix />
			</cfcase>
			
		</cfswitch> <!--- end: check if the list argument is a predefined list identifier --->
		
		<!--- check to see if data value is in the list. --->
		<cfif arguments.args.caseSensitive IS true >

			<cfif listFind( arguments.args.list, arguments.data ) >
				<cfreturn true />
			</cfif>

		<cfelseif arguments.args.caseSensitive IS false >		

			<cfif listFindNoCase( arguments.args.list, arguments.data ) >
				<cfreturn true />
			</cfif>

		</cfif>
		
		<cfreturn "invalid" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>