component accessors="true"{
	
	property name="ColdBooksJavaLoader" type="any";
	 
	variables.JAXBContexts = {};
	
	function init(ColdBooksJavaLoader){
		setColdBooksJavaLoader(ColdBooksJavaLoader);
		
		return this;
	}
	
	function toObjects(qbxml, connection){
		var JAXBContext = getJAXBContext(connection);
		var Unmarshaller = JAXBContext.createUnmarshaller();
		var QBXMLStringBufferInputStream = CreateObject("java", "java.io.StringBufferInputStream").init(qbxml);
		return Unmarshaller.unmarshal(QBXMLStringBufferInputStream);		 
	}
	
	function toQBXML(objects, connection){
		var JAXBContext = getJAXBContext(connection);
		var Marshaller = JAXBContext.createMarshaller();
		var StringWriter = CreateObject("java", "java.io.StringWriter").init();
		Marshaller.marshal(objects, StringWriter);
	
		var xml = StringWriter.toString();
		// add the QBXML processing instruction - there may be a way to do this via java, but hey, this works.
		return Replace(xml, '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>', '<?xml version="1.0" encoding="UTF-8" ?><?qbxml version="#connection.getSdkVersion()#" ?>');
	}
	
	private function getJAXBContext(connection){
		// do we already have this context?
		if(NOT (StructKeyExists(JAXBContexts, connection.getCountry()) AND StructKeyExists(JAXBContexts[connection.getCountry()], #connection.getSdkVersion()#)) ){
			// make sure we have a key for the edition
			if(NOT StructKeyExists(JAXBContexts, connection.getCountry())){
				JAXBContexts[connection.getCountry()] = {};
			}
			
			// create the JAXBContext
			JAXBContexts[connection.getCountry()][connection.getSdkVersion()] = getColdBooksJavaLoader().create("javax.xml.bind.JAXBContext").newInstance("com.alagad.ColdBooks.#connection.getCountry()#.v#connection.getSdkVersion()#", getColdBooksJavaLoader().getURLClassLoader() );
		}
		
		return JAXBContexts[connection.getCountry()][connection.getSdkVersion()];
	}
	
	private function getObjectFactory(connection){
		return getColdBooksJavaLoader().create("com.alagad.ColdBooks.#connection.getCountry()#.v#connection.getSdkVersion()#.ObjectFactory");
	}
	
}