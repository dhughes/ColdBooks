<cfset xe.integration = event.getValue("xe.integration") />
<cfset xe.editConnection = event.getValue("xe.editConnection") />
<cfset xe.deleteConnection = event.getValue("xe.deleteConnection") />
<cfset xe.getQwsFile = event.getValue("xe.getQwsFile") />
<cfset xe.viewLog = event.getValue("xe.viewLog") />
<cfset connections = event.getValue("connections") />

<h2 class="pageHeader">ColdBooks Connections</h2>

<p>ColdBooks allows you to establish connections to QuickBooks via the QuickBooks Web Connector.</p>

<cfoutput>
	<!---<p>For a quick overview of QuickBooks integration, <a href="#event.linkTo(xe.integration)#">read this</a>.</p>--->
	
	<!--- create a new connection --->
	<table border="0" cellpadding="5" cellspacing="0" width="100%">
		<form name="editform">
			<tr>
				<td class="cellBlueTopAndBottom" bgcolor="##F3F7F7">
					<input type="Button" title="Register New QuickBooks Connection" name="NewConnection" value="Register New QuickBooks Connection" class="buttn" onclick="location.href='#event.linkTo(xe.editConnection)#';"><br />
				</td>
			</tr>
		</form>
	</table>
	<br />
	
	<!--- list of existing connections --->
	<table border="0" cellpadding="5" cellspacing="0" width="100%">
		<tr>
			<td bgcolor="##E2E6E7" class="cellBlueTopAndBottom">
				<b>QuickBooks Connections</b>
			</td>
		</tr>
		<tr>
			<td>
				
				<table border="0" cellpadding="2" cellspacing="0" width="100%">
				<tr>
					<th scope="col" nowrap bgcolor="##F3F7F7" class="cellBlueTopAndBottom" width="50">
						<strong>Actions </strong>
					</th>
					<th scope="col" nowrap bgcolor="##F3F7F7" class="cellBlueTopAndBottom">
						<strong>Connection Name</strong>
					</th>
					<th scope="col" nowrap bgcolor="##F3F7F7" class="cellBlueTopAndBottom">
						 <strong>Web Service URL</strong>
					</th>
					<th scope="col" nowrap bgcolor="##F3F7F7" class="cellBlueTopAndBottom">
						 <strong>Pending Messages</strong>
					</th>
					<th scope="col" nowrap bgcolor="##F3F7F7" class="cellBlueTopAndBottom">
						 <strong>Errored Messages</strong>
					</th>
					<th scope="col" nowrap bgcolor="##F3F7F7" class="cellBlueTopAndBottom">
						<strong>Last Connection On</strong>
					</th>
				</tr>
				
				<cfloop array="#connections#" index="connection">
					<tr bgcolor="ffffff">
						<td nowrap class="cell3BlueSides">
							
							<table border="0" cellpadding="2" cellspacing="0" width="50">
								<tr>
									<td>
										<a href="#event.linkTo(xe.editConnection)#&id=#connection.getId()#"
										   onmouseover="window.status='Edit #connection.getName()#'; return true;"
										   onmouseout="window.status=''; return true;"
										   title="Edit #connection.getName()#"
										><img src="/CFIDE/administrator/images/iedit.gif" vspace="2" width="16" height="16" alt="Edit #connection.getName()#" border="0"></a>
									</td>
									<td> 
										<a href="#event.linkTo(xe.viewLog)#&id=#connection.getId()#"
										   onmouseover="window.status='View #connection.getName()# logs'; return true;"
										   onmouseout="window.status=''; return true;"
										   title="View #connection.getName()# logs"
										><img src="/CFIDE/administrator/images/view.gif" vspace="2" hspace="1" width="16" height="16" alt="View #connection.getName()# logs" border="0"></a>
									</td>
									<td>
										<a href="#event.linkTo(xe.getQwsFile)#&id=#connection.getId()#"
										   onmouseover="window.status='Download QWC File'; return true;"
										   onmouseout="window.status=''; return true;"
										   title="Download #connection.getName()# QWC File"
										><img src="/CFIDE/administrator/ColdBooks/images/idownload.gif" vspace="2" hspace="1" width="16" height="16" alt="Download QWC File" border="0"></a>
									</td>
									<td> 
										<a href="#event.linkTo(xe.deleteConnection)#&id=#connection.getId()#"
										   onmouseover="window.status='Delete #connection.getName()#'; return true;"
										   onmouseout="window.status=''; return true;"
										   onclick="return confirm('Are you sure you want to delete #connection.getName()#?');"
										   title="Delete #connection.getName()#"
										><img src="/CFIDE/administrator/images/idelete.gif" vspace="2" hspace="1" width="16" height="16" alt="Delete #connection.getName()#" border="0"></a>
									</td>
							</tr>
							</table>
							
						</td>
						<td nowrap class="cellRightAndBottomBlueSide">
						
							<a href="#event.linkTo(xe.editConnection)#&id=#connection.getId()#"
							   onmouseover="window.status='Edit #connection.getName()#'; return true;"
							   onmouseout="window.status=''; return true;"
							   title="Edit #connection.getName()#"
							>#connection.getName()#</a>
						 &nbsp;
						</td>
						<td nowrap class="cellRightAndBottomBlueSide">
							#connection.getWebServiceUrl()#
						</td>
						<td nowrap class="cellRightAndBottomBlueSide">
							#connection.getPendingRequestCount()#
						</td>
						<td nowrap class="cellRightAndBottomBlueSide">
							<a href="#event.linkTo(xe.viewLog)#&id=#connection.getId()#">#connection.getErroredRequestCount()#</a>
						</td>
						<td nowrap class="cellRightAndBottomBlueSide">
							<cfif IsDate(connection.getlastConnectionDateTime())>
								#LSDateFormat(connection.getlastConnectionDateTime())# at #LsTimeFormat(connection.getlastConnectionDateTime())#
 							<cfelse>
								Never
							</cfif>
						</td>
					</tr>
				</cfloop>	
					
				</table>
		
				
			</td>
		</tr>
		</table>


</cfoutput>