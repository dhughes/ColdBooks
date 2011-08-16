<cfset Id = event.getValue("Id") />
<cfset xe.viewLogDetail = event.getValue("xe.viewLogDetail") />
<cfset Connection = event.getValue("Connection") />

<link href="css/xml.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="scripts/xmldisplay.js"></script>
<script language="JavaScript" type="application/javascript" src="scripts/jquery-1.6.2.min.js"></script>
<script language="JavaScript" type="application/javascript" src="scripts/logs.js"></script>
<cfoutput>
<script type="text/javascript">
	var connectionId = #Id#;
</script>


<h2 class="pageHeader">ColdBooks Connection Log for #Connection.getName()#</h2>
</cfoutput>
<!---<cfdump var="#Id#" />
<cfdump var="#Connection#" />--->
<cfform>
<cfgrid name="reportsGrid" format="html" pageSize="10" stripeRows="true" bind="cfc:CFIDE.administrator.ColdBooks.remote.remoteConnectionService.getConnectionLog(#Id#, {cfgridpage},{cfgridpagesize},{cfgridsortcolumn},{cfgridsortdirection})" selectonload="false" multirowselect="true" onLoad="gridLoaded">
	<cfgridcolumn name="id" display="false">
	<cfgridcolumn name="messageId" header="Message ID" display="false">
	<cfgridcolumn name="createdDate" header="Created">
	<cfgridcolumn name="modifiedDate" header="Modified">
	<cfgridcolumn name="callbackCfc" header="Callback CFC">
	<cfgridcolumn name="callbackFunction" header="Callback Function">
	<cfgridcolumn name="returnFormat" header="Callback Format">
	<cfgridcolumn name="request" header="Request XML">
	<cfgridcolumn name="response" header="Response XML">
	<cfgridcolumn name="error" header="Error Text">
	<cfgridcolumn name="runAfterDateTime" header="Run After">
	<cfgridcolumn name="delete" header="" width="20">
</cfgrid>

<!--- url:index.cfm?event=viewLogDetail&id={reportsGrid.id} --->
<div id="logDetail">
</div>

</cfform>