

setWebServiceUrl = function(localUrl){
	
	localUrl = localUrl.toLowerCase();
	
	// insure there is an http:// or https:// on the beginning of the localUrl
	if(localUrl.indexOf("http://") != -1 || localUrl.indexOf("https://") != -1){
		url = localUrl.split("/")[2];
		
		if (!isIP(url)) {
		
			if (url.toLowerCase() == "localhost") {
				url = "http://localhost";
			}
			else {
				url = "https://" + url;
			}
			
			url += "/CFIDE/administrator/ColdBooks/remote/qbwc.cfc";
			
			$("#webserviceUrlText").html(url);
			$("#webserviceUrlText").css( "color", "black" );
			$("#webserviceUrl").val(url);
		} else {
			// this is an IP address.
			$("#webserviceUrlText").html("Unable generate web service URL based on an IP address for the support URL.  Please provide a fully qualified domain name including a host name.");
			$("#webserviceUrlText").css( "color", "red" );
			$("#webserviceUrl").val("");
			
		}
	} else {
		$("#webserviceUrlText").html("Unable generate web service URL based on the support URL.  Please provide a fully qualified domain name including 'http://'.");
		$("#webserviceUrlText").css( "color", "red" );
		$("#webserviceUrl").val("");
	}	
}

isIP = function(host){
	
	if(host.match(/\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\b/)){
		return true;
	} else {
		return false;
	}
	
}
