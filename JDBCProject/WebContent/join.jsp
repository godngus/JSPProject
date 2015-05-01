<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
//------------------------
//회원가입
//------------------------
request.setCharacterEncoding("UTF-8");//POST 방식
String id =request.getParameter("id");
String password =request.getParameter("pwd");
String name=request.getParameter("name");
String age=request.getParameter("age");
String gender=request.getParameter("gender");
String address=request.getParameter("address");

//out.print(id);
//1.JDBC 드라이버 로드
Class.forName("oracle.jdbc.driver.OracleDriver");
//2.데이터베이스 연결
Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserd","jsp1234");
//3.SQL문 실행
//State 객체이용
/*Statement stmt =con.createStatement();

String sql="insert into member values ('"+id +"','1234','"+ name +"','20','1','서울시',default)";

int result = stmt.executeUpdate(sql);//sql문장 실행->실행한 행의 개수 return
*/
//PreparedStatement 객체 이용
String sql="insert into member values(?,?,?,?,?,?,default)";

PreparedStatement pstmt=con.prepareStatement(sql);



//바인딩
pstmt.setString(1,id);
pstmt.setString(2,password);
pstmt.setString(3,name);
pstmt.setInt(4,Integer.parseInt(age));
pstmt.setString(5,gender);
pstmt.setString(6,address);

int result = pstmt.executeUpdate();

if(result==0)
	out.print("회원가입실패");
else 
	out.print("회원가입 성공");
//4.데이터베이스 연결 끊음
pstmt.close();
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