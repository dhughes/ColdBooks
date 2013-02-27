component accessors="true"{

	property name="ColdBooksDatasource" type="any";

	migrations = [
		'CREATE TABLE MigrationVersion
		(
			version int not null
		)',

		'CREATE TABLE QbConnection (
			id integer NOT NULL AUTO_INCREMENT,
			name VARCHAR(255),
			description VARCHAR(255),
			passwordHash VARCHAR(32),
			supportUrl VARCHAR(255),
			webserviceUrl VARCHAR(255),
			fileId VARCHAR(35),
			isReadOnly SMALLINT,
			connectionId VARCHAR(35),
			personalDataPref VARCHAR(12),
			schedulerInterval VARCHAR(255),
			schedulerUnit VARCHAR(7),
			lastConnectionDateTime TIMESTAMP,
			companyFile VARCHAR(255),
			country VARCHAR(255),
			qbXmlMajorVersion VARCHAR(255),
			qbXmlMinorVersion VARCHAR(255),
			createdDate TIMESTAMP,
			modifiedDate TIMESTAMP,
			logRetention VARCHAR(10),
			logTruncation INTEGER,
			eventListeners TEXT,
			PRIMARY KEY (id),
			INDEX (id)
		) ENGINE = InnoDB',

		'CREATE TABLE QbMessage (
			id integer NOT NULL AUTO_INCREMENT,
			connectionId INTEGER,
			request LONGTEXT,
			response LONGTEXT,
			callbackType VARCHAR(10),
			callbackCFC VARCHAR(255),
			callbackFunction VARCHAR(255),
			returnFormat VARCHAR(10),
			createdDate TIMESTAMP,
			modifiedDate TIMESTAMP,
			error LONGTEXT,
			messageId VARCHAR(35),
			runAfterDateTime TIMESTAMP,
			PRIMARY KEY (id),
			FOREIGN KEY (connectionId) REFERENCES QbConnection(id)
		) ENGINE = InnoDB'

	];

	function databaseExists(){
		try{
			include this.cfml('
				<cfquery name="test" datasource="#getColdBooksDatasource().getDsn()#">
					SELECT 1
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
		if(!databaseExists()){
			throw("Please create a ColdFusion Data Source named #getColdBooksDatasource().getDsn()# referencing an empty MySQL database.  Be sure to enable CLOB and BLOB retrieval and set their respective buffers to 1048576.");
		}

		var migrationVersion = getMigrationVersion();

		for(var i = migrationVersion+1 ; i <= ArrayLen(migrations) ; i++){
			writelog("Running Migration: " & i);
			writelog(migrations[i]);
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
