component extends="JavaLoader"{
	
	function init(loadPaths, loadColdFusionClassPath, parentClassLoader, sourceDirectories, compileDirectory, trustedSource){
		
		for(var x = 1 ; x <= ArrayLen(loadPaths) ; x++){
			loadPaths[x] = expandPath(loadPaths[x]);
		}
				
		return super.init(argumentCollection=arguments);
	}

}