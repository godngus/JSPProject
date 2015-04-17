<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- firstPage -->
<%
	//page영역에 page라는 이름으로 pageScope라는 값을 저장하라.
	pageContext.setAttribute("page", "pageScope");
	//request영역
	request.setAttribute("request", "RequestScope");
	//session영역
	session.setAttribute("session", "SessionScope");
	//application영역
	application.setAttribute("application", "ApplicationScope");
	//페이지 이동
		//1.redirect방식
		response.sendRedirect("secondPage.jsp");
		//2.forward방식
		/*RequestDispatcher requestDispatcher=
		           request.getRequestDispatcher("secondPage.jsp");
		requestDispatcher.forward(request,response);*/
	%>
	
	
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>
<h1>첫번째페이지</h1>
<hr>
  
page영역 :<%=pageContext.getAttribute("page") %><br>
request영역 :<%=request.getAttribute("request") %><br>
session영역:<%=session.getAttribute("session") %><br>
application영역:<%=application.getAttribute("application") %><br>

</body>
</html>