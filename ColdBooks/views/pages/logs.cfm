<cfset Id = event.getValue("Id") />
<cfset xe.viewLogDetail = event.getValue("xe.viewLogDetail") />
<cfset Connection = event.getValue("Connection") />

<link href="css/xml.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="scripts/xmldisplay.js"></script>
<script language="JavaScript" type="application/javascript" src="scripts/jquery-1.3.2.min.js"></script>

<script type="text/javascript">
	showLogDetail = function(id){
		if(id){
			ColdFusion.navigate("index.cfm?event=viewLogDetail&id=" + id, "logDetail", formatXml);
		}
		return "";
	} 
	
	formatXml = function(){
		var xml = $("#RequestXml");
		LoadXMLString(xml.get(0), xml.text());
		
		var xml = $("#ResponseXml");
		LoadXMLString(xml.get(0), xml.text());
	}
	
</script>

<h2 class="pageHeader">ColdBooks Connection Log</h2>

<!---<cfdump var="#Id#" />
<cfdump var="#Connection#" />--->
<cfform>
<cfgrid name="reportsGrid" format="html" pageSize="10" stripeRows="true" bind="cfc:CFIDE.administrator.ColdBooks.remote.remoteConnectionService.getConnectionLog(#Id#, {cfgridpage},{cfgridpagesize},{cfgridsortcolumn},{cfgridsortdirection})" selectonload="false">
	<cfgridcolumn name="id" display="false">
	<cfgridcolumn name="createdDate" header="Created">
	<cfgridcolumn name="modifiedDate" header="Modified">
	<cfgridcolumn name="callbackCfc" header="Callback CFC">
	<cfgridcolumn name="callbackFunction" header="Callback Function">
	<cfgridcolumn name="returnFormat" header="Callback Format">
	<cfgridcolumn name="request" header="Request XML">
	<cfgridcolumn name="response" header="Response XML">
	<cfgridcolumn name="error" header="Error Text">
</cfgrid>

<!--- url:index.cfm?event=viewLogDetail&id={reportsGrid.id} --->
<cfdiv id="logDetail" bind="javascript:showLogDetail({reportsGrid.id})" bindonload="false">
</cfdiv>

</cfform>