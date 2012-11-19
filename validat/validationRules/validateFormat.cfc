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
	displayname="validateFormat"
	output="false"
	hint="Email string validation rule."
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateFormat"
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
	
		description:	Check to see if the data value contains a syntactically valid email address.
		
		arguments:		format ( format mask to apply to the data value )
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if the data value contains a syntactically valid email address.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />
		
		<!--- setup a list of predefined masks --->
		<!---   phone: 10-digit number in the format '(xxx) xxx-xxxx' --->
		<!---   phone2: 10-digit number in the format 'xxx-xxx-xxxx' --->
		<!---   phone3: 10-digit number in the format 'xxx/xxx-xxxx' --->
		<!---   phone7: 7-digit number in the format 'xxx-xxxx' --->
		<!---   postalCode: 5 or 9 digit number in the format 'xxxxx' or 'xxxxx-xxxx' --->
		<!---   postalCode5: 5-digit number in the format 'xxxxx' --->
		<!---   postalCode9: 9-digit number in the format 'xxxxx-xxxx' --->
		<!---   ssn: 9-digit number in the format 'xxx-xx-xxxx' --->
		
		<!--- check to see if the data value represents a simple string value --->
		<cfif NOT isSimpleValue( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validateFormat' only accepts simple data types." />
		</cfif>
		
		<!--- checck to see if a format mask was provided in the arguments collection --->
		<cfif NOT structKeyExists( arguments.args, 'format' ) >
			<cfthrow type="validat.missingArgs" message="validat: The validation rule 'validateFormat' requires an argument named format that contains the data mask." />
		</cfif>
		
		<!--- validate data based upon the format mask --->
		<cfswitch expression="#lcase(arguments.args.format)#">

			<!--- predefined phone mask --->
			<cfcase value="phone">
				<cfif reFindNoCase( "^\([2-9]\d{2}\)\ [2-9]\d{2}\-\d{4}$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>
		
			<!--- predefined phone2 mask --->
			<cfcase value="phone2">
				<cfif reFindNoCase( "^[2-9]\d{2}\-[2-9]\d{2}\-\d{4}$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>

			<!--- predefined phone3 mask --->
			<cfcase value="phone3">
				<cfif reFindNoCase( "^[2-9]\d{2}\/[2-9]\d{2}\-\d{4}$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>
		
			<!--- predefined phone7 mask --->
			<cfcase value="phone7">
				<cfif reFindNoCase( "^[2-9]\d{2}\-\d{4}$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>

			<!--- predefined postalCode mask --->
			<cfcase value="postalCode">
				<cfif reFindNoCase( "^\d{5}(-\d{4})?$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>
		
			<!--- predefined postalCode5 mask --->
			<cfcase value="postalCode5">
				<cfif reFindNoCase( "^\d{5}$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>

			<!--- predefined postalCode9 mask --->
			<cfcase value="postalCode9">
				<cfif reFindNoCase( "^\d{5}-\d{4}$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>
		
			<!--- predefined ssn mask --->
			<cfcase value="ssn">
				<cfif reFindNoCase( "^\d{3}-\d{2}-\d{4}$", arguments.data ) >
					<cfreturn true /> <!--- valid --->
				</cfif>
			</cfcase>
		
			<!--- custom regular expression mask --->
			<cfdefaultcase>
				<cftry>
					<cfif reFindNoCase( "^#arguments.args.format#$", arguments.data ) >
						<cfreturn true /> <!--- valid --->
					</cfif>
					<cfcatch type="any"></cfcatch>
				</cftry>
			</cfdefaultcase>
		
		</cfswitch>

		<cfreturn "invalid" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>