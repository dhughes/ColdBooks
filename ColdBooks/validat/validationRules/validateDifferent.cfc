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
	displayname="validateDifferent"
	output="false"
	hint="Different string validation rule."
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateDifferent"
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
	
		description:	Check to see if the data values are different from each other.
		
		arguments:		dataValue1 ( pointer to the first data value in the data collection )
						dataValue2 ( pointer to the second data value in the data collection )
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if the data values are different from each other.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />
		
		<!--- check to see if the data value represents a structure value --->
		<cfif NOT isStruct( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validateDifferent' only accepts a structure data type." />
		</cfif>
		
		<!--- check if data arguments were provided --->
		<cfif structKeyExists( arguments.args, 'dataValue1' ) AND structKeyExists( arguments.data, arguments.args.dataValue1 ) AND
			  structKeyExists( arguments.args, 'dataValue2' ) AND structKeyExists( arguments.data, arguments.args.dataValue2 ) >

			<!--- check if data values are different --->
			<cfif arguments.data[arguments.args.dataValue1] NEQ arguments.data[arguments.args.dataValue2] >
				<cfreturn true />
			</cfif>

		<!--- check if data structure only has two key/value pairs --->
		<cfelseif listLen( structKeyList( arguments.data ) ) >

			<!--- check if data values are different --->
			<cfif arguments.data[listFirst( structKeyList( arguments.data ) )] NEQ arguments.data[listLast( structKeyList( arguments.data ) )] >
				<cfreturn true />
			</cfif>

		</cfif> <!--- end: check if data arguments were provided --->

		<cfreturn "invalid" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>