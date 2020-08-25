<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/error/no_delivery.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
	<div class="container">
		<h1>배송 관련 오류가 발생했습니다.</h1>
		<p class="alert alert-danger">
			<strong>${exception.message }</strong>
			배송기사가 회복하면 다시 연락 드릴께요. 죄송합니다~
			<a class="alert-link" href="${pageContext.request.contextPath }/">인덱스로</a>
		</p>
	</div>
</body>
</html>




