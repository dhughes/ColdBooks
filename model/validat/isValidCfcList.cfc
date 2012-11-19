component extends="validat.validationRules.validator"{

	function init(){
		super.init();
		return this;
	}

	function validate(data, args, dependencies){
		// confirm that the cfcs specified exist
		var cfcs = ListToArray(arguments.data, chr(13)&chr(10));

		for(var i = 1 ; i <= ArrayLen(cfcs) ; i++){
			var cfc = trim(cfcs[i]);
			// try to instantiate this CFC
			try{
				var CFCProxy = CreateObject("Java", "coldfusion.cfc.CFCProxy").init(cfc);
			} catch(any e){
				writelog("Can't validate ColdBooks CFC event listener. '#cfc#' is not a valid CFC path.");
				return "invalid";
			}

		}

		return true;
	}

}