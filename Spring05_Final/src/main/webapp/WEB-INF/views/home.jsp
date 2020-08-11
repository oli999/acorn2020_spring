<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>
<div class="container">
	<c:choose>
		<c:when test="${empty id }">
			<a href="${pageContext.request.contextPath }/users/loginform.do">로그인</a>
			<a href="${pageContext.request.contextPath }/users/signup_form.do">회원가입</a>
		</c:when>
		<c:otherwise>
			<strong>${id }</strong>님 로그인중...
			<a href="${pageContext.request.contextPath }/users/logout.do">로그아웃</a>
		</c:otherwise>
	</c:choose>
	<h1>인덱스 페이지 입니다.</h1>
	<p>Spring Framework 동작중 ...</p>
</div>
</body>
</html>





