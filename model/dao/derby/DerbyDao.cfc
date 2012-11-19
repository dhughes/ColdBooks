component extends="ColdBooks.model.dao.DAO" output="false" accessors="true"
{

	public function init()
	{
		// insure derby is started
		startDerby();

		return this;
	}

	public function startDerby(){
		ip = [127,0,0,1];
		ba = javaCast('byte[]', ip);
		inetAddress = createObject('java', 'java.net.Inet4Address').getByAddress(ba);
		nsc = createObject('java', 'org.apache.derby.drda.NetworkServerControl').init(inetAddress, '1527');


		// try to ping the server.  If that fails, start it
		try{
			nsc.ping();
		}
		catch(Any e){
			writelog("Starting Derby");
			nsc.start(javacast('null', ''));
		}
	}


}

