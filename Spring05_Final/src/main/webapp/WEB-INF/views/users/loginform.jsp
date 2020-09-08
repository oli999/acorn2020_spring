<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/loginform.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
<link rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.css"/>
<style>
	.animate__shakeX{
		animation-duration: 0.4s;
	}
	#submitBtn:hover{
		animation-name: heartBeat;
		animation-duration: 0.4s;
		animation-timing-function: ease-out;
		animation-iteration-count: 1; 
	}
</style>
</head>
<body>
<div class="container animate__animated animate__fadeInLeft">
	<h1>로그인 폼</h1>
	<form action="login.do" method="post" id="loginForm">
		<%-- 원래 가려던 목적지 정보를 url 이라는 파라미터 명으로 가지고 간다 --%>
		<input type="hidden" name="url" value="${url }" />
		<div class="form-group animate__animated">
			<label for="id">아이디</label>
			<input class="form-control" type="text" name="id" id="id"/>
		</div>
		<div class="form-group animate__animated">
			<label for="pwd">비밀번호</label>
			<input class="form-control" type="password" name="pwd" id="pwd" />
		</div>
		<button class="btn btn-primary" type="submit" id="submitBtn">로그인</button>
	</form>
</div>
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.5.1.js"></script>
<script>
	//폼에 submit 이벤트가 일어 났을때 실행할 함수 등록
	$("#loginForm").on("submit", function(){
		//1. 아이디를 입력 했는지 검증
		var inputId=$("#id").val();
		if(inputId==""){
			$("#id")
			.parent()
			.addClass("animate__shakeX")
			.one("animationend", function(){
				$(this).removeClass("animate__shakeX");
			});
			return false; //폼 전송 막기 
		}
		//2. 비밀번호를 입력 했는지 검증
		var inputPwd=$("#pwd").val();
		if(inputPwd==""){
			$("#pwd")
			.parent()
			.addClass("animate__shakeX")
			.one("animationend", function(){
				$(this).removeClass("animate__shakeX");
			});
			return false; //폼 전송 막기 
		}		
	});
</script>
</body>
</html>





