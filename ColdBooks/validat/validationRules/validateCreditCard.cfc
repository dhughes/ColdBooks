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
	displayname="validateCreditCard"
	output="false"
	hint="Credit Card string validation rule."
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateCreditCard"
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
	
		description:	Check to see if the data value contains only alpha characters ( A-Z, a-z ).
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if the data value contains a valid credit card number.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />

		<!--- setup temporary variables --->
		<cfset var cardType = "" />
		<cfset var cardNumber = "" />
		<cfset var checksum = 0 />
		<cfset var digit = 0 />

		<!--- credit card regex validation strings --->
		<cfset var regex = structNew() />
		
		<!--- American Express: length 15, prefix 34 or 37. --->
		<cfset regex.AMEX = "^3[47]\d{13}$" />
		
		<!--- [CANNOT VERIFY] Carte Blanche: length 14, prefix 300 to 305, 36, or 380 to 388. --->
		<!--- <cfset regex.CarteBlanche = "^(389)[0-9]\d{11}$" /> --->
		
		<!--- Diner: length 14, prefix 300 to 305, 36, or 55 (length: 16). --->
		<cfset regex.Diner = "(^(30)[0-5]\d{11}$)|(^(36)\d{12}$)|(^(55)\d{14}$)" />
		
		<!--- Discover: length 16, prefix 6011 or 65. --->
		<cfset regex.Discover = "(^(6011)\d{12}$)|(^(65)\d{14}$)" />
		
		<!--- [CANNOT VERIFY] EnRoute: length 15, prefix 2014 or 2149. --->
		<!--- <cfset regex.EnRoute = "(^(2014)|^(2149))\d{11}$" /> --->

		<!--- [CANNOT VERIFY] JCB: prefix 35 (length: 16) or 1800 or 2131 (length: 15). --->
		<!--- <cfset regex.JCB = "(^(35)\d{13}$)|(^(1800)|^(2131)\d{11}$)" /> --->

		<!--- [CANNOT VERIFY]  Maestro: length 13 to 20, prefix 50, 56 to 58, or 6. Overlap of Discover, Solo and Switch is handled and NOT matched. --->
		<!--- <cfset regex.Maestro = "(^(5[0678])\d{11,18}$) |(^(6[^0357])\d{11,18}$) |(^(601)[^1]\d{9,16}$) |(^(6011)\d{9,11}$) |(^(6011)\d{13,16}$) |(^(65)\d{11,13}$) |(^(65)\d{15,18}$) |(^(633)[^34](\d{9,16}$)) |(^(6333)[0-4](\d{8,10}$)) |(^(6333)[0-4](\d{12}$)) |(^(6333)[0-4](\d{15}$)) |(^(6333)[5-9](\d{8,10}$)) |(^(6333)[5-9](\d{12}$)) |(^(6333)[5-9](\d{15}$)) |(^(6334)[0-4](\d{8,10}$)) |(^(6334)[0-4](\d{12}$)) |(^(6334)[0-4](\d{15}$)) |(^(67)[^(59)](\d{9,16}$)) |(^(6759)](\d{9,11}$)) |(^(6759)](\d{13}$)) |(^(6759)](\d{16}$)) |(^(67)[^(67)](\d{9,16}$)) |(^(6767)](\d{9,11}$)) |(^(6767)](\d{13}$)) |(^(6767)](\d{16}$))" /> --->

		<!--- Mastercard: length 16, prefix 51 to 55. --->
		<cfset regex.MasterCard = "^5[1-5]\d{14}" /> 

		<!--- Solo: length 16, 18, or 19, prefix 63345 to 63349 or 6767. --->
		<cfset regex.Solo = "(^(6334)[5-9](\d{11}$|\d{13,14}$))|(^(6767)(\d{12}$|\d{14,15}$))" /> 

		<!--- [CANNOT VERIFY]  Switch: length 16 18, or 19, prefix 490302 to 490309 or 490335 to 490339 or 491101 to 491102 or 491174 to 491179 or 491180 to 491182 or 49118 or 564182 or 63330 to 63334 or 6759. --->
		<!--- <cfset regex.Switch = "(^(49030)[2-9](\d{10}$|\d{12,13}$)) |(^(49033)[5-9](\d{10}$|\d{12,13}$)) |(^(49110)[1-2](\d{10}$|\d{12,13}$)) |(^(49117)[4-9](\d{10}$|\d{12,13}$)) |(^(49118)[0-2](\d{10}$|\d{12,13}$)) |(^(4936)(\d{12}$|\d{14,15}$)) |(^(564182)(\d{11}$|\d{13,14}$)) |(^(6333)[0-4](\d{11}$|\d{13,14}$)) |(^(6759)(\d{12}$|\d{14,15}$))" />  --->

		<!--- Visa: length 13 or 16, prefix 4. --->
		<cfset regex.VISA = "(^4\d{12}$)|(^4[0-8]\d{14}$)|(^(49)[^013]\d{13}$)|(^(49030)[0-1]\d{10}$)|(^(49033)[0-4]\d{10}$)|(^(49110)[^12]\d{10}$)|(^(49117)[0-3]\d{10}$)|(^(49118)[^0-2]\d{10}$)|(^(493)[^6]\d{12}$)" />

		<!--- default the arguments if they are not provided --->
		<!--- <cfparam name="arguments.args.validTypes" default="AMEX,CarteBlanche,Diner,Discover,EnRoute,JCB,Maestro,MasterCard,Solo,Switch,VISA" /> --->
		<cfparam name="arguments.args.validTypes" default="AMEX,Diner,Discover,MasterCard,Solo,VISA" />
		
		<!--- check to see if the data value represents a simple string value --->
		<cfif NOT isSimpleValue( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validateCreditCard' only accepts simple data types." />
		</cfif>
		
		<!--- remove all non-numeric characters for validation --->
		<cfset cardNumber = reReplace( arguments.data, '[^0-9]', '', 'all' ) />
		
		<!--- validate cardNumber --->
		<cfif reFind( regex.AMEX, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'AMEX' ) >
			<cfset cardType = 'AMEX' />
		<!--- <cfelseif reFind( regex.CarteBlanche, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'CarteBlanche' ) >
			<cfset cardType = 'CarteBlanche' /> --->
		<cfelseif reFind( regex.Diner, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'Diner' ) >
			<cfset cardType = 'Diner' />
		<cfelseif reFind( regex.Discover, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'Discover' ) >
			<cfset cardType = 'Discover' />
		<!--- <cfelseif reFind( regex.EnRoute, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'EnRoute' ) >
			<cfset cardType = 'EnRoute' /> --->
		<!--- <cfelseif reFind( regex.JCB, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'JCB' ) >
			<cfset cardType = 'JCB' /> --->
		<!--- <cfelseif reFind( regex.Maestro, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'Maestro' ) >
			<cfset cardType = 'Maestro' /> --->
		<cfelseif reFind( regex.MasterCard, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'MasterCard' ) >
			<cfset cardType = 'MasterCard' />
		<cfelseif reFind( regex.Solo, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'Solo' ) >
			<cfset cardType = 'Solo' />
		<!--- <cfelseif reFind( regex.Switch, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'Switch' ) >
			<cfset cardType = 'Switch' /> --->
		<cfelseif reFind( regex.VISA, cardNumber ) AND listFindNoCase( arguments.args.validTypes, 'VISA' ) >
			<cfset cardType = 'VISA' />
		<cfelse>
			<cfreturn "invalid" />
		</cfif>

		<!--- checksum ("Mod 10") --->
		<!--- add even digits in even length strings or odd digits in odd length strings --->
		<cfloop from="#2 - (len(cardNumber) MOD 2)#" to="#len(cardNumber)#" step="2" index="digit">
			<cfset checksum = checksum + mid(cardNumber, digit, 1) />
		</cfloop>
		<!--- analyze odd digits in even length strings or even digits in odd length strings. --->
		<cfloop from="#1 + (len(cardNumber) MOD 2)#" to="#len(cardNumber)#" step="2" index="digit">
			<cfif ( mid(cardNumber, digit, 1) * 2 ) LT 10 >
				<cfset checksum = checksum + ( mid(cardNumber, digit, 1) * 2 ) />
			<cfelse>
				<cfset checksum = checksum + ( mid(cardNumber, digit, 1) * 2 ) - 9 />
			</cfif>
		</cfloop>
		<cfif ( checksum MOD 10 ) NEQ 0 >
			<cfreturn "invalid" />
		</cfif>

		<cfreturn "true" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>