<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
	
<body>
<h1>설문조사 결과</h1>
<%
	request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("name");
	out.println("이름:<b>"+name+"</b><br>");
	String gender=request.getParameter("gender");
	if(gender.equals("남자"))
		response.sendRedirect("http://www.naver.com");
	else
		response.sendRedirect("http://www.daum.net");/*redirect방식*/
	out.println("성별:<b>"+gender+"</b><br>");
	String season=request.getParameter("season");
	out.println("좋아하는 계절:<b><br>"+season+"<b></br>");
%>
</body>
</html>