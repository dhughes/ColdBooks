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
	displayname="errorCollection"
	output="false"
	hint="Manages a collection of data validation errors.">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" output="false" returntype="ErrorCollection" 
		hint="The default constructor for the error collection object, returning the initialized error collection object instance">

		<!--- create container for protected instance data --->
		<cfset variables.instance = structNew() />				

		<!--- setup an empty array for storing the errors --->
		<cfset variables.instance.errors = arrayNew(1) />

		<cfreturn this />		
	</cffunction> <!--- end: init() --->

	<!--- ------------------------------------------------------------ --->
	<!--- public functions --->

	<!--- 
		function: 		hasErrors
	
		description:	Indicates if the collection or named element has any errors
	--->
	<cffunction name="hasErrors" access="public" output="false" returntype="boolean"
		hint="Indicates if the collection has any errors.">
		
		<cfargument name="dataElement" type="string" required="false" hint="the name of the data element to check if error occurred" />
		
		<!--- get the current errors --->
		<cfset var errorStruct = getErrors(argumentCollection = arguments) />
	
		<!--- return if there are any errors --->
		<cfreturn errorStruct._errorCount GT 0 />
	</cffunction> <!--- end: hasErrors() --->

	<!--- 
		function: 		addError
	
		description:	Adds a single error to the error collection.
	--->
	<cffunction name="addError" access="public" output="false" returntype="errorCollection"
		hint="Adds a single error to the error collection.">
		
		<cfargument name="dataElement" type="string" required="true" hint="the name of the data element for which the error occurred" />
		<cfargument name="dataValue" type="string" required="false" default="" hint="the value of the data element for which the error occurred" />
		<cfargument name="message" type="string" required="true" hint="the error message for the error to be added to the error collection" />
		<cfargument name="failedRule" type="string" required="false" default="" hint="the identifier for the validation rule the data element failed" />

		<!--- create a new error structure with the provided data --->
		<cfset var errorStruct = structNew() />
		<cfset errorStruct["dataElement"] = arguments.dataElement />
		<cfset errorStruct["dataValue"] = arguments.dataValue />
		<cfset errorStruct["message"] = arguments.message />
		<cfset errorStruct["rule"] = arguments.failedRule />
		
		<!--- add the error structure to the array --->
		<cfset arrayAppend(variables.instance.errors, structCopy(errorStruct) ) />		
		
		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addError() --->

	<!--- 
		function: 		append
	
		description:	Appends the errors from one error collection to the current error collection.
	--->
	<cffunction name="append" access="public" output="false" returntype="errorCollection"
		hint="Appends the errors from one error collection to the current error collection.">
		
		<cfargument name="errorCollection" type="errorCollection" required="true" hint="The error collection from which to append errors to the current error collection" />

		<cfset var dataElement = "" />
		<cfset var errorPtr = 0 />
		
		<!--- get the errors from the error collection being appended --->
		<cfset var errors = arguments.errorCollection.getErrors() />

		<!--- for each data element in the errors collection --->
		<cfloop collection="#errors#" item="dataElement">
		
			<!--- if the data element key is not '_errorCount', loop over the errors --->
			<cfif dataElement NEQ "_errorCount" >
			
				<!--- loop over the errors array --->
				<cfloop from="1" to="#arrayLen( structFind(errors, dataElement).errors )#" index="errorPtr">
				
					<!--- add each array to the current error collection --->
					<cfset addError( dataElement, structFind(errors, dataElement).value, structFind(errors, dataElement).errors[errorPtr].message, structFind(errors, dataElement).errors[errorPtr].rule ) />
				
				</cfloop>
			
			</cfif> <!--- end: if the data element key is not '_errorCount', loop over the errors --->
		
		</cfloop> <!--- end: for each data element in the errors collection --->

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: append() --->

	<!--- 
		function: 		clearErrors
	
		description:	Removes any errors stored in the error collection.
	--->
	<cffunction name="clearErrors" access="public" output="false" returntype="errorCollection"
		hint="Removes any errors stored in the error collection.">
		
		<!--- reset the errors array --->
		<cfset arrayClear( variables.instance.errors ) />
		
		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: clearErrors() --->

	<!--- 
		function: 		getErrors
	
		description:	Retrieves all of the errors in the error collection, returning a structure keyed by 
						data element name, with each key containing an array of error messages.  If a data
						element name is specified, only errors for that data element will be returned.
	--->
	<cffunction name="getErrors" access="public" output="false" returntype="struct"
		hint="Retrieves all of the errors in the error collection, returning a structure keyed by data element name, with each key containing an array of error messages.">
		
		<cfargument name="dataElement" type="string" required="false" hint="the name of the data element for which errors are to be retrieved" />

		<!--- setup a return struct, and array pointer --->
		<cfset var errorPtr = 0 />
		<cfset var resultStr = structNew() />
		<cfset var errorStruct = structNew() />

		<cfset resultStr["_errorCount"] = 0 />
		
		<!--- insert each error into the result structure --->
		<cfloop from="1" to="#arrayLen( variables.instance.errors )#" index="errorPtr">
		
			<!--- if a specific data element was not specified, or if the specified data element matches the current error data element --->
			<cfif NOT isDefined('arguments.dataElement') OR ( arguments.dataElement EQ variables.instance.errors[errorPtr].dataElement ) >
	
				<!--- if no errors for the given data element exist --->
				<cfif NOT structKeyExists( resultStr, variables.instance.errors[errorPtr].dataElement ) >
					<cfset resultStr["#variables.instance.errors[errorPtr].dataElement#"] = structNew() />
					<cfset resultStr["#variables.instance.errors[errorPtr].dataElement#"]["value"] = variables.instance.errors[errorPtr].dataValue />
					<cfset resultStr["#variables.instance.errors[errorPtr].dataElement#"]["errors"] = arrayNew(1) />
				</cfif>
				
				<!--- insert the error details --->
				<cfset errorStruct = structNew() />
				<cfset errorStruct["message"] = variables.instance.errors[errorPtr].message />
				<cfset errorStruct["rule"] = variables.instance.errors[errorPtr].rule />
				<cfset arrayAppend( resultStr[variables.instance.errors[errorPtr].dataElement].errors, errorStruct ) />
				
				<!--- increment the error count --->
				<cfset resultStr._errorCount = resultStr._errorCount + 1 />

			</cfif> <!--- end: if a specific data element was not specified, or if the specified data element matches the current error data element --->
			
		</cfloop> <!--- end: insert each error into the result structure --->
		
		<cfreturn resultStr />
	</cffunction> <!--- end: getErrors() --->

</cfcomponent>