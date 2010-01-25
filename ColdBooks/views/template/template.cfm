
<html>
<head>
	<title>ColdBooks Manager</title>
	
	
<style>
body, p, td {
	font-family: Arial, Helvetica, sans-serif;

	font-size: small;

}

th {
 font-family: Arial, Helvetica, sans-serif;
 font-size: small; ! important;
}

th {
 text-align:left;
}
.adminbody {
	background-color: #c4c4c4;
}

.resourcelist {
	list-style-type:square;
	margin-top:5px;
	margin-bottom:10px;
}

.errorText {
	color: #CC0000; 
}

.successText {
	color: #008800; 
}

.loginWhiteText {
	color: #FFFFFF; 
	font-weight: bold;
}

.loginInvalidText {
	color: #CC0000; 
	font-weight: bold;
}

.loginCopyrightText {
	color: #000000;
	font-size: 9px;
	font-family:Arial, Helvetica, sans-serif;
}

a {
	color: #003399;
	text-decoration: none;
}

a:hover {
	color: #008A00; 
}

.iconLinkText {
	color: #FFFFFF;
	font-weight: bold;

	font-size: small;

}

.leftMenuLinkText {
	color: #6C7A83; 

	font-size: small;

}

.leftMenuLinkTextHighlighted {
	color: #123f61; 

	font-size: small;

	font-weight:bold;
}

.topMenuLinkText {
	color: #000000;
	font-size: x-small; 
}

.menuCFAdminText {
	color: #000000;
	font-weight: bold;
	

	font-size: small;

}

.menuAuxText {
	color: #6C7A83;
	
		font-size: small;
	
}

.menuHeaderText {
	color: #0072AC;
	font-weight: bold;

	font-size: x-small;

	text-transform:uppercase;
}

.menuTD {
	/*border-top-width: 1px;
	border-right-width: 1px;
	border-bottom-width: 1px;
	border-left-width: 1px;
	border-top-style: none;
	border-right-style: none;
	border-bottom-style: solid;
	border-left-style: none;
	border-bottom-color: #CCCCCC;*/
	background: #ececec;
}

.menuTDHeader {
	/* can delete me thinks */
	/*border-top-width: 1px;
	border-right-width: 1px;
	border-bottom-width: 1px;
	border-left-width: 1px;
	border-top-style: solid;
	border-right-style: none;
	border-bottom-style: solid;
	border-left-style: none;*/
	background: #ececec url('/CFIDE/administrator/images/cap_menuitem_background.png') repeat-x;
}
.menuTDHeaderLeft {
	border-left-style:solid;
	border-left-width: 1px;
	border-color: #c4c4c4;
	background: #ececec url('/CFIDE/administrator/images/cap_menuitem_background.png') repeat-x;
}
.menuTDHeaderRight {
	border-right-style:solid;
	border-right-width: 1px;
	border-color: #c4c4c4;
	background: #ececec url('/CFIDE/administrator/images/cap_menuitem_background.png') repeat-x;
}

h1 {
	color: #000000;
	font-weight: bold;
	font-size: x-small;
	margin-top: 5px;
	margin-bottom: 5px;
}

.pageHeader {
	color: #0072AC;
	font-weight: bold;
	font-size: medium;
	margin-top: 5px;
	margin-bottom: 5px;
}

.currentuser {
	color: #0072AC;
	font-weight: bold;
	font-size: x-small;
	margin-top: 5px;
	margin-bottom: 5px;
}

.cellBlueSides {
	border-right-width: 1px;
	border-left-width: 1px;
	border-right-style: solid;
	border-left-style: solid;
	border-right-color: #C1D9DB;
	border-left-color: #C1D9DB;
}

.cellLeftBlueSide {
	border-left-width: 1px;
	border-left-style: solid;
	border-left-color: #D5E3E6;
}

.cellRightAndBottomBlueSide {
	border-right-width: 1px;
	border-right-style: solid;
	border-right-color: #D5E3E6;
	border-bottom-width: 1px;
	border-bottom-style: solid;
	border-bottom-color: #D5E3E6;
}

.cell3BlueSides {
	border-left-width: 1px;
	border-left-style: solid;
	border-left-color: #D5E3E6;
	border-right-width: 1px;
	border-right-style: solid;
	border-right-color: #D5E3E6;
	border-bottom-width: 1px;
	border-bottom-style: solid;
	border-bottom-color: #D5E3E6;
}

.cell4BlueSides {
	border-top-width: 1px;
	border-top-style: solid;
	border-top-color: #D5E3E6;
	border-left-width: 1px;
	border-left-style: solid;
	border-left-color: #D5E3E6;
	border-right-width: 1px;
	border-right-style: solid;
	border-right-color: #D5E3E6;
	border-bottom-width: 1px;
	border-bottom-style: solid;
	border-bottom-color: #D5E3E6;
}

.cell2BlueSidesAndBlueBkgd {
	border-top-width: 1px;
	border-top-style: solid;
	border-top-color: #D5E3E6;
	border-bottom-width: 1px;
	border-bottom-style: solid;
	border-bottom-color: #D5E3E6;
	background-color: #E8F0F1;
}

.cellBlueTop {
	border-top-width: 1px;
	border-top-style: solid;
	border-top-color: #C1D9DB;
}

.cellBlueBottom {
	border-bottom-width: 1px;
	border-bottom-style: solid;
	border-bottom-color: #C1D9DB;
}

