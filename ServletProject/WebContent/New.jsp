<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
		<style>
		body{
			background-image:url("라희라율.jpg");
			background-repeat:no-repeat;
			background-attachment:fixed;
		}
		input,select,textarea{
			border:Green 1pt dashed;
			background:hotpink;
			color:navy;
		}
		
		</style>
		<script>
		function testfunc(){
			alert("Hello JavaScript!");
		}
		</script>
		
	</head>
<body>
	<h1>Servlet Test</h1>
	<hr>	
		<form action="TestServlet" onsubmit="return testfunc()">
		<input type="text" name="id"><br>
		
		<input type="radio" name="gender" value="도라에몽빤쥬"> 도라에몽빤쥬
		<input type="radio" name="gender" value="극혐"> 극혐 <br>
		<input type="checkbox" name="sports" value="축구">축구
		<input type="checkbox" name="sports" value="야구">야구
		<input type="checkbox" name="sports" value="농구">농구<br>
		<input type="email" name="email"><br>
		
		<select name="subject">
			<option value="javascript">JavaScript</option>
			<option value="CSS">CSS</option>
			<option value="Html">HtmL</option>
		</select>
		
		<textarea name="txt" rows="100" cols="60"></textarea><br>
		
		<input type="color" name="mycolor"><br>
		<input type="submit" value="서버로 제출"><br>
	</form>
</body>
</html>