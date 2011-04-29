<cfset connection = event.getValue("Connection") />
<cfset errors = event.getValue("errors") />
<cfset xe.connections = event.getValue("xe.connections") />
<cfset xe.saveConnection = event.getValue("xe.saveConnection") />
<cfset xe.deleteConnection = event.getValue("xe.deleteConnection") />

<cfimport taglib="../../customtags" prefix="v" />

<script language="JavaScript" type="application/javascript" src="scripts/jquery-1.3.2.min.js"></script>
<script language="JavaScript" type="application/javascript" src="scripts/connection.js"></script>

<link href="css/stylesheet.css" rel="stylesheet" type="text/css" />

<h2 class="pageHeader">Add / Edit QuickBooks Connection</h2>

<p>Use the form below to create a new connection to QuickBooks using ColdBooks.</p>

<cfform action="#event.linkTo(xe.saveConnection)#">
	<cfinput type="hidden" name="id" value="#event.getValue("id", connection.getId())#" maxlength="255" />
	<table border="0" cellspacing="0" cellpadding="2" width="100%" class="lined">
	<tr>
		<td width="125">
			<label for="name">
				Connection Name
			</label>
		</td>
		<td>
			<cfinput type="text" name="name" value="#event.getValue("name", connection.getName())#" maxlength="255" />
			<v:validationErrors validation="#errors#" property="name" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="description">
				Description
			</label>
		</td>
		<td>
			<cftextarea name="description" value="#event.getValue("description", connection.getDescription())#" />
			<v:validationErrors validation="#errors#" property="description" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="password">
				Password
			</label>
		</td>
		<td>
			<cfinput type="password" name="password" value="#event.getValue("password", connection.getPasswordHash())#" maxlength="255" />
			<cfinput type="hidden" name="passwordHash" value="#event.getValue("passwordHash", connection.getPasswordHash())#" maxlength="255" />
			<v:validationErrors validation="#errors#" property="passwordHash" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="supportUrl">
				Support URL
			</label>
		</td>
		<td>
			<cfinput type="text" name="supportUrl" value="#event.getValue("supportUrl", connection.getSupportUrl())#" maxlength="255" onchange="setWebServiceUrl(this.value);" /><br/>
			<small>Example: http://www.example.com/path/to/support/url.<br />
			It's important to note that the web service URL must be on
			the same host name as the Support URL. For this reason, the path to the web service will be generated for you. <br/>
			IP Addresses will not work.<br />
			The only way to have your web service URL not run under SSL is if you use localhost.</small>
			<v:validationErrors validation="#errors#" property="supportUrl" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="password">
				Web Service URL
			</label>
		</td>
		<td>
			<cfinput type="hidden" name="webserviceUrl" value="#event.getValue("webserviceUrl", connection.getWebServiceUrl())#" maxlength="255" />
			<cfoutput>
				<span id="webserviceUrlText">#event.getValue("webserviceUrl", connection.getWebServiceUrl())#</span>
			</cfoutput>
			<v:validationErrors validation="#errors#" property="webserviceUrl" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="name">
				Read Only
			</label>
		</td>
		<td>
			<cfinput type="radio" name="isReadOnly" value="false" checked="#event.getValue("isReadOnly", connection.getIsReadOnly()) IS false#" />No
			<cfinput type="radio" name="isReadOnly" value="true" checked="#event.getValue("isReadOnly", connection.getIsReadOnly()) IS true#" />Yes
			<v:validationErrors validation="#errors#" property="isReadOnly" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="name">
				Personal Data
			</label>
		</td>
		<td>
			<select name="personalDataPref">
				<cfoutput>
					<option value="notNeeded" #Iif(event.getValue("personalDataPref", connection.getPersonalDataPref()) IS 'notNeeded', De('selected="selected"'), De(''))#>Not Needed</option>
					<option value="optional" #Iif(event.getValue("personalDataPref", connection.getPersonalDataPref()) IS 'optional', De('selected="selected"'), De(''))#>Optional</option>
					<option value="required" #Iif(event.getValue("personalDataPref", connection.getPersonalDataPref()) IS 'required', De('selected="selected"'), De(''))#>Required</option>
				</cfoutput>
			</select>
			<v:validationErrors validation="#errors#" property="personalDataPref" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="name">
				Scheduled Interval
			</label>
		</td>
		<td>
			Run every <cfinput type="text" name="schedulerInterval" value="#event.getValue("schedulerInterval", connection.getSchedulerInterval())#" size="4" maxlength="4" />
			<select name="schedulerUnit">
				<cfoutput>
					<option value="" #Iif(event.getValue("schedulerUnit", connection.getschedulerUnit()) IS '', De('selected="selected"'), De(''))#></option>
					<option value="minutes" #Iif(event.getValue("schedulerUnit", connection.getschedulerUnit()) IS 'minutes', De('selected="selected"'), De(''))#>Minutes</option>
					<option value="seconds" #Iif(event.getValue("schedulerUnit", connection.getschedulerUnit()) IS 'seconds', De('selected="selected"'), De(''))#>Seconds</option>
				</cfoutput>
			</select><br />
			<small>Leave blank for no schedule</small>
			<v:validationErrors validation="#errors#" property="schedulerInterval" />
			<v:validationErrors validation="#errors#" property="schedulerUnit" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="name">
				Connection ID
			</label>
		</td>
		<td>
			<cfinput type="text" name="connectionId" value="#event.getValue("connectionId", connection.getConnectionId())#" maxlength="255" size="35" /><br />
			<small>The Connection ID uniquely identifies <em>this</em> connection to quickbooks for whatever purposes you make.  If you
			ever delete this connection you'll want to recreate it with the same Connection ID.  In general, just leave this value
			to the generated value.</small>

			<v:validationErrors validation="#errors#" property="connectionId" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="name">
				Log Retention
			</label>
		</td>
		<td>
			<cfinput type="radio" name="logRetention" value="all" checked="#event.getValue("logRetention", connection.getLogRetention()) IS 'all'#" />
			Retain all logs. (May include sensitive or personal information from QuickBooks.)<br />

			<cfinput type="radio" name="logRetention" value="errored" checked="#event.getValue("logRetention", connection.getLogRetention()) IS 'errored'#" />
			Retain only errored requests. (May include sensitive or personal information when CFC callbacks throw errors.)<br />

			<cfinput type="radio" name="logRetention" value="none" checked="#event.getValue("logRetention", connection.getLogRetention()) IS 'none'#" />
			Retain no logs. (Will not include sensitive or personal information from QuickBooks nor any other useful debugging information.)<br />

			<small>ColdBooks stores requests in a database until they are fulfilled.  For record keeping or debugging purposes you can keep a log of requests and their responses or error messages.
			However, certain requests may include sensitive or personal information such as social security numbers, account numbers, and more.  You should consider how you want to store that information.</small>

			<v:validationErrors validation="#errors#" property="logRetention" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="name">
				Log Truncation
			</label>
		</td>
		<td>
			Truncate logs after
			<cfinput type="text" name="logTruncation" value="#event.getValue("logTruncation", connection.getlogTruncation())#" maxlength="10" size="4" />
			days.<br/>

			<small>This indicates how many days logs will be kept before being deleted.  A value of 0 means no logs will be kept (errors or otherwise).</small>

			<v:validationErrors validation="#errors#" property="logTruncation" />
		</td>
	</tr>
	<tr>
		<td width="125">
			<label for="name">
				Event Listeners
			</label>
		</td>
		<td>
			<cftextarea name="eventListeners" value="#event.getValue("eventListeners", connection.geteventListeners())#" style="width: 100%; height: 50px;" />
			<br />
			<small>You can specify fully qualified paths to CFCs (one per line) that you wish to handle events raised by ColdBooks such as onSendRequest, onError, onBeforeAuthenticate, etc.</small>

			<v:validationErrors validation="#errors#" property="eventListeners" />
		</td>
	</tr>

	<tr class="cellBlueTopAndBottom" bgcolor="#F3F7F7">
		<td colspan="2" >

			<table width="100%">
			<tr>
				<td align="right">

					<cfinput type="Submit" name="adminsubmit" value="Submit" class="buttn" >
					<cfinput type="button" name="cancelSubmit" value="Cancel" class="buttn" onclick="if(confirm('Are you sure you want to cancel?')){window.location.href = '#event.linkTo(xe.connections)#';}" >

				</td>
			</tr>
			</table>
		</td>
	</tr>


	</table>

</cfform>