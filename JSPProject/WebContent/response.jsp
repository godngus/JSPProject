<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>
	<table border="1">
	<tr>
		<td>serverInfo</td>
		<td><%=application.getServerInfo() %></td>
	</tr>
	<tr>
		<td>ContextPath</td>
		<td><%=application.getContextPath() %></td>
	</tr>
	<tr>
		<td>RealPath</td>
		<td><%=application.getRealPath(".") %></td>
	</tr>
	
	</table>
</body>
</html>