.cellBlueTopAndBottom {
	border-top-width: 1px;
	border-top-style: solid;
	border-top-color: #C1D9DB;
	border-bottom-width: 1px;
	border-bottom-style: solid;
	border-bottom-color: #C1D9DB;
}

.cellBordersBlue {
	border: 1px solid #C1D9DB;
}

.cellGrayBottom {
	border-bottom-width: 1px;
	border-bottom-style: solid;
	border-bottom-color: #E2E6E7;
}

.copyright {
	color: #000000;
	
		font-size: x-small;
	
}

.copyrightLink {
	color:#003399; 
	
		font-size: x-small;
	
}

.disabled {
	color: #999999;
}
.color-title		{background-color:888885;color:white;background-color:7A8FA4;}
.color-header		{background-color:ddddd5;}
.color-buttons		{background-color:ccccc5;}
.color-border		{background-color:666666;}
.color-row			{background-color:fffff5;}
.color-rowalert		{background-color:ffddaa;}
.buttn,.buttnText	{font-size:1em;font-family: tahoma,arial,Geneva,Helvetica,sans-serif;background-color:e0e0d5;}
</style>

	<link rel="SHORTCUT ICON" href="http://scratch:80/CFIDE/administrator/favicon.ico">
	<meta name="Author" content="Copyright (c) 1995-2009 Adobe Systems, Inc. All rights reserved.">
</head>


<body style="background:#ececec">

<table width="100%" border="0" cellspacing="0" cellpadding="0">


<tr>
	<td><img src="/CFIDE/administrator/images/contentframetopleft.png" alt="" height="23" width="16"></td><td background="/CFIDE/administrator/images/contentframetopbackground.png"><img src="/CFIDE/administrator/images/spacer.gif" alt="" height="23" width="540"></td><td><img src="/CFIDE/administrator/images/contentframetopright.png" alt="" height="23" width="16"></td>
</tr>

  <tr>
	
    <td width="16" style="background:url('/CFIDE/administrator/images/contentframeleftbackground.png') repeat-y;"><img src="/CFIDE/administrator/images/spacer.gif" alt="" width="16" height="1"></td>
	
	<td>

		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="12"><img src="/CFIDE/administrator/images/cap_content_white_main_top_left.gif" alt="" width="12" height="11"></td>
		    <td bgcolor="#FFFFFF"><img src="/CFIDE/administrator/images/spacer_10_x_10.gif" width="10" alt="" height="10"></td>
			<td width="12"><img src="/CFIDE/administrator/images/cap_content_white_main_top_right.gif" width="12" alt="" height="11"></td>
		  </tr>
		</table>
		
		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

		    <td width="10" bgcolor="#FFFFFF"><img src="/CFIDE/administrator/images/spacer_10_x_10.gif" alt="" width="10" height="10"></td>
			<td bgcolor="#FFFFFF">
				
				<table width="100%" border="0" cellspacing="0" cellpadding="5">
				  <tr valign="top">
					<td valign="top">




<tr>
	<td>&nbsp;</td>

	<td><br />
<!-- margin top -->

<cfoutput>#event.getView("body")#</cfoutput>

<!-- margin bottom -->
		<br />
	</td>
	<td>&nbsp;</td>
</tr>

					</td>
				  </tr>

				</table>
				
			</td>
		    <td width="10" bgcolor="#FFFFFF"><img src="/CFIDE/administrator/images/spacer_10_x_10.gif" alt="" width="10" height="10"></td>
		  </tr>
		</table>
		
		
		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="12"><img src="/CFIDE/administrator/images/cap_content_white_main_bottom_left.gif" alt="" width="12" height="11"></td>
		    <td bgcolor="#FFFFFF"><img src="/CFIDE/administrator/images/spacer_10_x_10.gif" alt="" width="10" height="10"></td>

			<td width="12"><img src="/CFIDE/administrator/images/cap_content_white_main_bottom_right.gif" alt="" width="12" height="11"></td>
		  </tr>
		</table>
		
		
		<td width="10" style="background:url('/CFIDE/administrator/images/contentframerightbackground.png') repeat-y;"><img src="/CFIDE/administrator/images/spacer.gif" alt="" width="16" height="1"></td>
	</td>
  </tr>
  <tr>
	<td><img src="/CFIDE/administrator/images/contentframebottomleft.png" height="23" alt="" width="16"></td><td background="/CFIDE/administrator/images/contentframebottombackground.png"><img src="/CFIDE/administrator/images/spacer.gif" alt="" height="23" width="540"></td><td><img src="/CFIDE/administrator/images/contentframebottomright.png" alt="" height="23" width="16"></td>
	</tr>

</table>

		
		<div align="center">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="20"></td>
		  	<td class="copyright">

Copyright &copy; 1995-2009 Adobe Systems, Inc. All rights reserved. U.S. Patents Pending.
<hr noshade="true" size="1" />

Notices, terms and conditions pertaining to third party software are located at <a href="http://www.adobe.com/go/thirdparty/#golocale#" style="color:#C35617" target="extwebsite" class="copyrightLink">http://www.adobe.com/go/thirdparty/</a> and incorporated by reference herein.
 
<br>
<br>

			</td>
			<td width="20"></td>
		  </tr>
		</table>
		</div>

		

</body>
</html>

