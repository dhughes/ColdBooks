<cfif NOT IsDefined("session.javaLoader")>
	<cfset session.javaLoader = CreateObject("component", "model.javaloader.ExpandingJavaLoader").init(["../java/bin"], true) />
</cfif>

<cfdirectory action="list" directory="#expandPath("../java/bin")#" recurse="true" filter="*.class" name="classes" />

<cfset reflector = new reflector() />

<!---<cfdump var="#classes#" top="20">--->

<cfset Objects = {} /> 

<cfloop query="classes">
	<cfif Right(classes.name, 9) IS "Add.class" OR Right(classes.name, 9) IS "Mod.class" OR Right(classes.name, 9) IS "Ret.class" OR Right(classes.name, 9) IS "Ref.class">
		
		<cfif Right(classes.name, 9) IS "Add.class" OR Right(classes.name, 9) IS "Mod.class" OR Right(classes.name, 9) IS "Ret.class">
			<cfset className = Left(classes.name, Len(classes.name)-9) />
		<cfelseif Right(classes.name, 9) IS "Ref.class">
			<cfset className = Left(classes.name, Len(classes.name)-6) />
		</cfif>
		
		<!--- figure out if this is an add, mod or query class --->
		<cfswitch expression="#Left(Right(classes.name, 9), 3)#">
			<cfcase value="Add">
				<cfset action = "Add" />
			</cfcase>
			<cfcase value="Mod">
				<cfset action = "Mod" />
			</cfcase>
			<cfcase value="Ret">
				<cfset action = "Query" />
			</cfcase>
			<cfcase value="Ref">
				<cfset action = "Reference" />
			</cfcase>
		</cfswitch>
		
		<!--- check to see if we've already seen this object --->
		<cfif NOT StructKeyExists(Objects, className)>
			<cfset Objects[className] = {} />
			<cfset Objects[className].editions = {} />
			<cfset Objects[className].properties = {} />
		</cfif>
		
		<!--- check to see if this edition is already noted for the class --->
		<cfset edition = ListGetAt(classes.directory, ListLen(classes.directory, "/")-1, "/") />

		<cfif NOT StructKeyExists(Objects[className].editions, edition)>
			<cfset Objects[className].editions[edition] = [] />
		</cfif>

		<!--- check to see if this version is already noted for the edition --->
		<cfset version = ListGetAt(classes.directory, ListLen(classes.directory, "/"), "/") />
		
		<cfif NOT arrayFind(Objects[className].editions[edition], version)>
			<cfset arrayAppend(Objects[className].editions[edition], version) />
		</cfif>

		<!--- get the functions on the current class --->
		<cfset methods = reflector.getClassInfoFromObject(session.javaLoader.create("com.alagad.ColdBooks.#edition#.#version#.#ListFirst(classes.name, ".")#")).methods />
		
		<cfloop array="#methods#" index="method">
		
			<cfif Left(method.name, 3) IS "get" AND method.name IS NOT "getClass">
				<cfset field = Right(method.name, Len(method.name)-3)>
				<cfset datatype = getDataType(method.returnType) />
				
				<!--- does this method "ref"er to another object? --->
				<cfset isref = Right(field, 3) IS "Ref" />
				
				<!--- has this field already been noted in the class? --->
				<cfif NOT structKeyExists(Objects[className].properties, field)>
					<cfset Objects[className].properties[field] = {} />
					<cfset Objects[className].properties[field].editions = {} />
					<cfset Objects[className].properties[field].actions = [] />
					<cfset Objects[className].properties[field].isRef = isref />
					
					<!--- find the orriginal type.  This *MAY* change if Intiut is inconsistent.  Let's hope not --->
					<cfset Objects[className].properties[field].type = datatype />	
					<cfset Objects[className].properties[field].otherTypes = [] />
				</cfif>
				
				<!--- has this type changed for whatever reason? --->
				<cfif datatype IS NOT Objects[className].properties[field].type
					AND NOT ArrayFind(Objects[className].properties[field].otherTypes, datatype)>
					<cfset ArrayAppend(Objects[className].properties[field].otherTypes, datatype) />
				</cfif>
				
				<!--- note the version edition and version this function is in --->
				<cfif NOT StructKeyExists(Objects[className].properties[field].editions, edition)>
					<cfset Objects[className].properties[field].editions[edition] = [] />
				</cfif>
				<cfif NOT arrayFind(Objects[className].properties[field].editions[edition], version)>
					<cfset arrayAppend(Objects[className].properties[field].editions[edition], version) />
				</cfif>
				
				<!--- record the action where this property is used --->
				<!--- here's to hoping that there aren't differences in where data is accessable and changable between editions and versions --->
				<cfif NOT ArrayFind(Objects[className].properties[field].actions, action)>
					<cfset ArrayAppend(Objects[className].properties[field].actions, action) />
				</cfif>
			
			</cfif>
		</cfloop>
		
	</cfif>
