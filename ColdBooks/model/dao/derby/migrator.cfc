component accessors="true"{

	property name="ColdBooksDatasource" type="any";

	migrations = [
		'CREATE TABLE MigrationVersion
		(
			version int not null
		)',

		'ALTER TABLE QBMessage
			ADD COLUMN errorFunction varchar(255)
		',

		'ALTER TABLE QBMessage
			DROP COLUMN errorFunction
		'
	];

	// this function insures the database exists at all
	function initializeDatabase(){
		var dataDir = server.coldfusion.rootDir & "/ColdBooksData";

		if(!databaseExists()){
			lock type="exlusive" timeout="30"{
				if(!databaseExists()){
					// if the database directory doesn't already exist, copy the template over
					if(!directoryExists(dataDir)){
						include this.cfml('<cfzip
							action="unzip"
							destination="#server.coldfusion.rootDir#"
							file="#expandPath("templateDB.zip")#"
							recurse="yes" />');
					}

					CreateObject("component", "CFIDE.adminapi.datasource").setOther(
						name="ColdBooksData",
						url="jdbc:derby://127.0.0.1:1527/#dataDir#",
						class="org.apache.derby.jdbc.ClientDriver",
						driver="org.apache.derby.jdbc.ClientDriver",
						buffer=1048576,
						blob_buffer=1048576
					);
				}
			}
		}

	}

	function databaseExists(){
		try{
			include this.cfml('
				<cfquery name="test" datasource="ColdBooksData">
					SELECT * FROM SYS.SYSTABLES
				</cfquery>
			');
			return true;
		}
		catch(Any e){
			writelog(e);
			return false;
		}
	}

	function migrate(){
		initializeDatabase();

		var migrationVersion = getMigrationVersion();

		for(var i = migrationVersion+1 ; i <= ArrayLen(migrations) ; i++){
			writelog("Running Migration: " & i);
			include this.cfml('
				<cfquery datasource="#getColdBooksDatasource().getDsn()#">
					#migrations[i]#
				</cfquery>
				<cfquery datasource="#getColdBooksDatasource().getDsn()#">
					INSERT INTO MigrationVersion
					(version)
					VALUES
					(#i#)
				</cfquery>
			');
			writelog("Completed Migration: " & i);
		}
	}

	private function getMigrationVersion(){
		var migrationVersion = "";
		try{
			include this.cfml('
				<cfquery name="migrationVersion" datasource="#getColdBooksDatasource().getDsn()#">
					SELECT max(version) as version
					FROM MigrationVersion
				</cfquery>
			');

		} catch(any e) {
			return 0;
		}
		
		return migrationVersion.version;
	}
}
