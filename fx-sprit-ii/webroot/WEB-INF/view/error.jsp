﻿<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
		<title>Buxland-帮助</title>
		<link rel="shortcut icon" href="http://www.buxland.net/favicon.ico">
		<style type="text/css">
		<!--
		td{
			font-size:10pt;
			font-family:宋体;
		}
		-->
		</style>
	</head>
	<body topmargin="3" style="margin:0;padding:0;text-align:center;">
		<jsp:include page="header.jsp" flush="true"/>
		
		<%=session.getAttribute("ERROR_MSG")%>;
		<%
			session.removeAttribute("ERROR_MSG");
		%>
		
		<jsp:include page="tailer.jsp" flush="true"/>
		
	<body>
</html>