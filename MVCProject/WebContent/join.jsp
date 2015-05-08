<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="exam.dao.*,exam.dto.*;" %>
<%
	
	request.setCharacterEncoding("UTF-8");//POST 방식
	
	String id =request.getParameter("id");
	String password =request.getParameter("pwd");
	String name=request.getParameter("name");
	String age=request.getParameter("age");
	String gender=request.getParameter("gender");
	String address=request.getParameter("address");
	
	//1.객체생성 JDBC Driver 로드
	//2.DB연결
	MemberDAO dao=new MemberDAO();
	//3.SQL문 실행
	Member member=new Member();
	member.setId(id);
	member.setPassword(password);
	member.setName(name);
	member.setAge(age);
	member.setGender(gender);
	member.setAddr(address);
		dao.insertMember(id,password,name,age,gender,address);
%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>

</body>
</html>