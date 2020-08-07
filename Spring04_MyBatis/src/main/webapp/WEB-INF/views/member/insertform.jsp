<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/insertform.jsp</title>
</head>
<body>
<div class="container">
	<h1>회원정보 추가 폼 입니다.</h1>
	<form action="insert.do" method="post">
		<input type="text" name="name" placeholder="이름 입력..."/>
		<input type="text" name="addr" placeholder="주소 입력..."/>
		<button type="submit">추가</button>
	</form>
</div>
</body>
</html>



