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
	displayname="validateDate"
	output="false"
	hint="Date validation rule."
	extends="validator">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="validateDate"
		hint="The default constructor for the validator rule, returning the initialized validator rule instance">

		<!--- call the base constructor --->
		<cfset super.init() />
			
		<!--- return the initialized validatoin rule --->
		<cfreturn this />	
	</cffunction> <!--- end: init() --->
	
	<!--- ------------------------------------------------------------ --->
	<!--- public methods --->

	<!--- 
		function:		validate
	
		description:	Check to see if the data value is a valid date.
		
		arguments:		mask ( the string mask by which to parse the date string  )
	--->
	<cffunction name="validate" access="public" output="false" returntype="string"
		hint="Check to see if the data value is a valid date.">

		<cfargument name="data" type="any" required="true" hint="The data to be validated" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="The addtional arguments necessary to validate the data" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="The additional dependencies necessary to validate the data" />

		<!--- date mask rules:
				Letter	Date or Time Component	Presentation		Examples
				G		Era designator 			Text 				AD
				y 		Year 					Year 				1996; 96
				M 		Month in year 			Month 				July; Jul; 07
				w 		Week in year 			Number 				27
				W 		Week in month 			Number 				2
				D 		Day in year 			Number 				189
				d 		Day in month 			Number 				10
				F 		Day of week in month 	Number 				2
				E 		Day in week 			Text 				Tuesday; Tue
				a 		Am/pm marker 			Text 				PM
				H 		Hour in day (0-23) 		Number 				0
				k 		Hour in day (1-24) 		Number 				24
				K 		Hour in am/pm (0-11) 	Number 				0
				h 		Hour in am/pm (1-12) 	Number 				12
				m 		Minute in hour 			Number 				30
				s 		Second in minute 		Number 				55
				S 		Millisecond 			Number 				978
				z 		Time zone 				General time zone 	Pacific Standard Time; PST; GMT-08:00
				Z 		Time zone 				RFC 822 time zone 	-0800
				
			Pattern letters are usually repeated, as their number determines the exact presentation:

				* Text: For formatting, if the number of pattern letters is 4 or more, the full form is 
				  used; otherwise a short or abbreviated form is used if available. For parsing, both 
				  forms are accepted, independent of the number of pattern letters.
				* Number: For formatting, the number of pattern letters is the minimum number of digits,
				  and shorter numbers are zero-padded to this amount. For parsing, the number of pattern 
				  letters is ignored unless it's needed to separate two adjacent fields.
				* Year: For formatting, if the number of pattern letters is 2, the year is truncated to 
				  2 digits; otherwise it is interpreted as a number.

      		For parsing, if the number of pattern letters is more than 2, the year is interpreted literally, 
			regardless of the number of digits. So using the pattern "MM/dd/yyyy", "01/11/12" parses to 
			Jan 11, 12 A.D.

			For parsing with the abbreviated year pattern ("y" or "yy"), SimpleDateFormat must interpret the 
			abbreviated year relative to some century. It does this by adjusting dates to be within 80 years 
			before and 20 years after the time the SimpleDateFormat instance is created. For example, using 
			a pattern of "MM/dd/yy" and a SimpleDateFormat instance created on Jan 1, 1997, the string 
			"01/11/12" would be interpreted as Jan 11, 2012 while the string "05/04/64" would be interpreted
			as May 4, 1964. During parsing, only strings consisting of exactly two digits, as defined by 
			Character.isDigit(char), will be parsed into the default century. Any other numeric string, such
			as a one digit string, a three or more digit string, or a two digit string that isn't all digits
			(for example, "-1"), is interpreted literally. So "01/02/3" or "01/02/003" are parsed, using the
			same pattern, as Jan 2, 3 AD. Likewise, "01/02/-3" is parsed as Jan 2, 4 BC.

				* Month: If the number of pattern letters is 3 or more, the month is interpreted as text; 
				  otherwise, it is interpreted as a number.
				* General time zone: Time zones are interpreted as text if they have names. For time zones 
				  representing a GMT offset value, the following syntax is used:

					GMTOffsetTimeZone:
						GMT Sign Hours : Minutes
					Sign: one of
						+ -
					Hours:
						Digit
						Digit Digit
					Minutes:
						Digit Digit
					Digit: one of
						0 1 2 3 4 5 6 7 8 9

				  Hours must be between 0 and 23, and Minutes must be between 00 and 59. The format is locale 
				  independent and digits must be taken from the Basic Latin block of the Unicode standard.

				  For parsing, RFC 822 time zones are also accepted.

				* RFC 822 time zone: For formatting, the RFC 822 4-digit time zone format is used:

					RFC822TimeZone:
						Sign TwoDigitHours Minutes
					TwoDigitHours:
						Digit Digit

				  TwoDigitHours must be between 00 and 23. Other definitions are as for general time zones.

				  For parsing, general time zones are also accepted. 

				SimpleDateFormat also supports localized date and time pattern strings. In these strings, the 
				pattern letters described above may be replaced with other, locale dependent, pattern letters. 
				SimpleDateFormat does not deal with the localization of text other than the pattern letters; 
				that's up to the client of the class.

			--->

		<!--- setup temporary variables --->
		<cfset var sdf = createObject( "java", "java.text.SimpleDateFormat" ) />
		<cfset var parseDate = "" />
		
		<!--- check to see if the data value represents a simple string value --->
		<cfif NOT isSimpleValue( arguments.data ) >
			<cfthrow type="validat.invalidData" message="validat: The validation rule 'validateDate' only accepts simple data types." />
		</cfif>
		
		<!--- check to see if mask was provided in the arguments collection --->
		<!--- <cfif NOT structKeyExists( arguments.args, 'mask' ) >
			<cfthrow type="validat.missingArgs" message="validat: The validation rule 'validateDate' requires an argument named 'mask' that specifies the date string mask used to parse the date string." />
		</cfif> --->
		
		<cfif StructKeyExists(arguments.args, "mask")>
			<!--- initialize the sdf object with the mask --->
			<cfset sdf.init( arguments.args.mask ) />
			
			<!--- attempt to parse the date string --->
			<cftry>
				<cfset parseDate = sdf.parse( arguments.data ) />
				<cfcatch type="any">
					<cfreturn "invalid" />
				</cfcatch>
			</cftry>
			
			<!--- if the date was parsed successfuly, attempt to compare it to the original date and make sure they are still equivalent --->
			<cfif len(parseDate) AND sdf.format(parseDate) NEQ arguments.data >
				<cfreturn "invalid" />
			</cfif>
		<cfelseif NOT IsDate(arguments.data)>
			<cfreturn "invalid" />
		</cfif>
		
		<cfreturn "true" />
	</cffunction> <!--- end: validate() --->

</cfcomponent>