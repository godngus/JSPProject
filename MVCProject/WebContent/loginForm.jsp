<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>
<h1>로그인</h1>
	<form action="login" method="post">
		<label for="id">아이디:</label>
		<input type="text" name="id"><br>
		
		<label for="pwd">비밀번호:</label>
		<input type="password" name="pwd"><br>
		
		<input type="submit" value="가입">
	</form>
</body>
</html>