</cfloop>

<cffunction name="getDataType">
	<cfargument name="type" />
	
	<cfswitch expression="#type#">
		<cfcase value="java.lang.string">
			<cfreturn "string" />
		</cfcase>
		
		<cfcase value="java.math.BigInteger,int,java.lang.Integer">
			<cfreturn "numeric" />
		</cfcase>
		
		<cfcase value="java.util.List">
			<!--- I'm not dealing with arrays yet --->
			<cfreturn "Object[]" />
		</cfcase>
		
	</cfswitch>
	
	<cfif Left(type, 21) IS "com.alagad.ColdBooks.">
		<cfreturn ListLast(type, ".") />
	</cfif>

</cffunction>

<cffunction name="generateEntity" output="true">
	<cfargument name="name" />
	<cfargument name="Object" />
	
	<cfsavecontent variable="script">
component extends="model.entity.quickbooks.Entity" persistent="true"{
	
	property name="id" type="numeric" fieldtype="id" ormtype="integer" generator="identity" displayname="id" hint="Unique identifier" accessors="true";
	property name="createdDate" type="any" ormtype="timestamp" displayname="Date created" accessors="true";
	property name="modifiedDate" type="any" ormtype="timestamp" displayname="Date modified" accessors="true";
	<cfloop collection="#Object.properties#" item="property">
	property name="#property#" type="#Object.properties[property].type#" ormtype="#Object.properties[property].type#" length="512";
	</cfloop>
	
	function init(edition, version){
		var editions = {};
		<cfloop collection="#Object.editions#" item="edition">
		editions["#edition#"] = ListToArray("#Replace(ArrayToList(Object.editions[edition]), "v", "", "all")#");
		</cfloop>
		// check if this object exists in this edition and version
		if(NOT StructKeyExists(editions, edition) OR NOT ArrayFind(editions[edition], version)){
			throw("Object of type '##name##' is not supported in the '##edition##' edition and/or QBXML version '##Left(version, 1)##.##Right(version, 1)##'.");
		}
		
		// set the actual edition and version
		variables.edition = edition;
		variables.version = version;
		
		return this;
	}
	
	// generated accessors
	<cfloop collection="#Object.properties#" item="property">
	function get#property#(){
		// check to see if this property is supported in this edition
		var editions = {};
		<cfloop collection="#Object.properties[property].editions#" item="edition">
		editions["#edition#"] = ListToArray("#Replace(ArrayToList(Object.properties[property].editions[edition]), "v", "", "all")#");
		</cfloop>
		
		// check if this property exists in this edition and version
		if(NOT StructKeyExists(editions, edition) OR NOT ArrayFind(editions[edition], version)){
			throw("Object of type '##name##'s property '#property#' is not supported in the '##edition##' edition and/or QBXML version '##Left(version, 1)##.##Right(version, 1)##'.");
		}
		
		return variables.#property#;
	}
	
	<cfif ArrayFind(Object.properties[property].actions, "Add") OR ArrayFind(Object.properties[property].actions, "Mod") OR ArrayFind(Object.properties[property].actions, "Reference")>
	function set#property#(#property#){
		// check to see if this property is supported in this edition
		var editions = {};
		<cfloop collection="#Object.properties[property].editions#" item="edition">
		editions["#edition#"] = ListToArray("#Replace(ArrayToList(Object.properties[property].editions[edition]), "v", "", "all")#");
		</cfloop>
		
		// check if this property exists in this edition and version
		if(NOT StructKeyExists(editions, edition) OR NOT ArrayFind(editions[edition], version)){
			throw("Object of type '##name##'s property '#property#' is not supported in the '##edition##' edition and/or QBXML version '##Left(version, 1)##.##Right(version, 1)##'.");
		}
		
		// check to see if this object has an ID yet.
		if(
			(Val(getId()) AND ListFind("#ArrayToList(Object.properties[property].actions)#", "Mod"))
			OR
			(NOT Val(getId()) AND ListFind("#ArrayToList(Object.properties[property].actions)#", "Add"))
			OR 
			(ListFind("#ArrayToList(Object.properties[property].actions)#", "Reference"))
		){
			variables.#property# = #property#;				
		} else {
			throw("The property '#property#' can not be set at this time.");
		}
	}
	</cfif>
	</cfloop>

}	
	</cfsavecontent>
	
	<cffile action="write" output="#script#" file="#expandPath("../model/entity/quickbooks/entity/#name#.cfc")#" />
	
</cffunction>


<!--- so, now I know all about all the objects.  I now need to generate my entities --->
<cfloop collection="#Objects#" item="name">
	<cfoutput>#name#</br></cfoutput>
	<cfflush />
	
	<cfset object = Objects[name] />
	
	<cfset generateEntity(name, object) />	
	
</cfloop>

<h1>Done!</h1>
<!---<cfdump var="#Objects#" />--->