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
	displayname="transformOrm"
	output="false"
	hint="ColdFusion bean data transformer."
	extends="transformer">

	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="transformOrm"
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
	
		description:	Retrieves the data values in the form of key / value pairs from the bean object.
	--->
	<cffunction name="getData" access="public" output="false" returntype="struct"
		hint="Retrieves the data values in the form of key / value pairs from the bean object.">

		<cfargument name="dataCollection" type="any" required="true" hint="The data collection to be transformed" />
		
		<!--- setup temporary variables --->
		<cfset var beanMetaData = getMetaData(arguments.dataCollection) />
		<cfset var resultStruct = structNew() />
		<cfset var propPtr = 0 />
		
		<!--- loop over the meta data functions, looking for getters --->
		<cfloop from="1" to="#arrayLen(beanMetaData.properties)#" index="propPtr">
			<!--- if the function appears to be a getter --->
			<!--- call the getter function and insert the value into the result structure --->
			<cfset structInsert( resultStruct, beanMetaData.properties[propPtr].name, evaluate( "arguments.dataCollection.get#beanMetaData.properties[propPtr].name#()" ), true ) />
		</cfloop> <!--- end: loop over the meta data functions, looking for getters --->
		
		<!--- return the result structure --->
		<cfreturn resultStruct />
	</cffunction> <!--- end: getData() --->

</cfcomponent>