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
	displayname="csFactory"
	output="false"
	hint="Provides a wrapper for the ColdSpring bean factory with a common API that the validat object can utilize.">
	
	<!--- ------------------------------------------------------------ --->
	<!--- constructor --->

	<cffunction name="init" access="public" returntype="csFactory"
		hint="The default constructor for the factory, returning the initialized factory instance">

		<!--- create container for protected instance data --->
		<cfset variables.instance = structNew() />
			
		<!--- return the initialized validatoin rule --->
		<cfreturn this />	
	</cffunction> <!--- end: init() --->
	
	<!--- ------------------------------------------------------------ --->
	<!--- public methods --->

	<!--- 
		function: getBean"
	
		description:	Utilizes the bean factory to create a new instance of the requested object (bean).
	--->
	<cffunction name="getBean" access="public" output="false" returntype="any" 
		hint="Utilizes the bean factory to create a new instance of the requested object (bean).">
		
		<cfargument name="beanName" type="string" required="true" hint="The name of the object (bean) to request from the bean factory" />

		<!--- request and return the object from the bean factory --->
		<cfreturn getBeanFactory().getBean(arguments.beanName) />
	</cffunction> <!--- end: getBean"() --->

	<!--- 
		function: setBeanFactory
	
		description:	Stores a copy of the ColdSpring bean factory into the factory instance.
	--->
	<cffunction name="setBeanFactory" access="public" output="false" returntype="void" 
		hint="Stores a copy of the ColdSpring bean factory into the factory instance.">
		
		<cfargument name="beanFactory" type="coldspring.beans.beanFactory" _type="coldspring.beans.beanFactory" required="true" hint="An instance of the ColdSpring bean factory" />

		<!--- insert the bean factory into the factory instance --->
		<cfset variables.beanFactory = arguments.beanFactory />

		<cfreturn />
	</cffunction> <!--- end: setBeanFactory() --->

	<!--- ------------------------------------------------------------ --->
	<!--- private methods --->

	<!--- 
		function: getBeanFactory
	
		description:	Retrieves the ColdSpring bean factory from the factory instance.
	--->
	<cffunction name="getBeanFactory" access="private" output="false" returntype="any" 
		hint="Retrieves the ColdSpring bean factory from the factory instance.">

		<!--- return the bean factory from the factory instance --->
		<cfreturn variables.beanFactory />
	</cffunction> <!--- end: getBeanFactory() --->

</cfcomponent>