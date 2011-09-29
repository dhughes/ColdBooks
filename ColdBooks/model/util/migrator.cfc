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

	function migrate(){
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
