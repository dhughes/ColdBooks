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
	displayname="validateInteger"
	output="false"
	hint="Integer number validation rule."
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateInteger"
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
	
		description:	Check to see if the data value contains only numeric characters, possibly a "-" and is between -2,147,483,648 and 2,147,483,647.
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if the data value contains only numeric characters, possibly a '-', and is between -2,147,483,648 and 2,147,483,647.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />
		
		<!--- setup temporary variables --->
		<cfset var dataValue = "" />
		
		<!--- check to see if the data value represents a simple string value --->
		<cfif NOT isSimpleValue( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validateInteger' only accepts simple data types." />
		</cfif>
		
		<!--- remove any comma seperators from the data value --->
		<cfset dataValue = replace( arguments.data, ",", "", "all") >
		
		<!--- check to see if the data value contains only numeric characters and possibly a '-'. --->
		<cfif reFind( "^-{0,1}\d+$", dataValue ) >
		
			<!--- check if the data value is between -2,147,483,648 and 2,147,483,647 --->
			<cfif dataValue GTE -2147483648 AND dataValue LTE 2147483647 >

				<cfreturn true />
			
			</cfif> <!--- end: check if the data value is between -2,147,483,648 and 2,147,483,647 --->
			
		</cfif> <!--- end: check to see if the data value contains only numeric characters and possibly a '-'. --->

		<cfreturn "invalid" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>