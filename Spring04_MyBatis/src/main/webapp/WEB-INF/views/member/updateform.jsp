<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/member/updateform.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h1>회원 정보 수정 폼 입니다.</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${dto.num }" />
		<div class="form-group">
			<label for="num">번호</label>
			<input type="text" id="num" class="form-control" value="${dto.num }" disabled/>
		</div>
		<div class="form-group">
			<label for="name">이름</label>
			<input type="text" id="name" name="name" class="form-control"
				value="${dto.name }"/>
		</div>
		<div class="form-group">
			<label for="addr">주소</label>
			<input type="text" id="addr" name="addr" class="form-control"
				value="${dto.addr }"/>
		</div>
		<button type="submit" class="btn btn-primary">수정확인</button>
		<button type="reset" class="btn btn-warning">취소</button>
	</form>
</div>
</body>
</html>





