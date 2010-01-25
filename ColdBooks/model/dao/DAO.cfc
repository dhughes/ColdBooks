/**
 * Database behavior base class. 
 */
component output="false" accessors="true"
{
	property name="ColdBooksDatasource" type="any";
	
	public function getDsn(){
		return GetColdBooksDatasource().getDsn();
	}
	
	public function init()
	{
		return this;
	}
	
	private function bindQueryToObjet(query, object){
		var properties = getProperties(getMetadata(object)); 
				
		for(var x = 1 ; x <= ArrayLen(properties) ; x++){
			var value = evaluate("object.get#properties[x].name#()");
			if((NOT IsDefined("value") OR IsSimpleValue(value)) AND StructKeyExists(properties[x], "type")){
				if(NOT IsDefined("value") OR NOT len(value)){
					query.addParam(name=properties[x].name, null=true);
				} else if(properties[x].type IS "Boolean"){
					query.addParam(name=properties[x].name, value=Iif(value, De('1'), De('0')));
				} else if(properties[x].type IS "Boolean"){
					query.addParam(name=properties[x].name, value=Iif(value, De('1'), De('0')));
				} else if(IsDate(value) AND properties[x].type IS "any"){
					
					query.addParam(name=properties[x].name, value=value, cfsqltype="CF_SQL_DATE");
				} else {
					query.addParam(name=properties[x].name, value=value);
				}
			}
		}
	}
	
	private function setId(object){
	}
	
	
	private function getProperties(metadata){
		var properties = [];
		
		if(structKeyExists(metadata, "properties")){
			var propList = metadata.properties;
			
			// get all these properties
			for(var x = 1 ; x <= ArrayLen(propList) ; x++){
				properties[x] = {};
				properties[x].name = propList[x].name;
				if(StructKeyExists(propList[x], "type")){
					properties[x].type = propList[x].type;
				}
			}
			
			// get any parent object's properties 
			var parentProps = getProperties(metadata.extends);
			
			// append the parent's properties
			for(var x = 1 ; x <= ArrayLen(parentProps) ; x++){
				ArrayAppend(properties, parentProps[x]);
			}
		}
		
		return properties;
		
	}
	
}