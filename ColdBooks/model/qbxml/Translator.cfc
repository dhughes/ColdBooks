component accessors="true"{
	
	property name="ColdBooksJavaLoader" type="any";
	 
	variables.JAXBContexts = {};
	
	function init(ColdBooksJavaLoader){
		setColdBooksJavaLoader(ColdBooksJavaLoader);
		
		return this;
	}
	
	function toObjects(qbxml, edition, major, minor){
		var JAXBContext = getJAXBContext(edition, major, minor);
		var Unmarshaller = JAXBContext.createUnmarshaller();
		var QBXMLStringBufferInputStream = CreateObject("java", "java.io.StringBufferInputStream").init(qbxml);
		return Unmarshaller.unmarshal(QBXMLStringBufferInputStream);		 
	}
	
	function toQBXML(objects, edition, major, minor){
		var JAXBContext = getJAXBContext(edition, major, minor);
		var Marshaller = JAXBContext.createMarshaller();
		var StringWriter = CreateObject("java", "java.io.StringWriter").init();
		Marshaller.marshal(objects, StringWriter);
	
		var xml = StringWriter.toString();
		// add the QBXML processing instruction - there may be a way to do this via java, but hey, this works.
		return Replace(xml, '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>', '<?xml version="1.0" encoding="UTF-8" ?><?qbxml version="#major#.#minor#" ?>'); 
	}
	
	private function getJAXBContext(edition, major, minor){
		// do we already have this context?
		if(NOT (StructKeyExists(JAXBContexts, edition) AND StructKeyExists(JAXBContexts[edition], major & minor)) ){
			// make sure we have a key for the edition
			if(NOT StructKeyExists(JAXBContexts, edition)){
				JAXBContexts[edition] = {};
			}
			
			// create the JAXBContext
			JAXBContexts[edition][major & minor] = getColdBooksJavaLoader().create("javax.xml.bind.JAXBContext").newInstance("com.alagad.ColdBooks.#edition#.v#major##minor#", getColdBooksJavaLoader().getURLClassLoader() );
		}
		
		return JAXBContexts[edition][major & minor];
	}
	
	private function getObjectFactory(edition, major, minor){
		return getColdBooksJavaLoader().create("com.alagad.ColdBooks.#edition#.v#major##minor#.ObjectFactory");
	}
	
}