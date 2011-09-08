
component{

	function init(mixinTargets){
		var foo = "";
		
		for(var i = 1 ; i <= arrayLen(mixinTargets) ; i++){
			mixinTargets[i].cfml = this.cfml;
		}
	}

	function cfml(markup){
		var filename = replace(createUUID(), "-", "", "all") & ".cfm";
		var path = "ram:///" & filename;

		markup &= chr(13) & chr(10);
		markup &= '<cffile action="delete" file="#path#" />';

		//writelog(markup);

		fileWrite(path, arguments.markup);

		return "/ram/#filename#";
		
		//fileDelete(path);
	}


}