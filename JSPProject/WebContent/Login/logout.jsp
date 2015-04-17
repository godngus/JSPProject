<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- logout -->
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>
<% 
	session.removeAttribute("loginId");//하나만 지울때

	session.invalidate();//다 지울때
	
	response.sendRedirect("main.jsp");

%>
</body>
</html>