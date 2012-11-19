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
	displayname="transformStruct"
	output="false"
	hint="ColdFusion structure data transformer."
	extends="transformer">

	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="transformStruct"
		hint="The default constructor for the transformer object, returning the initialized transformer object instance">

		<!--- call the base constructor --->
		<cfset super.init() />
			
		<!--- return the initialized transformer object --->
		<cfreturn this />	
	</cffunction> <!--- end: init() --->
	
	<!--- ------------------------------------------------------------ --->
	<!--- public methods --->

	<!--- 
		function: getData
	
		description:	Retrieves the data values in the form of key / value pairs from the ColdFusion structure.
	--->
	<cffunction name="getData" access="public" output="false" returntype="struct"
		hint="Retrieves the data values in the form of key / value pairs from the ColdFusion structure.">

		<cfargument name="dataCollection" type="struct" required="true" hint="The data collection to be transformed" />
		
		<!--- return the data structure --->
		<cfreturn arguments.dataCollection />
	</cffunction> <!--- end: getData() --->

</cfcomponent>