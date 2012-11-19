component accessors="true"{

	property name="ColdBooksMessageDAO" type="any";	

	function loadMessage(id){
		return ColdBooksMessageDAO.loadMessage( id );
	} 
	
}