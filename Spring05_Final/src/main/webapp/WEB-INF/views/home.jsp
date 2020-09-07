<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<c:choose>
		<c:when test="${empty id }">
			<a href="${pageContext.request.contextPath }/users/loginform.do">로그인</a>
			<a href="${pageContext.request.contextPath }/users/signup_form.do">회원가입</a>
		</c:when>
		<c:otherwise>
			<a href="${pageContext.request.contextPath }/users/private/info.do"><strong>${id }</strong></a> 님 로그인중...
			<a href="${pageContext.request.contextPath }/users/logout.do">로그아웃</a>
		</c:otherwise>
	</c:choose>
	<h1>인덱스 페이지 입니다.</h1>
	<p>Spring Framework 동작중 ...</p>
	<ul>
		<li><a href="file/list.do">자료실 목록 보기</a></li>
		<li><a href="cafe/list.do">카페글 목록 보기</a></li>
		<li><a href="shop/list.do">상품 목록 보기</a></li>
		<li><a href="angularjs/test01.jsp">angularjs  테스트</a></li>
		<li><a href="css3/Step01_BorderRadius.html">css3 테스트</a></li>
	</ul>
</div>
</body>
</html>





