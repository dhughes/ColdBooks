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
	displayname="validat"
	output="false"
	hint="Provides a configurable validation engine that is based upon a series of reusable, pluggable, validation methods which are executed against the data.">

	<!--- ------------------------------------------------------------ --->
	<!--- properties --->

	<!--- transformer bean id for the generic structure transformer --->
	<cfset variables.structTransformer = "transformStruct" />
	<!--- transformer bean id for the generic bean object transformer --->
	<cfset variables.beanTransformer = "transformBean" />
	
	<cfset variables.ormTransformer = "transformOrm" />

	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" output="false" returntype="validat"
		hint="The default constructor for the Validat engine, returning the initialized validator object instance">

		<cfargument name="factory" displayname="factory" type="any" required="true"
			hint="I am an instance of an object factory, from which the necessary validator and transformer objects will be requested." />
		<cfargument name="pathToConfigXML" displayname="pathToConfigXML" type="string" required="false"
			hint="I am the path to the configuration xml file to load." />

		<!--- create container for protected instance data --->
		<cfset variables.instance = structNew() />

		<!--- insert the validation rule and data set collections into the instance data structure --->
		<cfset variables.instance.validationRules = structNew() />
		<cfset variables.instance.dataSets = structNew() />

		<!--- insert a pointer to the object factory into the instance data structure --->
		<cfset variables.instance.factory = arguments.factory />

		<!--- if a configuration file was provided, parse it --->
		<cfif isDefined("arguments.pathToConfigXML") AND len(trim(arguments.pathToConfigXML)) >
			<cfset parseConfigXML(arguments.pathToConfigXML) />
		</cfif>

		<!--- return the initialized validator --->
		<cfreturn this />
	</cffunction> <!--- end: init() --->

	<!--- ------------------------------------------------------------ --->
	<!--- public methods --->

	<!--- 
		function: 		validate

		description:	Validates the provided data collection according to the specified data set and its 
						associated data elements and assertions before returning a collection of errors.
	--->
	<cffunction name="validate" access="public" output="true" returntype="any"
		hint="Validate the provided data collection according to the specified data set and its associated data elements and assertions">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set by which to validate the data collection" />
		<cfargument name="dataCollection" type="any" required="true" hint="The data collection to be validated" />
		<cfargument name="skipAsserts" type="string" required="false" default="" hint="An optional list of assertion identifiers for which to skip any validation for" />

		<!--- setup temporary variables --->
		<cfset var errorCollection = "" />
		<cfset var dataStr = structNew() />

		<!--- if a data set definition exists with the specified name --->
		<cfif dataSetExists( arguments.dataSetName ) >
	
			<!--- extract the data structure from the data collection to validate --->
			<cfset dataStr = getDataStr( arguments.dataSetName, arguments.dataCollection ) />
	
			<!--- attempt to process any data element level assertions --->
			<cfset errorCollection = validateDataElements( arguments.dataSetName, dataStr, arguments.skipAsserts ) />

			<!--- attempt to process any data set level assertions --->
			<cfset errorCollection.append( validateDataSet( arguments.dataSetName, dataStr, arguments.skipAsserts ) ) />
	
		<!--- othersise, throw an error --->	
		<cfelse>
			<cfthrow type="validat.invalidDataSet" message="validat: The data set specified ('#arguments.dataSetName#') does not exist." />
	
		</cfif> <!--- end: if a data set definition exists with the specified name --->

		<!--- return the error collection --->
		<cfreturn errorCollection />
	</cffunction> <!--- end: validate() --->

	<!--- ------------------------------------------------------------ --->
	<!--- programmatic rule manipulation methods --->

	<!--- 
		function: 		addRule

		description:	Programmatically adds a validation rule to the rules collection.  If a rule already 
						exists with the same name, that rule will be overwritten.
	--->
	<cffunction name="addRule" access="public" output="false" returntype="validat"
		hint="Programmatically adds a validation rule to the rules collection, overwritting any existing rules with the same name">

		<cfargument name="ruleName" type="string" required="true" hint="The name of the validation rule" />
		<cfargument name="validator" type="string" required="true" hint="The bean name of the validator object" />
		<cfargument name="ruleArgs" type="struct" required="false" default="#structNew()#" hint="A collection of default arguments to be passed to the validator object along with the data value" />
		<cfargument name="ruleMsgs" type="struct" required="false" default="#structNew()#" hint="A collection of default messages to be returned in the event of a validation error from the validator object" />

		<!--- setup temporary variables --->
		<cfset ruleStr = structNew() />

		<!--- setup the rule based upon the received arguments --->
		<cfset ruleStr.name = arguments.ruleName/>
		<cfset ruleStr.validator = arguments.validator />
		<cfset ruleStr.args = structNew() />
		<cfif NOT structIsEmpty( arguments.ruleArgs ) >
			<cfset ruleStr.args = structCopy( arguments.ruleArgs ) />
		</cfif>
		<cfset ruleStr.messages = structNew() />
		<cfif NOT structIsEmpty( arguments.ruleMsgs ) >
			<cfset ruleStr.messages = structCopy( arguments.ruleMsgs ) />
		</cfif>

		<!--- insert the new validation rule definiton into the validation rules collection --->
		<cfset structInsert( variables.instance.validationRules, ucase( arguments.ruleName ), structCopy( ruleStr ), true ) />

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addRule() --->

	<!--- 
		function: 		addRuleXML

		description:	Programmatically adds a new validation rule, along with any related arguments to the 
						rules collection based upon an xml snippet.  If a rule already exists with the 
						specified name, that rule will be overwritten.
	--->
	<cffunction name="addRuleXML" access="public" output="false" returntype="validat"
		hint="Programmatically adds a new validation rule, along with any related arguments to the rules collection based upon an xml snippet, overwritting any existing rules with the same name">

		<cfargument name="ruleXML" type="string" required="true" hint="The validation rule definition xml string" />

		<!--- setup temporary variables --->
		<cfset var oXML = xmlParse(arguments.ruleXML) />
		<cfset var argPtr = 0 />
		<cfset var argCollection = structNew() />
		<cfset var msgCollection = structNew() />
		
		<!--- check if the ruleXML is in fact a valid validation rule xml snippet --->
		<cfif NOT ( lcase( oXML.xmlRoot.xmlName ) EQ "rule" AND structKeyExists( oXML.xmlRoot.xmlAttributes, "name") AND structKeyExists( oXML.xmlRoot.xmlAttributes, "validator") ) >
			<cfthrow type="validat.invalidRule" message="validat: The xml snippet passed to the addRuleXML() method does not represent a valid validation rule." />
		</cfif>

		<!--- for every child node of the validation rule --->
		<cfloop from="1" to="#arrayLen( oXML.xmlRoot.xmlChildren )#" index="argPtr">
			<!--- if the child node is an argument --->
			<cfif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "arg" >
			
				<!--- if the child node is a valid argument --->
				<cfif NOT ( structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "name") AND structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "value") ) >
					<cfthrow type="validat.invalidRule" message="validat: The xml snippet passed to the addRuleXML() method contains an invalid argument." detail="Invalid Argument: #toString(oXML.xmlRoot.xmlChildren[argPtr])#" />
				</cfif>
				<!--- insert the argument into the argument collection --->
				<cfset structInsert( argCollection, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.name, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.value ) />

			<!--- else, if the child node is a message --->
			<cfelseif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "message" >
			
				<!--- if the child node is a valid argument --->
				<cfif NOT ( structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "name") AND structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "value") ) >
					<cfthrow type="validat.invalidRule" message="validat: The xml snippet passed to the addRuleXML() method contains an invalid message." detail="Invalid Argument: #toString(oXML.xmlRoot.xmlChildren[argPtr])#" />
				</cfif>
				<!--- insert the argument into the argument collection --->
				<cfset structInsert( msgCollection, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.name, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.value ) />

			<!--- else, throw an error - invalid node --->
			<cfelse>
				<cfthrow type="validat.invalidXML" message="validat: The xml snippet passed to the addRuleXML() contains an invalid entry.  '#oXML.xmlRoot.xmlChildren[argPtr].xmlName#' is not valid within a validation rule definition." />
	
			</cfif> <!--- end: if the child node is an argument --->
		</cfloop> <!--- end: for every child node of the validation rule --->

		<!--- pass the validation rule parameters to the addRule function for addition to the validation rule collection --->
		<cfset addRule( oXML.xmlRoot.xmlAttributes.name, oXML.xmlRoot.xmlAttributes.validator, argCollection, msgCollection ) />

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addRuleXML() --->

	<!--- 
		function: 		getAllRules

		description:	Retrieves all validation rules currently in the rules collection.
	--->
	<cffunction name="getAllRules" access="public" output="false" returntype="struct"
		hint="Retrieves the all validation rules currently in the rules collection">

		<!--- return a copy of the rules collection --->
		<cfreturn structCopy(variables.instance.validationRules) />
	</cffunction> <!--- end: getAllRules() --->

	<!--- 
		function: 		getRule

		description:	Retrieves the validation rule definition for the validation rule with the specified name.
	--->
	<cffunction name="getRule" access="public" output="false" returntype="struct"
		hint="Retrieves the validation rule definition for the validation rule with the specified name">

		<cfargument name="ruleName" type="string" required="true" hint="The name of the validation rule to retrieve" />

		<!--- check if the specified validation rule exists --->
		<cfif NOT ruleExists( arguments.ruleName ) >
			<cfthrow type="validat.invalidRule" message="validat: The validation rule name specified ('#arguments.ruleName#') does not exist." />
		</cfif>

		<!--- return a copy of the validation rule definition --->
		<cfreturn structCopy(variables.instance.validationRules[arguments.ruleName]) />
	</cffunction> <!--- end: getRule() --->

	<!--- 
		function: 		remRule

		description:	Removes the validation rule definition for the validation rule with the specified name.
	--->
	<cffunction name="remRule" access="public" output="false" returntype="validat"
		hint="Removes the validation rule definition for the validation rule with the specified name">

		<cfargument name="ruleName" type="string" required="true" hint="The name of the validation rule to retrieve" />

		<!--- check if the specified validation rule exists --->
		<cfif NOT ruleExists( arguments.ruleName ) >
			<cfthrow type="validat.invalidRule" message="validat: The validation rule name specified ('#arguments.ruleName#') does not exist." />
		</cfif>

		<!--- remove the validation rule definition for the validation rule with the specified name --->
		<cfset structDelete( variables.instance.validationRules, arguments.ruleName ) />

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: remRule() --->

	<!--- 
		function: 		ruleExists

		description:	Returns true if a validation rule with the specified name exists.
	--->
	<cffunction name="ruleExists" access="public" output="false" returntype="boolean"
		hint="Returns true if a validation rule with the specified name exists" >

		<cfargument name="ruleName" type="string" required="true" hint="The name of the validation rule to retrieve" />

		<!--- check if the specified validation rule exists --->
		<cfif structKeyExists( variables.instance.validationRules, arguments.ruleName ) >
			<cfreturn true />
		</cfif>

		<cfreturn false />
	</cffunction> <!--- end: ruleExists() --->

	<!--- ------------------------------------------------------------ --->
	<!--- programmatic data set manipulation methods --->

	<!--- 
		function: 		addDataSet

		description:	Programmatically adds a new data set definiton to the data set collection.  If the 
						overwrite argument is true, any existing data sets with the specified name will be 
						overwritten.  Otherwise, if a data set already exists with the specified name, 
						nothing will happen, preserving the existing data set definition.  
	--->
	<cffunction name="addDataSet" access="public" output="false" returntype="validat"
		hint="Programmatically adds a data set to the data set collection">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set" />
		<cfargument name="transformer" type="string" required="false" default="" hint="The bean name of the transformer object" />
		<cfargument name="overwrite" type="boolean" required="false" default="false" hint="Overwrite an existing data set?" />

		<!--- setup temporary variables --->
		<cfset dataSetStr = structNew() />

		<!--- setup the data set based upon the received arguments --->
		<cfset dataSetStr.name = arguments.dataSetName />
		<cfset dataSetStr.transformer = arguments.transformer />
		<cfset dataSetStr.dataElements = structNew() />
		<cfset dataSetStr.assertions = arrayNew(1) />
		<cfset dataSetStr.assertionIdList = "" />
		<cfset dataSetStr.assertionRuleList = "" />

		<!--- if a data set does not exist with the given data set name OR overwrite is true --->
		<cfif NOT dataSetExists( arguments.dataSetName ) OR arguments.overwrite >

			<!--- insert the new data set definiton into the data set collection  --->
			<cfset structInsert( variables.instance.dataSets, ucase( arguments.dataSetName ), structCopy( dataSetStr ), true ) />
	
		</cfif> <!--- end: if a data set exists or overwrite --->

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addDataSet() --->

	<!--- 
		function: 		addDataSetXML

		description:	Programmatically adds a new data set definiton, along with any related data elements
						and assertions to the data set collection based upon an xml snippet. If the overwrite 
						argument is true, any existing data sets with the specified name will be overwritten.
						Otherwise, if a data set already exists with the specified name, nothing will happen, 
						preserving the existing data set definition.  
	--->
	<cffunction name="addDataSetXML" access="public" output="false" returntype="validat"
		hint="Programmatically adds a new data set definiton, along with any related data elements and assertions to the assections collection based upon an xml snippet">

		<cfargument name="dataSetXML" type="string" required="true" hint="The data set definition xml string" />
		<cfargument name="overwrite" type="boolean" required="false" default="false" hint="Overwrite an existing data set?" />

		<!--- setup temporary variables --->
		<cfset var oXML = xmlParse(arguments.dataSetXML) />

		<!--- check if the dataSetXML is in fact a valid data set xml snippet --->
		<cfif NOT ( lcase(oXML.xmlRoot.xmlName) EQ "dataSet" AND structKeyExists( oXML.xmlRoot.xmlAttributes, "name") ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The xml snippet passed to the addDataSetXML() method does not represent a valid data set." />
		</cfif>

		<!--- pass the data set attributes to the addDataSet function for addition to the data set collection --->
		<cfparam name="oXML.xmlRoot.xmlAttributes.transformer" default="" />
		<cfset addDataSet( oXML.xmlRoot.xmlAttributes.name, oXML.xmlRoot.xmlAttributes.transformer, arguments.overwrite ) />

		<!--- for every child node of the data set --->
		<cfloop from="1" to="#arrayLen( oXML.xmlRoot.xmlChildren )#" index="argPtr">
			<!--- if the child node is an assertion --->
			<cfif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "assert" >
				<cfset addAssertXML( dataSetName = oXML.xmlRoot.xmlAttributes.name, assertXML = toString( oXML.xmlRoot.xmlChildren[argPtr] ) ) />

			<!--- else, if the child node is a data element --->
			<cfelseif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "dataElement" >
				<cfset addDataElementXML( oXML.xmlRoot.xmlAttributes.name, toString( oXML.xmlRoot.xmlChildren[argPtr] ), arguments.overwrite ) />

			<!--- else, throw an error - invalid node --->
			<cfelse>
				<cfthrow type="validat.invalidXML" message="validat: The xml snippet passed to the addDataSetXML() contains an invalid entry.  '#oXML.xmlRoot.xmlChildren[argPtr].xmlName#' is not valid within a data set definition." />
	
			</cfif> <!--- end: if the child node is an assertion --->
		</cfloop> <!--- end: for every child node of the data set --->

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addDataSetXML() --->

	<!--- 
		function: 		getAllDataSets

		description:	Retrieves the all data set definitions currently in the assertions collection.
	--->
	<cffunction name="getAllDataSets" access="public" output="false" returntype="struct"
		hint="Retrieves the all data set definitions currently in the assertions collection">

		<!--- return a copy of the data sets collection --->
		<cfreturn structCopy(variables.instance.dataSets) />
	</cffunction> <!--- end: getAllDataSets() --->

	<!--- 
		function: 		getDataSet

		description:	Retrieves the data set definition for the data set with the specified name.
	--->
	<cffunction name="getDataSet" access="public" output="false" returntype="struct"
		hint="Retrieves the data set definition for the data set with the specified name" >

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to retrieve" />

		<!--- check if the specified data set exists --->
		<cfif NOT dataSetExists( arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- return a copy of the data set definition --->
		<cfreturn structCopy(variables.instance.dataSets[arguments.dataSetName]) />
	</cffunction> <!--- end: getDataSet() --->

	<!--- 
		function: 		remDataSet

		description:	Removes the data set definition for the data set with the specified name.
	--->
	<cffunction name="remDataSet" access="public" output="false" returntype="validat"
		hint="Removes the data set definition for the data set with the specified name" >

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to remove" />

		<!--- check if the specified data set exists --->
		<cfif NOT dataSetExists( arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- remove the data set definition for the data set with the specified name --->
		<cfset structDelete( variables.instance.dataSets, arguments.dataSetName ) />

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: remDataSet() --->

	<!--- 
		function: 		dataSetExists

		description:	Returns true if a data set with the specified name exists.
	--->
	<cffunction name="dataSetExists" access="public" output="false" returntype="boolean"
		hint="Returns true if a data set with the specified name exists" >

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to remove" />

		<!--- check if the specified data set exists --->
		<cfif structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfreturn true />
		</cfif>

		<cfreturn false />
	</cffunction> <!--- end: dataSetExists() --->

	<!--- ------------------------------------------------------------ --->
	<!--- programmatic data element manipulation methods --->

	<!--- 
		function: 		addDataElement

		description:	Programmatically adds a new data element definiton to the data set specified.  If the 
						specified data set does not exist, an error will be thrown.  If the overwrite argument 
						is true, any existing data elements with the specified name will be overwritten.  
						Otherwise, if a data element already exists with the specified name, nothing will 
						happen, preserving the existing data element definition.  
	--->
	<cffunction name="addDataElement" access="public" output="false" returntype="validat"
		hint="Programmatically adds a data element to the specified data set">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to associate the data element with" />
		<cfargument name="dataElementName" type="string" required="true" hint="The name of the data element" />
		<cfargument name="dataSetConnectionName" type="string" required="false" default="" hint="The name of the data set for which this complex data element connects to" />
		<cfargument name="required" type="boolean" required="false" default="false" hint="Is this data element required?" />
		<cfargument name="message" type="string" required="false" default="" hint="The error message to be displayed if the data element is required and no value is provided" />
		<cfargument name="overwrite" type="boolean"  required="false" default="false" hint="Overwrite an existing data element?" />

		<!--- setup temporary variables --->
		<cfset dataElementStr = structNew() />

		<!--- check if the specified data set exists --->
		<cfif NOT dataSetExists( arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- if a data element does not exist with the given data element name OR overwrite is true --->
		<cfif NOT structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) OR arguments.overwrite >

			<!--- setup the data element based upon the received arguments --->
			<cfset dataElementStr.name = arguments.dataElementName />
			<cfset dataElementStr.required = arguments.required />
			<cfset dataElementStr.message = arguments.message />
			<cfset dataElementStr.assertionIdList = "" />
			<cfset dataElementStr.assertionRuleList = "" />
			<cfset dataElementStr.assertions = arrayNew(1) />
			<cfset dataElementStr.connectTo = arguments.dataSetConnectionName />

			<!--- insert the new data element definiton into the data set collection  --->
			<cfset structInsert( variables.instance.dataSets[arguments.dataSetName].dataElements, ucase( arguments.dataElementName ), structCopy( dataElementStr ), true ) />

		</cfif> <!--- end: if data element does not exist or overwrite --->

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addDataElement() --->

	<!--- 
		function: 		addDataElementXML

		description:	Programmatically adds a new data element definiton, along with any related assertions 
						to the data set specified based upon an xml snippet.  If the specified data set does 
						not exist, an error will be thrown. If the overwrite argument is true, any existing 
						data elements with the specified name will be overwritten.  Otherwise, if a data 
						element already exists with the specified name, nothing will happen, preserving the
						existing data element definition.  
	--->
	<cffunction name="addDataElementXML" access="public" output="false" returntype="validat"
		hint="Programmatically adds a new data element definiton, along with any related assertions to the specified data set based upon an xml snippet">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to associate the data element with" />
		<cfargument name="dataElementXML" type="string" required="true" hint="The data element definition xml string" />
		<cfargument name="overwrite" type="boolean"  required="false" default="false" hint="Overwrite an existing data element?" />

		<!--- setup temporary variables --->
		<cfset var oXML = xmlParse(arguments.dataElementXML) />

		<!--- check if the deXML is in fact a valid data element xml snippet --->
		<cfif NOT ( lcase( oXML.xmlRoot.xmlName ) EQ "dataElement" AND structKeyExists( oXML.xmlRoot.xmlAttributes, "name") ) >
			<cfthrow type="validat.invalidDataElement" message="validat: The xml snippet passed to the addDataElementXML() method does not represent a valid data element." />
		</cfif>

		<!--- pass the data element attributes to the addDataElement function for addition to the data set collection --->
		<cfparam name="oXML.xmlRoot.xmlAttributes.dataSet" default="" />
		<cfparam name="oXML.xmlRoot.xmlAttributes.required" default="false" />
		<cfparam name="oXML.xmlRoot.xmlAttributes.message" default="" />
		<cfset addDataElement( arguments.dataSetName, oXML.xmlRoot.xmlAttributes.name, oXML.xmlRoot.xmlAttributes.dataSet, oXML.xmlRoot.xmlAttributes.required, oXML.xmlRoot.xmlAttributes.message, arguments.overwrite ) />

		<!--- for every child node of the data element --->
		<cfloop from="1" to="#arrayLen( oXML.xmlRoot.xmlChildren )#" index="argPtr">
			<!--- if the child node is an assertion, pass the xml snippet to the addAssertXML method --->
			<cfif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "assert" >
			
				<cfset addAssertXML( arguments.dataSetName, oXML.xmlRoot.xmlAttributes.name, toString( oXML.xmlRoot.xmlChildren[argPtr] ) ) />

			<!--- else, throw an error - invalid node --->
			<cfelse>
				<cfthrow type="validat.invalidXML" message="validat: The xml snippet passed to the addDataElementXML() contains an invalid entry.  '#oXML.xmlRoot.xmlChildren[argPtr].xmlName#' is not valid within a data element definition." />
	
			</cfif> <!--- end: if the child node is an assertion --->
		</cfloop> <!--- end: for every child node of the data element --->

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addDataElementXML() --->

	<!--- 
		function: 		getAllDataElements

		description:	Retrieves all data element definitions associated with the data set with the specified 
						name.  If the specified data set does not exist, an error will be thrown.
	--->
	<cffunction name="getAllDataElements" access="public" output="false" returntype="struct"
		hint="Retrieves all data element definitions associated with the data set with the specified name">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to retrieve the data element definitions for" />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- return a copy of the data element collection for the specified data set --->
		<cfreturn structCopy(variables.instance.dataSets[arguments.dataSetName].dataElements) />
	</cffunction> <!--- end: getAllDataElements() --->

	<!--- 
		function: 		getDataElement

		description:	Retrieves the data element definition for the data set, data element combination 
						specified.  If the specified data set and data element combination does not exist, an 
						error will be thrown.
	--->
	<cffunction name="getDataElement" access="public" output="false" returntype="struct"
		hint="Retrieves the data element definition for the data set, data element combination specified">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to retrieve the data element definitions for" />
		<cfargument name="dataElementName" type="string" required="true" hint="The name of the data set to retrieve" />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- check if the specified data element exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) >
			<cfthrow type="validat.invalidDataElement" message="validat: The data element name specified ('#arguments.dataElementName#') does not exist." />
		</cfif>

		<!--- return a copy of the data element definition for the specified data element, data set combination --->
		<cfreturn structCopy(variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName]) />
	</cffunction> <!--- end: getDataElement() --->

	<!--- 
		function: 		remDataElement

		description:	Removes the data element definition for the data set, data element combination specified.
						If the specified data set and data element combination does not exist, an error will be 
						thrown.
	--->
	<cffunction name="remDataElement" access="public" output="false" returntype="validat"
		hint="Removes the data element definition for the data set, data element combination specified">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to retrieve the data element definitions for" />
		<cfargument name="dataElementName" type="string" required="true" hint="The name of the data set to retrieve" />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- check if the specified data element exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) >
			<cfthrow type="validat.invalidDataElement" message="validat: The data element name specified ('#arguments.dataElementName#') does not exist." />
		</cfif>

		<!--- remove the data set definition for the data set with the specified name --->
		<cfset structDelete( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) />

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: remDataElement() --->

	<!--- 
		function: 		dataElementExists

		description:	Returns true if a data element with the specified name and data set exists.
	--->
	<cffunction name="dataElementExists" access="public" output="false" returntype="boolean"
		hint="Returns true if a data set with the specified name exists" >

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to retrieve the data element definitions for" />
		<cfargument name="dataElementName" type="string" required="true" hint="The name of the data set to retrieve" />

		<!--- check if the specified data element exists --->
		<cfif dataSetExists( arguments.dataSetName ) AND structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) >
			<cfreturn true />
		</cfif>

		<cfreturn false />
	</cffunction> <!--- end: dataElementExists() --->

	<!--- ------------------------------------------------------------ --->
	<!--- programmatic assertion manipulation methods --->

	<!--- 
		function: 		addAssert

		description:	Programmatically adds a new assertion to the data set or data set, data element 
						combination specified.  If a data element assertion is being added and an assertion 
						already exists with the specified rule, that assertion will be overwritten.  Data 
						set assertions will not be overwritten and must be removed manually if so desired.
						If the specified data set or data set, data element combination does not exist, an 
						error will be thrown.
	--->
	<cffunction name="addAssert" access="public" output="false" returntype="validat"
		hint="Programmatically adds a data element assertion to the specified data set or data set, data element combination">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to associate the assertion with" />
		<cfargument name="dataElementName" type="string" required="false" hint="The name of the data element to associate the assertion with" />
		<cfargument name="ruleName" type="string" required="true" hint="The name of the rule to which this assertion corresponds" />
		<cfargument name="continueOnFail" type="boolean" required="false" default="false" hint="Should validation continue if this assertion fails" />
		<cfargument name="args" type="struct" required="false" hint="A collection of arguments to be passed to the validator object along with the data value" />
		<cfargument name="dependencies" type="struct" required="false" hint="A collection of data values upon which validation of the data element depends upon" />
		<cfargument name="messages" type="struct" required="true" hint="A collection of error messages to be returned if the assertion fails" />

		<!--- if a data element name was specified, call the addDEAssert method --->
		<cfif isDefined("arguments.dataElementName") >
			<cfset addDEAssert( argumentCollection = arguments ) />
	
		<!--- otherwise, call the addDSAssert method --->
		<cfelse>
			<cfset addDSAssert( argumentCollection = arguments ) />

		</cfif> <!--- end: if data element name was specified --->

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addAssert() --->

	<!--- 
		function: 		addAssertXML

		description:	Programmatically adds a new data element assertion to the data set or data set, data 
						element combination specified, based upon an xml snippet.  If a data element assertion 
						is being added and an assertion already exists with the specified rule, that assertion 
						will be overwritten.  Data set assertions will not be overwritten and must be removed 
						manually if so desired.  If the specified data set or data set, data element combination
						does not exist, an error will be thrown.
	--->
	<cffunction name="addAssertXML" access="public" output="false" returntype="validat"
		hint="Programmatically adds a new data element definiton, along with any related assertions to the specified data set based upon an xml snippet">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to associate the assertion with" />
		<cfargument name="dataElementName" type="string" required="false" hint="The name of the data element to associate the assertion with" />
		<cfargument name="assertXML" type="string" required="true" hint="The data element assertion xml string" />

		<!--- setup temporary variables --->
		<cfset var oXML = xmlParse(arguments.assertXML) />
		<cfset var assertParameters = structNew() />

		<!--- check if the assertXML is in fact a valid data element assertion xml snippet --->
		<cfif NOT ( lcase( oXML.xmlRoot.xmlName ) EQ "assert" AND structKeyExists( oXML.xmlRoot.xmlAttributes, "rule") ) >
			<cfthrow type="validat.invalidAssert" message="validat: The xml snippet passed to the addAssertXML() method does not represent a valid data element assertion." />
		</cfif>

		<!--- build a collection of assertion parameters based upon the xml snippet --->
		<cfset assertParameters.dataSetName = arguments.dataSetName />
		<cfif isDefined("arguments.dataElementName") >
			<cfset assertParameters.dataElementName = arguments.dataElementName />
		</cfif>
		<cfset assertParameters.ruleName = oXML.xmlRoot.xmlAttributes.rule />
		<cfif structKeyExists( oXML.xmlRoot.xmlAttributes, "continueOnFail") >
			<cfset assertParameters.continueOnFail = oXML.xmlRoot.xmlAttributes.continueOnFail />
		</cfif>
		<cfset assertParameters.args = structNew() />
		<cfset assertParameters.dependencies = structNew() />
		<cfset assertParameters.messages = structNew() />

		<!--- for every child node of the assertion --->
		<cfloop from="1" to="#arrayLen( oXML.xmlRoot.xmlChildren )#" index="argPtr">

			<!--- if the child node is an argument --->
			<cfif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "arg" >
				<!--- verify it is a valid argument --->
				<cfif NOT ( structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "name") AND structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "value") ) >
					<cfthrow type="validat.invalidAssert" message="validat: The xml snippet passed to the addAssertXML() method contains an invalid argument." detail="Invalid Argument: #toString(oXML.xmlRoot.xmlChildren[argPtr])#" />
				</cfif>
				<!--- insert the argument into the arguments collection --->
				<cfset structInsert( assertParameters.args, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.name, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.value ) />

			<!--- else, if the child node is a dependency --->
			<cfelseif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "depend" >
				<!--- verify it is a valid dependency --->
				<cfif NOT ( structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "name") AND structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "value") ) >
					<cfthrow type="validat.invalidDependency" message="validat: The xml snippet passed to the addAssertXML() method contains an invalid dependency." detail="Invalid Dependency: #toString(oXML.xmlRoot.xmlChildren[argPtr])#" />
				</cfif>
				<!--- insert the argument into the dependencies collection --->
				<cfset structInsert( assertParameters.dependencies, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.name, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.value ) />

			<!--- else, if the child node is a message --->
			<cfelseif lcase( oXML.xmlRoot.xmlChildren[argPtr].xmlName ) EQ "message" >
				<!--- verify it is a valid message --->
				<cfif NOT ( structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "name") AND structKeyExists( oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes, "value") ) >
					<cfthrow type="validat.invalidMessage" message="validat: The xml snippet passed to the addAssertXML() method contains an invalid message." detail="Invalid Message: #toString(oXML.xmlRoot.xmlChildren[argPtr])#" />
				</cfif>
				<!--- insert the argument into the messages collection --->
				<cfset structInsert( assertParameters.messages, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.name, oXML.xmlRoot.xmlChildren[argPtr].xmlAttributes.value ) />

			<!--- else, throw an error - invalid node --->
			<cfelse>
				<cfthrow type="validat.invalidAssert" message="validat: The xml snippet passed to the addDataElementXML() contains an invalid entry.  '#oXML.xmlRoot.xmlChildren[argPtr].xmlName#' is not valid within an assertion definition." />
	
			</cfif> <!--- end: if the child node is an argument --->
		</cfloop> <!--- end: for every child node --->

		<!--- pass the assertion parameters to the addAssert function for addition to the data set collection --->
		<cfset addAssert( argumentCollection = assertParameters ) />

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: addAssertXML() --->

	<!--- 
		function: 		getAllAsserts

		description:	Retrieves all assertions associated with the data set or data set, data element 
						combination specified.  If the specified data set or data set, data element 
						combination does not exist, an error will be thrown.
	--->
	<cffunction name="getAllAsserts" access="public" output="false" returntype="array"
		hint="Retrieves the all data element assertions associated with the data set, data element combination specified">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set from which to retrieve the assertion definitions" />
		<cfargument name="dataElementName" type="string" required="false" hint="The name of the data element from which to retrieve the assertion definitions" />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>
	
		<!--- if a data element was specified --->
		<cfif isDefined("arguments.dataElementName") >

			<!--- check if the specified data element exists --->
			<cfif NOT structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) >
				<cfthrow type="validat.invalidDataElement" message="validat: The data element name specified ('#arguments.dataElementName#') does not exist." />
			</cfif>
	
			<!--- return a copy of the data element assertion collection for the specified data element, data set combination --->
			<cfreturn variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertions />

		<cfelse>
	
			<!--- return a copy of the data set assertion collection for the specified data set --->
			<cfreturn variables.instance.dataSets[arguments.dataSetName].assertions />

		</cfif> <!--- end: if a data element was specified --->
	</cffunction> <!--- end: getAllAsserts() --->

	<!--- 
		function: 		getAssert

		description:	Retrieves the data element assertion associated with the data set or data set, data 
						element combination, and assertion identifier (rule name or assert id) specified.  The 
						assertion identifier will be compared against the assert id first and if no match 
						occurs, will be compared against the rule name.  If the assert id matches multiple 
						assertions, an error will be thrown.  If the specified data set, or data set, data 
						element combination, and assertion identifier does not exist, an error will be thrown.
	--->
	<cffunction name="getAssert" access="public" output="false" returntype="struct"
		hint="Retrieves the data element assertion for the data set, data element, and rule combination specified">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to retrieve the assertions for" />
		<cfargument name="dataElementName" type="string" required="false" hint="The name of the data element to retrieve the assertion for" />
		<cfargument name="assertId" type="string" required="true" hint="The assertion identifier (rule name or assert id) of the assertion to retrieve" />

		<!--- setup temporary variables --->
		<cfset var assertRules = 0 />
		<cfset var assertPos = 0 />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>
	
		<!--- if a data element was specified --->
		<cfif isDefined("arguments.dataElementName") >

			<!--- check if the specified data element exists --->
			<cfif NOT structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) >
				<cfthrow type="validat.invalidDataElement" message="validat: The data element name specified ('#arguments.dataElementName#') does not exist." />
			</cfif>

			<!--- check if the specified rule / assertion exists --->
			<cfif NOT listFindNoCase( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList, arguments.assertId ) >
				<cfthrow type="validat.invalidAssertion" message="validat: The assertion with the rule name specified ('#arguments.assertId#') does not exist." />
			</cfif>
	
			<!--- return a copy of the assertion definition for the specified assertion, data element, data set combination --->
			<cfset assertPos = listFindNoCase( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList, arguments.assertId ) />
			<cfreturn variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertions[assertPos] />

		<cfelse>
	
			<!--- check if the specified rule / assertion exists --->
			<cfset assertPos = listFindNoCase( variables.instance.dataSets[arguments.dataSetName].assertionIdList, arguments.assertId ) >
			<cfif assertPos EQ 0 >
				<!--- assert identifier does not match an assert id, check if and how many assertion rule names it matches --->
				<cfset assertRules = listValueCountNoCase( variables.instance.dataSets[arguments.dataSetName].assertionRuleList, arguments.assertId ) />
				<cfif assertRules EQ 0 >
					<cfthrow type="validat.invalidAssertion" message="validat: The assertion with the rule identifier specified ('#arguments.assertId#') does not exist." />
				<cfelseif assertRules GT 1 >
					<cfthrow type="validat.ambigiousAssertion" message="validat: The specified rule identifier ('#arguments.assertId#') matches more than one assertion." />
				<cfelse>
					<cfset assertPos = listFindNoCase( variables.instance.dataSets[arguments.dataSetName].assertionRuleList, arguments.assertId ) />
				</cfif>
			</cfif>
	
			<!--- return a copy of the assertion definition for the specified assertion, data element, data set combination --->
			<cfreturn variables.instance.dataSets[arguments.dataSetName].assertions[assertPos] />

		</cfif> <!--- end: if a data element was specified --->
	</cffunction> <!--- end: getAssert() --->

	<!--- 
		function: 		remAssert

		description:	Removes the data element assertion associated with the data set or data set, data element 
						combination, and assertion identifier (rule name or assert id) specified.  The assertion 
						identifier will be compared against the assert id first and if no match occurs, will be 
						compared against the rule name.  If the assert id matches multiple assertions, an error 
						will be thrown.  If the specified data set, or data set, data element combination, and 
						assertion identifier does not exist, an error will be thrown.
	--->
	<cffunction name="remAssert" access="public" output="false" returntype="validat"
		hint="Removes the data element assertion associated with the data set, data element, and rule combination specified">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to retrieve the assertions for" />
		<cfargument name="dataElementName" type="string" required="false" hint="The name of the data element to retrieve the assertion for" />
		<cfargument name="assertId" type="string" required="true" hint="The assertion identifier (rule name or assert id) of the assertion to retrieve" />

		<!--- setup temporary variables --->
		<cfset var assertRules = 0 />
		<cfset var assertPos = 0 />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidDataSet" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>
	
		<!--- if a data element was specified --->
		<cfif isDefined("arguments.dataElementName") >

			<!--- check if the specified data element exists --->
			<cfif NOT structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) >
				<cfthrow type="validat.invalidDataElement" message="validat: The data element name specified ('#arguments.dataElementName#') does not exist." />
			</cfif>

			<!--- check if the specified rule / assertion exists --->
			<cfif NOT listFindNoCase( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList, arguments.assertId ) >
				<cfthrow type="validat.invalidAssertion" message="validat: The assertion with the rule name specified ('#arguments.assertId#') does not exist." />
			</cfif>
	
			<!--- remove the assertion definition for the specified assertion, data element, data set combination --->
			<cfset assertPos = listFindNoCase( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList, arguments.assertId ) />
			<cfset arrayDeleteAt(variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertions, assertPos ) />
			<cfset variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionIdList = listDeleteAt(variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionIdList, assertPos ) />
			<cfset variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList = listDeleteAt(variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList, assertPos ) />

		<cfelse>
	
			<!--- check if the specified rule / assertion exists --->
			<cfset assertPos = listFindNoCase( variables.instance.dataSets[arguments.dataSetName].assertionIdList, arguments.assertId ) >
			<cfif assertPos EQ 0 >
				<!--- assert identifier does not match an assert id, check if and how many assertion rule names it matches --->
				<cfset assertRules = listValueCountNoCase( variables.instance.dataSets[arguments.dataSetName].assertionRuleList, arguments.assertId ) />
				<cfif assertRules EQ 0 >
					<cfthrow type="validat.invalidAssertion" message="validat: The assertion with the rule identifier specified ('#arguments.assertId#') does not exist." />
				<cfelseif assertRules GT 1 >
					<cfthrow type="validat.ambigiousAssertion" message="validat: The specified rule identifier ('#arguments.assertId#') matches more than one assertion." />
				<cfelse>
					<cfset assertPos = listFindNoCase( variables.instance.dataSets[arguments.dataSetName].assertionRuleList, arguments.assertId ) />
				</cfif>
			</cfif>
	
			<!--- remove the assertion definition for the specified assertion, data set combination --->
			<cfset arrayDeleteAt(variables.instance.dataSets[arguments.dataSetName].assertions, assertPos ) />
			<cfset variables.instance.dataSets[arguments.dataSetName].assertionIdList = listDeleteAt(variables.instance.dataSets[arguments.dataSetName].assertionIdList, assertPos ) />
			<cfset variables.instance.dataSets[arguments.dataSetName].assertionRuleList = listDeleteAt(variables.instance.dataSets[arguments.dataSetName].assertionRuleList, assertPos ) />

		</cfif> <!--- end: if a data element was specified --->

		<!--- return a pointer to this object to allow for chaining --->
		<cfreturn this />
	</cffunction> <!--- end: remAssert() --->

	<!--- ------------------------------------------------------------ --->
	<!--- private methods --->

	<!--- 
		function: 		addDEAssert

		description:	Programmatically adds a new assertion to the data set, data element combination 
						specified.  If an assertion already exists with the specified rule in the given data 
						set, data element combination, that assertion will be overwritten.  If the specified 
						data set, data element combination does not exist, an error will be thrown.
	--->
	<cffunction name="addDEAssert" access="private" output="false" returntype="void"
		hint="Programmatically adds a data element assertion to the specified data set, data element combination, overwritting any existing assertions with the same rule">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to associate the assertion with" />
		<cfargument name="dataElementName" type="string" required="true" hint="The name of the data element to associate the assertion with" />
		<cfargument name="ruleName" type="string" required="true" hint="The name of the rule to which this assertion corresponds" />
		<cfargument name="continueOnFail" type="boolean" required="false" default="false" hint="Should validation continue if this assertion fails" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="A collection of arguments to be passed to the validator object along with the data value" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="A collection of data values upon which validation of the data element depends upon" />
		<cfargument name="messages" type="struct" required="true" hint="A collection of error messages to be returned if the assertion fails" />

		<!--- setup temporary variables --->
		<cfset var assertStr = structNew() />
		<cfset var assertPtr = 0 />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidAssertion" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- check if the specified data element exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets[arguments.dataSetName].dataElements, arguments.dataElementName ) >
			<cfthrow type="validat.invalidAssertion" message="validat: The data element name specified ('#arguments.dataElementName#') does not exist." />
		</cfif>

		<!--- setup the assertion based upon the received arguments --->
		<cfset assertStr.rule = arguments.ruleName />
		<cfset assertStr.assertId = createUUID() />
		<cfset assertStr.continueOnFail = arguments.continueOnFail />
		<cfif NOT structIsEmpty( arguments.args ) >
			<cfset assertStr.args = arguments.args />
		</cfif>
		<cfif NOT structIsEmpty( arguments.dependencies ) >
			<cfset assertStr.dependencies = arguments.dependencies />
		</cfif>
		<cfif NOT structIsEmpty( arguments.messages ) >
			<cfset assertStr.messages = arguments.messages />
		</cfif>

		<!--- attempt to locate existing assertion with this rule name --->
		<cfset assertPtr = listFindNoCase( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList, arguments.ruleName ) />

		<!--- if an existing assertion was found, overwrite it --->
		<cfif assertPtr GT 0 >
			<cfset assertStr.assertId = variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertions[assertPtr].assertId />
			<cfset variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertions[assertPtr] = structCopy( assertStr ) />

		<!--- existing assertion was not found, add assertion to the end of the array / list --->
		<cfelse>
			<cfset arrayAppend( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertions, structCopy( assertStr ) ) />
	
			<cfif listLen( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList ) EQ 0 >
				<cfset variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList = arguments.ruleName />
				<cfset variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionIdList = assertStr.assertId />
			<cfelse>
				<cfset variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList = listAppend( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionRuleList, arguments.ruleName ) />
				<cfset variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionIdList = listAppend( variables.instance.dataSets[arguments.dataSetName].dataElements[arguments.dataElementName].assertionIDList, assertStr.assertId ) />
			</cfif>

		</cfif> <!--- end: if existing assertion was found --->

		<!--- return --->
		<cfreturn />
	</cffunction> <!--- end: addDEAssert() --->

	<!--- 
		function: 		addDSAssert

		description:	Programmatically adds a new data set assertion to the data set specified. If the 
						specified data set does not exist, an error will be thrown.
	--->
	<cffunction name="addDSAssert" access="private" output="false" returntype="void"
		hint="Programmatically adds a data element assertion to the specified data set or data set, data element combination">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set to associate the assertion with" />
		<cfargument name="ruleName" type="string" required="true" hint="The name of the rule to which this assertion corresponds" />
		<cfargument name="continueOnFail" type="boolean" required="false" default="false" hint="Should validation continue if this assertion fails" />
		<cfargument name="args" type="struct" required="false" default="#structNew()#" hint="A collection of arguments to be passed to the validator object along with the data value" />
		<cfargument name="dependencies" type="struct" required="false" default="#structNew()#" hint="A collection of data values upon which validation of the data element depends upon" />
		<cfargument name="messages" type="struct" required="true" hint="A collection of error messages to be returned if the assertion fails" />

		<!--- setup temporary variables --->
		<cfset var assertStr = structNew() />
		<cfset var assertPtr = 0 />

		<!--- check if the specified data set exists --->
		<cfif NOT structKeyExists( variables.instance.dataSets, arguments.dataSetName ) >
			<cfthrow type="validat.invalidAssertion" message="validat: The data set name specified ('#arguments.dataSetName#') does not exist." />
		</cfif>

		<!--- setup the assertion based upon the received arguments --->
		<cfset assertStr.rule = arguments.ruleName />
		<cfset assertStr.assertId = createUUID() />
		<cfset assertStr.continueOnFail = arguments.continueOnFail />
		<cfif NOT structIsEmpty( arguments.args ) >
			<cfset assertStr.args = arguments.args />
		</cfif>
		<cfif NOT structIsEmpty( arguments.dependencies ) >
			<cfset assertStr.dependencies = arguments.dependencies />
		</cfif>
		<cfif NOT structIsEmpty( arguments.messages ) >
			<cfset assertStr.messages = arguments.messages />
		</cfif>

		<!--- add assertion to the end of the array / list --->
		<cfset arrayAppend( variables.instance.dataSets[arguments.dataSetName].assertions, structCopy( assertStr ) ) />

		<cfif listLen( variables.instance.dataSets[arguments.dataSetName].assertionRuleList ) EQ 0 >
			<cfset variables.instance.dataSets[arguments.dataSetName].assertionRuleList = arguments.ruleName />
			<cfset variables.instance.dataSets[arguments.dataSetName].assertionIdList = assertStr.assertId />
		<cfelse>
			<cfset variables.instance.dataSets[arguments.dataSetName].assertionRuleList = listAppend( variables.instance.dataSets[arguments.dataSetName].assertionRuleList, arguments.ruleName ) />
			<cfset variables.instance.dataSets[arguments.dataSetName].assertionIdList = listAppend( variables.instance.dataSets[arguments.dataSetName].assertionIdList, assertStr.assertId ) />
		</cfif>

		<!--- return --->
		<cfreturn />
	</cffunction> <!--- end: addADSssert() --->

	<!--- 
		function: 		getDataStr

		description:	Returns the processed data structure based upon the specified data set name and data collection
	--->
	<cffunction name="getDataStr" access="private" output="false" returntype="struct"
		hint="Returns the processed data structure based upon the specified data set name and data collection">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set by which to validate the data collection" />
		<cfargument name="dataCollection" type="any" required="true" hint="The data collection to be validated" />

		<!--- setup temporary variables --->
		<cfset var transformer = "" />
		<cfset var funcArr = "" />
		<cfset var propArr = "" />
		<cfset var funcPtr = "" />
		<cfset var propPtr = "" />
		<cfset var metadata = "" />
		
		<!--- check the data set definition for a specified transformer --->
		<cfif len( variables.instance.dataSets[arguments.dataSetName].transformer ) >
			<cfset transformer = variables.instance.dataSets[arguments.dataSetName].transformer />
	
		<!--- check if the data collection is a standard bean object --->
		<cfelseif isObject( arguments.dataCollection ) >
			
			<!--- as of CF9, a persistable CFC might have getters/setters, but those may be implicated based on properties.  
			due to this, we're goin to handle persistent CFCs differently --->
			
			<cfset metadata = getMetaData( arguments.dataCollection ) />
			
			<cfif StructKeyExists(metadata, "persistent") AND metadata.persistent>
				<cfset transformer = variables.ormTransformer />
			<cfelse>
				<!--- check if there are getter functions --->
				<cfset funcArr = metadata.functions />
				<cfloop from="1" to="#arrayLen( funcArr )#" index="funcPtr" >
					<cfif findNoCase( "get", funcArr[funcPtr].name ) EQ 1 >
						<cfset transformer = variables.beanTransformer />
						<cfbreak />
					</cfif>
				</cfloop> <!--- end: object function loop --->
			</cfif>
			
		<!--- check if the data collection is a structure --->
		<cfelseif isStruct( arguments.dataCollection ) >
			<cfset transformer = variables.structTransformer />
	
		</cfif>

		<!--- if a transformer was not set, throw an error --->
		<cfif transformer EQ "" >
			<cfthrow type="validat.unknownData" message="validat: The data collection provided is not recognized.  In order to validate this data collection, you must provide an object that follows the transformer interface and register that transformer object with the data set." />
		</cfif>

		<!--- return the results of the getData method --->
		<cfreturn variables.instance.factory.getBean( transformer ).getData( arguments.dataCollection ) />
	</cffunction> <!--- end: getDataStr() --->

	<!--- 
		function: 		parseConfigXML

		description:	Accepts the path to a configuration xml file and parses the contents of that 
						configuration file.  If the configuration xml file contains an include tag, the rules 
						and assertions in the configuration file will be processed, then the function will be 
						recursivly called with the include path provided.  Any rules or assertions in an 
						included file may overwrite any rules or assertions that have already been loaded.
	--->
	<cffunction name="parseConfigXML" access="private" output="false" returntype="void"
		hint="Parses a configuration xml file">

		<cfargument name="configXML" displayname="configXML" type="string" required="true"
			hint="I am the path to the configuration xml file to parse" /> 

		<!--- setup containers --->
		<cfset var xContents = "" />
		<cfset var xConfig = "" />

		<cfset var rulePtr = 0 />
		<cfset var dataPtr = 0 />
		<cfset var includePtr = 0 />

		<!--- read the configuration file content --->
		<cfif fileExists(expandPAth(arguments.configXML)) >
			<cffile action="read" file="#expandPAth(arguments.configXML)#" variable="xContents" />
		<cfelse>
			<cfthrow message="Validator Error:  Configuration file '#expandPAth(arguments.configXML)#' cannot be found." />
		</cfif>
	
		<!--- parse the configuration file to XML and get root element --->
		<cfset xConfig = xmlParse(xContents) />

		<!--- load the validation rules (optional) --->
		<cfif structKeyExists( xConfig.xmlRoot, "validationRules") >
			<!--- for each validation rule specified ... --->
			<cfloop from="1" to="#arrayLen( xConfig.xmlRoot["validationRules"].xmlChildren )#" index="rulePtr">
				<!--- add the validation rule to the rules collection --->
				<cfset addRuleXML( toString(xConfig.xmlRoot["validationRules"].xmlChildren[rulePtr]) ) />
			</cfloop>
		</cfif> <!--- end: load the validation rules --->

		<!--- load the validation assertions (optional) --->
		<cfif structKeyExists( xConfig.xmlRoot, "dataSets") >
			<!--- for each validation assertion specified ... --->
			<cfloop from="1" to="#arrayLen( xConfig.xmlRoot["dataSets"].xmlChildren )#" index="dataPtr">
				<!--- add the validation assertion to the assertion collection --->
				<cfset addDataSetXML( toString(xConfig.xmlRoot["dataSets"].xmlChildren[dataPtr]) ) />
			</cfloop>
		</cfif> <!--- end: load the validation assertions --->

		<!--- parse any included configuration files --->
		<cfif structKeyExists( xConfig.xmlRoot, "include") >
			<!--- for each include specified ... --->
			<cfloop from="1" to="#arrayLen( xConfig.xmlRoot.include )#" index="includePtr">
				<!--- recursively parse the included configuration file --->
				<cfset parseConfigXML( xConfig.xmlRoot.include[includePtr].xmlAttributes.template ) />
			</cfloop>
		</cfif> <!--- end: load the validation assertions --->

		<cfreturn />
	</cffunction> <!--- end: parseConfigXML() --->

	<!--- 
		function: 		validateDataElements

		description:	Attempts to validate a collection of data based upon the data element assertions for
						the specified data set name.  An validation errors will be collected in an 
						errorCollection and returned.
	--->
	<cffunction name="validateDataElements" access="private" output="false" returntype="any"
		hint="Attempts to validate a collection of data based upon the data element assertions for the specified data set name.">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set by which to validate the data collection" />
		<cfargument name="dataCollection" type="struct" required="true" hint="The data collection to be validated" />
		<cfargument name="skipAsserts" type="string" required="false" default="" hint="An optional list of data element names and/or assertion identifiers for which to skip any validation for" />

		<!--- setup temporary variables --->
		<cfset var errorCollection = variables.instance.factory.getBean("errorCollection").init() />
		<cfset var dataElements = "" />
		<cfset var dataElement = "" />
		<cfset var validate = false />
		<cfset var assertions = "" />
		<cfset var assertion = "" />
		<cfset var assertPtr = 0 />
		<cfset var validator = "" />
		<cfset var args = structNew() />
		<cfset var dependencies = structNew() />
		<cfset var dependName = "" />
		<cfset var result = "" />
		
		<!--- get all of the data elements for the data set --->
		<cfset dataElements = getAllDataElements( arguments.dataSetName ) /> 
	
		<!--- loop through the data elements --->
		<cfloop collection="#dataElements#" item="dataElement" >
		
			<!--- get the data element --->
			<cfset dataElement = dataElements[dataElement] />
			
			<!--- if the data element is listed in the skipAsserts list --->
			<cfif listFindNoCase( arguments.skipAsserts, dataElement.name ) >

				<!--- set the validation flag to false to skip checking all assertions for this data element --->
				<cfset validate = false />
			
			<!--- if the data element is required --->
			<cfelseif dataElement.required EQ "true" >
				
				<!--- is the data value present --->
				<cfif structKeyExists( arguments.dataCollection, dataElement.name ) >
				
					<!--- if the data value is a simple value and an empty string --->
					<cfif isSimpleValue( arguments.dataCollection[dataElement.name] ) AND len( trim ( arguments.dataCollection[dataElement.name] ) ) EQ 0 >
					
						<!--- set the validation flag to false to skip checking all assertions for this data element --->
						<cfset validate = false />
						
						<!--- insert an error into the error collection for this data element --->
						<cfset errorCollection.addError( dataElement.name, "", dataElement.message, dataElement.name ) />

					<cfelse> <!--- else: data value is not a simple string or it contains a value --->
						
						<!--- set the validation flag to true to check all assertions for this data element --->
						<cfset validate = true />
											
					</cfif> <!--- end: if the data value is a simple value and an empty string --->
				
				<!--- the data value is not present --->
				<cfelse>
					
					<!--- set the validation flag to false to skip checking all assertions for this data element --->
					<cfset validate = false />
					
					<!--- insert an error into the error collection for this data element --->
					<cfset errorCollection.addError( dataElement.name, "", dataElement.message, dataElement.name ) />
				
				</cfif> <!--- end: if the data value is present --->
			
			<!--- else if the data element is not required --->
			<cfelseif dataElement.required EQ "false" >
				
				<!--- is the data value present --->
				<cfif structKeyExists( arguments.dataCollection, dataElement.name ) >
				
					<!--- if the data value is a simple value and an empty string --->
					<cfif isSimpleValue( arguments.dataCollection[dataElement.name] ) AND len( trim ( arguments.dataCollection[dataElement.name] ) ) EQ 0 >
						
						<!--- set the validation flag to false to skip checking all assertions for this data element --->
						<cfset validate = false />

					<cfelse> <!--- else: data value is not a simple string or it contains a value --->
						
						<!--- set the validation flag to true to check all assertions for this data element --->
						<cfset validate = true />
											
					</cfif> <!--- end: if the data value is a simple value and an empty string --->
				
				<!--- the data value is not present --->
				<cfelse>
					
					<!--- set the validation flag to false to skip checking all assertions for this data element --->
					<cfset validate = false />
				
				</cfif> <!--- end: if the data value is present --->
			
			<!--- else if the data element is optional --->
			<cfelse>
					
				<!--- set the validation flag to false to skip checking all assertions for this data element --->
				<cfset validate = false />
			
			</cfif> <!--- end: if the data element is required --->
			
			<!--- if assertion validation should continue --->
			<cfif validate >
			
				<!--- is the current data element a complex value? --->
				<cfif len( dataElement.connectTo ) >
				
					<!--- recursively validate this data element --->
					<cfset errorCollection.append( this.validate( dataElement.connectTo, arguments.dataCollection[dataElement.name], arguments.skipAsserts ) ) />
				
				<!--- else, validate the data element as a simple value --->
				<cfelse>

					<!--- get the data element assertions --->
					<cfset assertions = dataElement.assertions />
				
					<!--- loop through the data set assertions --->
					<cfloop from="1" to="#arrayLen( assertions )#" index="assertPtr" >
			
						<!--- if the current assertion identifier is included in the list of rules to skip, stop processing --->
						<cfif NOT listFindNoCase( arguments.skipAsserts, assertions[assertPtr].assertId ) >
					
							<!--- locate the corresponding validation rule --->
							<cfif NOT ruleExists( assertions[assertPtr].rule ) >
								<cfthrow type="validat.invalidAssertion" message="validat: The validation rule specified for the assertion ('#assertions[assertPtr].rule#') does not exist." />
							</cfif> <!--- end: the assertion does not match a validation rule --->
			
							<!--- get the validator object for the corresponding validation rule --->
							<cfset validator = variables.instance.factory.getBean( getRule( assertions[assertPtr].rule ).validator ) />
						
							<!--- build an arguments collection to pass to the validator --->
							<cfset args = structNew() />
						
							<!--- insert any default arguments for the validation rule into the argument collection --->
							<cfif structKeyExists( getRule( assertions[assertPtr].rule ), "args" ) >
								<cfset structAppend( args, getRule( assertions[assertPtr].rule ).args ) />
							</cfif>
						
							<!--- insert (and overwrite) any arguments for the data element into the argument collection --->
							<cfif structKeyExists( assertions[assertPtr], "args" ) >
								<cfset structAppend( args, assertions[assertPtr].args, true ) />
							</cfif>
						
							<!--- build a dependencies collection to pass to the validator --->
							<cfset dependencies = structNew() />
							
							<!--- if the assertioh specifies any dependencies, add them to the collection --->
							<cfif structKeyExists( assertions[assertPtr], "dependencies" ) >
							
								<!--- for each dependency --->
								<cfloop collection="#assertions[assertPtr].dependencies#" item="dependName">
								
									<!--- insert the dependency and its value into the collection --->
									<cfif structKeyExists( arguments.dataCollection, structFind( assertions[assertPtr].dependencies, dependName ) ) >
										<cfset dependencies[dependName] = arguments.dataCollection[ structFind( assertions[assertPtr].dependencies, dependName ) ] />
									<cfelse>
										<cfset dependencies[dependName] = "" />
									</cfif>
								
								</cfloop> <!--- end for each dependency --->
							
							</cfif> <!--- end: if the assertioh specifies any dependencies ---> 
						
							<!--- validate the data value --->
							<cfset result = validator.validate( arguments.dataCollection[dataElement.name], args, dependencies ) />
						
							<!--- if the assertion validation fails --->
							<cfif result NEQ true >
						
								<!--- attempt to locate the specified message in the assertion defintion --->
								<cfif structKeyExists( assertions[assertPtr].messages, result ) >
			
									<!--- add an error to the error collection --->
									<cfset errorCollection.addError( dataElement.name, arguments.dataCollection[dataElement.name], assertions[assertPtr].messages[result], assertions[assertPtr].assertId ) />
			
								<!--- attempt to locate the specified message in the default validation rule defintion --->
								<cfelseif structKeyExists( getRule( assertion ).messages, result ) >
			
									<!--- add an error to the error collection --->
									<cfset errorCollection.addError( dataElement.name, arguments.dataCollection[dataElement.name], getRule( assertions[assertPtr].rule ).messages[result], assertions[assertPtr].assertId ) />
			
								<!--- bad error message, throw an error --->
								<cfelse>
									<cfthrow type="validat.invalidMessage" message="validat: The error message returned from the validator ('#result#') does not exist." />
							
								</cfif> <!--- end: attempt to locate the specified message --->
			
								<!--- check the assertion continue attribute --->
								<cfif NOT assertions[assertPtr].continueOnFail >
									<!--- stop validation checks on the current data value --->
									<cfbreak />
								</cfif> <!--- end: if assertion continue attribute is false --->
						
							</cfif> <!--- end: if the assertion validation fails --->
							
						</cfif> <!--- end: if the current assertion identifier is included in the list of rules to skip, stop processing --->
				
					</cfloop> <!--- end: loop over data element assertion --->
				
				</cfif> <!--- end: is the current data element a complex value? --->
			
			</cfif> <!--- end: if assertion validation should continue --->
			
		</cfloop> <!--- end: loop over data elements --->

		<!--- return the error collection --->
		<cfreturn errorCollection />
	</cffunction> <!--- end: validateDataElements() --->

	<!--- 
		function: 		validateDataSet

		description:	Attempts to validate a collection of data based upon the data set assertions for the 
						specified data set name.  An validation errors will be collected in an 
						errorCollection and returned.
	--->
	<cffunction name="validateDataSet" access="private" output="false" returntype="any"
		hint="Attempts to validate a collection of data based upon the data set assertions for the specified data set name.">

		<cfargument name="dataSetName" type="string" required="true" hint="The name of the data set by which to validate the data collection" />
		<cfargument name="dataCollection" type="struct" required="true" hint="The data collection to be validated" />
		<cfargument name="skipAsserts" type="string" required="false" default="" hint="An optional list of assertion identifiers for which to skip any validation for" />

		<!--- setup temporary variables --->
		<cfset var errorCollection = variables.instance.factory.getBean("errorCollection").init() />
		<cfset var assertions = "" />
		<cfset var assertion = "" />
		<cfset var assertPtr = 0 />
		<cfset var validator = "" />
		<cfset var argCollection = structNew() />
		<cfset var dependencies = structNew() />
		<cfset var dependName = "" />
		<cfset var result = "" />
		
			<!--- get the data set assertions --->
			<cfset assertions = getAllAsserts( arguments.dataSetName ) />
		
			<!--- loop through the data set assertions --->
			<cfloop from="1" to="#arrayLen( assertions )#" index="assertPtr" >

				<!--- if the current assertion identifier is included in the list of rules to skip, stop processing --->
				<cfif NOT listFindNoCase( arguments.skipAsserts, assertions[assertPtr].assertId ) >
		
					<!--- locate the corresponding validation rule --->
					<cfif NOT ruleExists( assertions[assertPtr].rule ) >
						<cfthrow type="validat.invalidAssertion" message="validat: The validation rule specified for the assertion ('#assertions[assertPtr].rule#') does not exist." />
					</cfif> <!--- end: the assertion does not match a validation rule --->
	
					<!--- get the validator object for the corresponding validation rule --->
					<cfset validator = variables.instance.factory.getBean( getRule( assertions[assertPtr].rule ).validator ) />
				
					<!--- build an arguments collection to pass to the validator --->
					<cfset argCollection = structNew() />
				
					<!--- insert any default arguments for the validation rule into the argument collection --->
					<cfif structKeyExists( getRule( assertions[assertPtr].rule ), "args" ) >
						<cfset structAppend( argCollection, getRule( assertions[assertPtr].rule ).args ) />
					</cfif>
				
					<!--- insert (and overwrite) any arguments for the data element into the argument collection --->
					<cfif structKeyExists( assertions[assertPtr], "args" ) >
						<cfset structAppend( argCollection, assertions[assertPtr].args, true ) />
					</cfif>
				
					<!--- build a dependencies collection to pass to the validator --->
					<cfset dependencies = structNew() />
					
					<!--- if the assertioh specifies any dependencies, add them to the collection --->
					<cfif structKeyExists( assertions[assertPtr], "dependencies" ) >
					
						<!--- for each dependency --->
						<cfloop collection="#assertions[assertPtr].dependencies#" item="dependName">
						
							<!--- insert the dependency and its value into the collection --->
							<cfif structKeyExists( arguments.dataCollection, structFind( assertions[assertPtr].dependencies, dependName ) ) >
								<cfset dependencies[dependName] = arguments.dataCollection[ structFind( assertions[assertPtr].dependencies, dependName ) ] />
							<cfelse>
								<cfset dependencies[dependName] = "" />
							</cfif>

						</cfloop> <!--- end for each dependency --->
					
					</cfif> <!--- end: if the assertioh specifies any dependencies ---> 
				
					<!--- validate the data value --->
					<cfset result = validator.validate( "", argCollection, dependencies ) />
				
					<!--- if the assertion validation fails --->
					<cfif result NEQ true >
				
						<!--- attempt to locate the specified message --->
						<cfif structKeyExists( assertions[assertPtr].messages, result ) >
	
							<!--- add an error to the error collection --->
							<cfset errorCollection.addError( arguments.dataSetName, "", assertions[assertPtr].messages[result], assertions[assertPtr].assertId ) />
						
						<!--- attempt to locate the specified message in the default validation rule defintion --->
						<cfelseif structKeyExists( getRule( assertions[assertPtr].rule ).messages, result ) >
	
							<!--- add an error to the error collection --->
							<cfset errorCollection.addError( arguments.dataSetName, "", getRule( assertions[assertPtr].rule ).messages[result], assertions[assertPtr].assertId ) />
	
						<!--- bad error message, throw an error --->
						<cfelse>
							<cfthrow type="validat.invalidMessage" message="validat: The error message returned from the validator ('#result#') does not exist." />
					
						</cfif> <!--- end: attempt to locate the specified message --->
	
						<!--- check the assertion continue attribute --->
						<cfif NOT assertions[assertPtr].continueOnFail >
							<!--- stop validation checks on the current data value --->
							<cfbreak />
						</cfif> <!--- end: if assertion continue attribute is false --->
				
					</cfif> <!--- end: if the assertion validation fails --->
						
				</cfif> <!--- end: if the current assertion identifier is included in the list of rules to skip, stop processing --->
		
			</cfloop> <!--- end: loop over data set assertion --->

		<!--- return the error collection --->
		<cfreturn errorCollection />
	</cffunction> <!--- end: validateDataSet() --->

</cfcomponent>