<cfset errorReport = event.getValue("errorReport") />

<link href="css/xml.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="scripts/xmldisplay.js"></script>

<cfsavecontent variable="script">
<script>
	showError = function(id){
		ColdFusion.navigate("index.cfm?event=viewLogDetail&id=" + id, "logDetail", formatXml);
		return false;
	}

	formatXml = function(){
		$("#logDetail input[type='radio']").click(function(){
			var xml = $("#" + $(this).attr('name') + " div.xml");
			var text = $("#" + $(this).attr('name') + " div.text");
			if($(this).val() == "xml"){
				xml.show();
				text.hide();
			} else {
				xml.hide();
				text.show();
			}
		});
		$(".xml").each(function(index){
			var xml = $(this);

			LoadXMLString(xml.attr("id"), xml.text());
		});
		$(".text").hide();
	}
</script>
</cfsavecontent>
<cfhtmlhead text="#script#" />


<h2 class="pageHeader">Error Breakdown</h2>
<p>The following is a breakdown of errors by quickbooks message, error code, error message, and then specific messages that produced that error.</p>
<cfform name="errors">

	<cftree name="analysis"
		height="350"
		format="html">

		<cfoutput query="errorReport" group="requestName">
			<cftreeitem value="#requestName#" />

			<cfoutput group="statusCode">
				<cftreeitem value="#statusCode#" parent="#requestName#" expand="false" />

				<cfoutput group="statusMessage">
					<cftreeitem value="#htmlCodeFormat(statusMessage)#" parent="#statusCode#" expand="false" />

					<cfoutput>
						<cftreeitem value="#id#" parent="#htmlCodeFormat(statusMessage)#" href="javascript:showError(#id#)" />

					</cfoutput>
				</cfoutput>
			</cfoutput>


		</cfoutput>

	</cftree>

</cfform>

<!--- url:index.cfm?event=viewLogDetail&id={reportsGrid.id} --->
<div id="logDetail">
</div>

