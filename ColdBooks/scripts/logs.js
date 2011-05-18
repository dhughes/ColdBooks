
function gridLoaded(){
	var grid = ColdFusion.Grid.getGridObject("reportsGrid");
	var bbar = grid.getBottomToolbar();
	
	bbar.add('-', {
        pressed: false,
        enableToggle:false,
        text: 'Delete Selected',
        icon:'images/no.png',//Icon graphic
        cls: 'x-btn-text-icon',//The ext class that will display the button with text/icon properly
        handler:deleteMessages//Our javascript handler function that displays the alert
	});

	bbar.add('-', {
        pressed: false,
        enableToggle:false,
        text: 'Delete All',
        icon:'images/cancel.png',//Icon graphic
        cls: 'x-btn-text-icon',//The ext class that will display the button with text/icon properly
        handler:deleteAllMessages//Our javascript handler function that displays the alert
	});

    //Reconfigure the layout of the toolbar again, this causes the button to show on the toolbar
    bbar.doLayout();

	grid.addListener("rowclick", this.rowClicked);

	$("td.x-grid3-hd div.x-grid3-hd-inner div.x-grid3-hd-checker").click(function(event){
		var extButton = $(event.target);

		if(extButton.parent().hasClass("x-grid3-hd-checker-on")){
			showLogMultiple();
		} else {
			clearLogDetail();
		}
	})
};

function rowClicked(){
	var rows = ColdFusion.Grid.getSelectedRows("reportsGrid");

	if(rows.length == 1){
		showLogDetail(rows[0]["ID"]);
	} else {
		showLogMultiple();
	}
}

function deleteMessages(){
	var data = ColdFusion.Grid.getGridObject("reportsGrid").store;
	var rows = ColdFusion.Grid.getSelectedRows("reportsGrid");
	var ids = "";
	for(var i = 0 ; i < rows.length ; i++){
		//console.log(rows[i]["ID"]);
		ids += rows[i]["ID"] + ",";
		data.removeAt(data.findExact("ID", rows[i]["ID"]));
	}

	// delete these logs
	$.get("/CFIDE/administrator/ColdBooks/remote/remoteConnectionService.cfc?method=deleteMessages&ids=" + ids, function(event){
		ColdFusion.Grid.refresh("reportsGrid");
		clearLogDetail();
	});
}

function deleteAllMessages(){
	if(confirm('Are you sure you want to delete ALL messages from this connection? All unsent, sent, and errored messages will be perminently deleted!')){
		// delete these logs
		$.get("/CFIDE/administrator/ColdBooks/remote/remoteConnectionService.cfc?method=deleteAllMessages&connectionId=" + connectionId, function(event){
			ColdFusion.Grid.refresh("reportsGrid");
			clearLogDetail();
		});
	}
}

showLogDetail = function(id){
	if(id){
		ColdFusion.navigate("index.cfm?event=viewLogDetail&id=" + id, "logDetail", formatXml);
	}
	return "";
}

showLogMultiple = function(){
	$("#logDetail").html('<h2 class="pageHeader">Log Detail</h2><p>Can not show more than one message at a time.</p>');
}

clearLogDetail = function(){
	$("#logDetail").html("");
}

formatXml = function(){
	var xml = $("#RequestXml");
	LoadXMLString(xml.get(0), xml.text());

	var xml = $("#ResponseXml");
	LoadXMLString(xml.get(0), xml.text());
}
