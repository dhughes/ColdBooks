/**
* This component was creaeted to fix a bug in the in-built query.cfc that ships with CF 9.
*
*/
component extends="com.adobe.coldfusion.query"{
	/**
     * Processes named sql params. Invokes insertNamedParams() to insert the named param into sqlparams array.
	 *
	 * @param1 sqlArray 
	 * @param2 sqlParams
	 * @param3 namedparamsarray Array containing all named sql params
	 * @param4 queryparams Array containing all sql queryparams supplied
     * @param5 sqlCommand Sql operation to perform
     * @return struct with sqlArray and sqlParams
     * 
     * @output false
     */
    private struct function processNamedParams(array sqlArray,array sqlParams,array namedparamsarray,array queryparams,string sqlCommand)
    {
		var namedparam = "";
        var i = 0;
        if(arraylen(sqlArray) gt 0)
        {
            for(i=2; i <= arraylen(sqlArray); i++)
            {
                namedparam = trim(listfirst(sqlArray[i]," " & chr(13) & chr(10)));
				if(listfindnocase("INSERT,UPDATE,EXEC,CALL",sqlCommand))
                {
                    
					namedparam = trim(listfirst(namedparam,", " & chr(13) & chr(10)));
					
                    if(sqlCommand eq "CALL" or sqlCommand eq "INSERT")
                    {
                        if(right(namedparam,1) eq ")")
                        {
                            namedparam = trim(left(namedparam,len(namedparam)-1));
                        }
                    }
                }
				sqlArray[i] = replace(arguments.sqlArray[i],namedparam,"");
                sqlParams = insertNamedParams(namedparam,namedparamsarray,sqlParams);
             }
                
         }
         return {sqlArray=sqlArray,sqlParams=sqlParams};
    }
}