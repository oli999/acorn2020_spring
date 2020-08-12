<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/private/pwd_update.jsp</title>
</head>
<body>
<div class="container">
	<c:choose>
		<c:when test="${isSuccess }">
			<p>
				<strong>${id }</strong>님 비밀번호를 수정했습니다.
				<a href="info.do">확인</a>
			</p>
		</c:when>
		<c:otherwise>
			<p>
				비밀번호 수정 실패!
				<a href="pwd_updateform.do">다시 시도</a>
			</p>
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>





