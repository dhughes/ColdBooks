<cfcomponent output="false" hint="I represent a message and its arguments.">

<cfproperty name="name" type="string" hint="The name of the message." />
<cfproperty name="arguments" type="ModelGlue.gesture.collections.MapCollection" hint="The collection of arguments associated with the message." />

<cfset this.name = "" />
<cfset this.arguments = createObject("component", "ModelGlue.gesture.collections.MapCollection").init() />

</cfcomponent>