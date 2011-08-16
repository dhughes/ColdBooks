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
	<cfif IsDate(message.getRunAfterDateTime())>
		<p>#LsDateFormat(message.getRunAfterDateTime())# #LsTimeFormat(message.getRunAfterDateTime())#</p>
	<cfelse>
		<p><em>N/A</em></p>
	</cfif>

	<h3>Request XML</h3>
	<div id="request">
		<form>Show as:
			<input type="radio" name="request" value="xml" checked="checked"/> Xml
			<input type="radio" name="request" value="text"/> Text
		</form>
		<div id="requestXml" class="xml">#htmlEditFormat(message.getrequest())#</div>
		<div class="text">#htmlEditFormat(message.getrequest())#</div>
	</div>

	<cfif IsXml(message.getresponse())>
		<h3>Response XML</h3>
		<div id="response">
			<form>Show as:
				<input type="radio" name="response" value="xml" checked="checked"/> Xml
				<input type="radio" name="response" value="text"/> Text
			</form>
			<div id="responseXml" class="xml">#htmlEditFormat(message.getresponse())#</div>
			<div class="text">#htmlEditFormat(message.getresponse())#</div>
		</div>
	<cfelseif NOT Len(message.getresponse())>
		<h3>Response Text</h3>
		<i>[Empty String]</i>
	<cfelse>
		<h3>Response Text</h3>
		#htmlEditFormat(message.getresponse())#
	</cfif>
	
	<cfif IsXml(message.geterror())>
		<h3>Error Xml</h3>
		<div id="error">
			<form>Show as:
				<input type="radio" name="error" value="xml" checked="checked"/> Xml
				<input type="radio" name="error" value="text"/> Text
			</form>
			<div id="errorXml" class="xml">#htmlEditFormat(message.geterror())#</div>
			<div class="text">#htmlEditFormat(message.geterror())#</div>
		</div>
	<cfelseif NOT Len(message.geterror())>
		<h3>Error Text</h3>
		<i>[Empty String]</i>
	<cfelseif isJSON(message.geterror())>
		<h3>Error Data</h3>
		<cfdump var="#deserializeJSON(message.geterror())#" />
	<cfelse>
		<h3>Error Text</h3>
		#htmlEditFormat(message.geterror())#
	</cfif>
	
</cfoutput>