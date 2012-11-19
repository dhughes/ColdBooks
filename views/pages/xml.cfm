<cfset message = event.getValue("message") />

<cfif event.getValue("type") IS "request">
	<cfset xml = message.getRequest() />
<cfelse>
	<cfset xml = message.getResponse() />
</cfif>

<cfcontent reset="true" /><cfheader name="content-type" value="text/xml" /><cfoutput>#xml#</cfoutput>