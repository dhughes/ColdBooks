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
	displayname="validateState"
	output="false"
	hint="US and Canada state/provice validation rule."
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateState"
		hint="The default constructor for the validator rule, returning the initialized validator rule instance">

		<!--- call the base constructor --->
		<cfset super.init() />
		
		<!--- a list of common strings and abbreviations for U.S. --->
		<cfset variables.instance.USStrings = "United States,United States of America,US,USA,U.S.,U.S.A." />
		
		<!--- a list of common U.S. state names --->
		<cfset variables.instance.USStateStrings = "ALABAMA,ALASKA,AMERICAN SAMOA,ARIZONA,ARKANSAS,CALIFORNIA,COLORADO,CONNECTICUT,DELAWARE,DISTRICT OF COLUMBIA,FEDERATED STATES OF MICRONESIA,FLORIDA,GEORGIA,GUAM,HAWAII,IDAHO,ILLINOIS,INDIANA,IOWA,KANSAS,KENTUCKY,LOUISIANA,MAINE,MARSHALL ISLANDS,MARYLAND,MASSACHUSETTS,MICHIGAN,MINNESOTA,MISSISSIPPI,MISSOURI,MONTANA,NEBRASKA,NEVADA,NEW HAMPSHIRE,NEW JERSEY,NEW MEXICO,NEW YORK,NORTH CAROLINA,NORTH DAKOTA,NORTHERN MARIANA ISLANDS,OHIO,OKLAHOMA,OREGON,PALAU,PENNSYLVANIA,PUERTO RICO,RHODE ISLAND,SOUTH CAROLINA,SOUTH DAKOTA,TENNESSEE,TEXAS,UTAH,VERMONT,VIRGIN ISLANDS,VIRGINIA,WASHINGTON,WEST VIRGINIA,WISCONSIN,WYOMING" />
		
		<!--- a list of common U.S. state abbreviations --->
		<cfset variables.instance.USStateAbbrStrings = "AL,AK,AS,AZ,AR,CA,CO,CT,DE,DC,FM,FL,GA,GU,HI,ID,IL,IN,IA,KS,KY,LA,ME,MH,MD,MA,MI,MN,MS,MO,MT,NE,NV,NH,NJ,NM,NY,NC,ND,MP,OH,OK,OR,PW,PA,PR,RI,SC,SD,TN,TX,UT,VT,VI,VA,WA,WV,WI,WY" />
		
		<!--- a list of common strings and abbreviations for Canada --->
		<cfset variables.instance.CAStrings = "Canada,CA,C.A." />

		<!--- a list of common Canadian province names --->
		<cfset variables.instance.CAStateStrings = "Alberta,British Columbia,Manitoba,New Brunswick,Newfoundland and Labrador,Northwest Territories,Nova Scotia,Nunavut,Ontario,Prince Edward Island,Quebec,Saskatchewan,Yukon" />

		<!--- a list of common Canadian province abbreviaions --->
		<cfset variables.instance.CAStateAbbrStrings = "AB,BC,MB,NB,NL,NT,NS,NU,ON,PE,QC,SK,YT" />

		<!--- return the initialized validatoin rule --->
		<cfreturn this />	
	</cffunction> <!--- end: init() --->
	
	<!--- ------------------------------------------------------------ --->
	<!--- public methods --->

	<!--- 
		function: 		validate
	
		description:	Based upon the value for the country dependency, check if the data value (state) is required and valid.
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Based upon the value for the country dependency, check if the data value (state) is required and valid.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />
		
		<!--- check to see if the data value represents a simple string value --->
		<cfif NOT isSimpleValue( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validateState' only accepts simple data types." />
		</cfif>
		
		<!--- check to see if country was provided in the dependencies collection --->
		<cfif NOT structKeyExists( arguments.dependencies, 'country' ) >
			<cfthrow type="validat.missingDependency" message="validat: The validation rule 'validateState' depends upon a country value which was not received." />
		</cfif>
		
		<!--- if the country value matches a U.S. string --->
		<cfif listFindNoCase( variables.instance.USStrings, arguments.dependencies.country ) >
		
			<!--- the state field is required --->
			<cfif NOT len(trim(arguments.data)) >
				<cfreturn required />
			</cfif>
			
			<!--- the state field must be a valid U.S. state --->
			<cfif NOT ( listFindNoCase( variables.instance.USStateAbbrStrings, arguments.data ) OR listFindNoCase( variables.instance.USStateStrings, arguments.data ) ) >
				<cfreturn "invalid" />
 			</cfif>
		
		<!--- if the country value matches a Canadian string --->
		<cfelseif listFindNoCase( variables.instance.CAStrings, arguments.dependencies.country ) >
		
			<!--- the state field is required --->
			<cfif NOT len(trim(arguments.data)) >
				<cfreturn "required" />
			</cfif>
			
			<!--- the state field must be a valid U.S. state --->
			<cfif NOT ( listFindNoCase( variables.instance.CAStateAbbrStrings, arguments.data ) OR listFindNoCase( variables.instance.CAStateStrings, arguments.data ) ) >
				<cfreturn "invalid" />
 			</cfif>
		
		</cfif>

		<cfreturn "true" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>