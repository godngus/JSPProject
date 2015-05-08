<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>
<h1>회원가입</h1>
	<form action="join.jsp">
		<label for="id">아이디:</label>
		<input type="text" name="id"><br>
		<label for="pwd">비밀번호:</label>
		<input type="password" name="pwd"><br>
		<label for="name">이름:</label>
		<input type="text" name="name" id="name"><br>
		<label for="gender">성별:</label>
		<input type="radio" name="gender" value="1">남자
		<input type="radio" name="gender" value="2">여자<br>
		<label for="address">주소:</label>
		<input type="address" name="address" id="address"><br>
		<label for="age">나이:</label>
		<input type="age" name="age" id="age"><br>
		<input type="submit" value="가입">
	</form>
</body>
</html>