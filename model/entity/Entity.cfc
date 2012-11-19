component displayname="Entity" hint="I model an abstract Entity." output="false" accessors="true"
{
	/**
	 * Given a structure of data, this populates properties that match the structure key names. i.e. data.firstName would populate setFirstName() with the value.
	 */
	public function populate( data )
	{
		for ( key in data ) 
		{
			// key != "id" && -- commented this out so popualating Connections would set the ID as well.
			if(IsSimpleValue( data[key] ) && StructKeyExists( this, "set#key#" ) && (key != "id" || (key == "id" && val(data[key]))) )
			{
				Evaluate( "set#key#( data[key] )" );
			}
		}
	}
	
	public function populateFromQuery( data, row )
	{
		var columns = ListToArray(data.columnList);
			
		for ( var x = 1 ; x <= ArrayLen(columns) ; x++ ) 
		{
			var key = columns[x];
			
			// key != "id" && -- commented this out so populating Connections would set the ID as well.
			
			if(data.recordcount && IsSimpleValue( data[key][row] ) && StructKeyExists( this, "set#key#" ) && (key != "id" || (key == "id" && val(data[key][row]))) )
			{
				Evaluate( "set#key#( data[key][row] )" );
			}
			
		}
	}

}
