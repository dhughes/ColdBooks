<cfcomponent extends="mxunit.framework.TestCase"> 
	<!--- Created by John Mason, mason@fusionlink.com--->
	<!--- Date: Jul 24, 2009--->
	<!---Uses the 'buster' test dummy app to unit test the remoting services--->
	
	<cfset variables.instance = StructNew()/>

	<!---May need to alter this your particular environment--->
	<cfset variables.instance.busterURL = "http://buster.local"/>
	
	<cffunction name="testJSONRemotingCall" access="public" returntype="void">  
		<cfset var local = StructNew()/>

		<cftry>
		<cfhttp method="Post" timeout="10" result="local.cfhttp" url="#variables.instance.busterURL#/RemotingService.cfc?method=executeEvent&returnformat=json&queryFormat=column">
			<cfhttpparam type="Formfield" name="eventName" value="get.users"/>
			<cfhttpparam type="Formfield" name="returnValues" value="users"/>
		</cfhttp>
		<cfcatch><cfset local.cfhttp.filecontent = ""/></cfcatch>
		</cftry>

		<cfset local.validresponse = "{""users"":{""ROWCOUNT"":12,""COLUMNS"":[""NAME""],""DATA"":{""name"":[""Person-1"",""Person-2"",""Person-3"",""Person-4"",""Person-5"",""Person-6"",""Person-7"",""Person-8"",""Person-9"",""Person-10"",""Person-11"",""Person-12""]}}}"/>

		<!---The compare() will result in a 0 if good--->
		<cfset assertFalse(compare(local.cfhttp.filecontent,local.validresponse))/>	
	</cffunction>

	<cffunction name="testWDDXRemotingCall" access="public" returntype="void">  
		<cfset var local = StructNew()/>

		<cftry>
		<cfhttp method="Post" timeout="10" result="local.cfhttp" url="#variables.instance.busterURL#/RemotingService.cfc?method=executeEvent">
			<cfhttpparam type="Formfield" name="eventName" value="get.users"/>
			<cfhttpparam type="Formfield" name="returnValues" value="users"/>
		</cfhttp>
		<cfcatch><cfset local.cfhttp.filecontent = ""/></cfcatch>
		</cftry>

		<cfset local.validresponse = "<wddxPacket version='1.0'><header/><data><struct><var name='users'><recordset rowCount='12' fieldNames='name' type='coldfusion.sql.QueryTable'><field name='name'><string>Person-1</string><string>Person-2</string><string>Person-3</string><string>Person-4</string><string>Person-5</string><string>Person-6</string><string>Person-7</string><string>Person-8</string><string>Person-9</string><string>Person-10</string><string>Person-11</string><string>Person-12</string></field></recordset></var></struct></data></wddxPacket>"/>

		<!---The compare() will result in a 0 if good--->
		<cfset assertFalse(compare(local.cfhttp.filecontent,local.validresponse))/>	
	</cffunction>

</cfcomponent>
