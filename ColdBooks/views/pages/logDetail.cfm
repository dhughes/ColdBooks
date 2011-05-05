<cfset message = event.getValue("message") />

<h2 class="pageHeader">Log Detail</h2>

<cfoutput>
	<h3>Created</h3>
	<p>#LsDateFormat(message.getcreatedDate())# at #LsTimeFormat(message.getcreatedDate())#</p>

	<h3>Last Modified</h3>
	<p>#LsDateFormat(message.getModifiedDate())# at #LsTimeFormat(message.getModifiedDate())#</p>
	
	<h3>Callback CFC</h3>
	<p>#message.getCallbackCfc()#</p>
	
	<h3>Callback Function & Type</h3>
	<p>#message.getCallbackFunction()#(#message.getReturnFormat()#)</p>

	<h3>Run After</h3>
	<p>#LsDateFormat(message.getRunAfterDateTime())# #LsTimeFormat(message.getRunAfterDateTime())#</p>

	<h3>Request XML</h3>
	<div id="RequestXml">#htmlEditFormat(message.getrequest())#</div>
	
	<h3>Response XML</h3>
	<cfif IsXml(message.getresponse())>
		<div id="ResponseXml">#htmlEditFormat(message.getresponse())#</div>
	<cfelseif NOT Len(message.getresponse())>
		<i>[Empty String]</i>
	<cfelse>
		#message.getresponse()#
	</cfif>
	
	<h3>Error</h3>
	<cfif IsXml(message.geterror())>
		#message.geterror()#
	<cfelseif NOT Len(message.geterror())>
		<i>[Empty String]</i>
	<cfelse>
		#message.geterror()#
	</cfif>
	
</cfoutput>