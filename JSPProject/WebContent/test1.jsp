<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		
	</head>
<body>
<form action="test2.jsp">
이름: <input type="text" name="name"><br>
성별: <input type="radio" name="gender" value="남자">남자
     <input type="radio" name="gender" value="여자">여자<br>
좋아하는 계절:<input type="checkbox" name="season" value="봄">봄
		   <input type="checkbox" name="season" value="여름">여름
		   <input type="checkbox" name="season" value="가을">가을
		   <input type="checkbox" name="season" value="겨울">겨울<br>
<input type="submit" value="전송">
<input type="reset" value="취소">
</form>
</body>
</html>