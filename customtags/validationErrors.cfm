<cfif thisTag.executionMode IS "start">
	<cfsilent>
		<cfparam name="attributes.validation"/>
		<cfparam name="attributes.property" />
	</cfsilent>
	
	<cfif IsStruct(attributes.validation) AND  structKeyExists(attributes.validation, attributes.property)>
		<cfset errs = attributes.validation[attributes.property].errors />
		
		<ul class="errors">
		<cfoutput>
		<cfloop from="1" to="#arrayLen(errs)#" index="i">
			<li>#errs[i].message#</li>
		</cfloop>
		</cfoutput>
		</ul>
	</cfif>
</cfif>