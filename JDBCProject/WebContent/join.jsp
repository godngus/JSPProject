<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
//------------------------
//회원가입
//------------------------
String id =request.getParameter("id");
String password =request.getParameter("pwd");
//out.print(id);
//1.JDBC 드라이버 로드
Class.forName("oracle.jdbc.driver.OracleDriver");
//2.데이터베이스 연결
Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserd","jsp1234");
//3.SQL문 실행
Statement stmt =con.createStatement();

String sql="insert into member values ('"+id +"','1234','홍길동','20','1','서울시',default)";

int result = stmt.executeUpdate(sql);

if(result==0)
	out.print("회원가입실패");
else 
	out.print("회원가입 성공");
//4.데이터베이스 연결 끊음
stmt.close();
con.close();
%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>
	
</body>
</html>