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
	displayname="validatePhoneNumber"
	output="false"
	hint="US Phone Number validation rule."
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validatePhoneNumber"
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
	
		description:	Check to see if the data value contains a valid US phone number.
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if the data value contains a valid US phone number.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />
		
		<!--- check to see if the data value represents a simple string value --->
		<cfif NOT isSimpleValue( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validatePhoneNumber' only accepts simple data types." />
		</cfif>
		
		<!--- check to see if the data value contains a valid US phone number. --->
		<cfif reFind( "^(?:\([2-9]\d{2}\)\ ?|[2-9]\d{2}(?:\-?|\ ?))[2-9]\d{2}[- ]?\d{4}$", arguments.data ) >
		
			<!--- Number conforms to NANP A-digit and D-digit requirments (ANN-DNN-NNNN). Area Codes 001-199 are not permitted; Central 
				Office Codes 001-199 are not permitted. Format validation accepts 10-digits without delimiters, optional parens on area 
				code, and optional spaces or dashes between area code, central office code and station code. Acceptable formats include 
				2225551212, 222 555 1212, 222-555-1212, (222) 555 1212, (222) 555-1212, etc. --->

			<cfreturn true />
			
		</cfif> <!--- end: check to see if the data value contains a valid US phone number. --->

		<cfreturn "invalid" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>