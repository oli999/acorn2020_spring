<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/signup_form.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h1>회원 가입 폼 입니다.</h1>
	<form action="signup.do" method="post" id="myForm">
		<div class="form-group">
			<label for="id">아이디</label>
			<input class="form-control" type="text" name="id" id="id"/>
			<small class="form-text text-muted">영문자 소문자로 시작하고 최소 5글자~10글자 이내로 입력 하세요.</small>
			<div class="invalid-feedback">사용할수 없는 아이디 입니다.</div>
		</div>
		<div class="form-group">
			<label for="pwd">비밀번호</label>
			<input class="form-control" type="password" name="pwd" id="pwd"/>
			<small class="form-text text-muted">최소 5글자~10글자 이내로 입력 하세요.</small>
			<div class="invalid-feedback">비밀번호를 확인 하세요.</div>
		</div>
		<div class="form-group">
			<label for="pwd2">비밀번호 확인</label>
			<input class="form-control" type="password" name="pwd2" id="pwd2"/>
		</div>
		<div class="form-group">
			<label for="email">이메일</label>
			<input class="form-control" type="text" name="email" id="email"/>
			<div class="invalid-feedback">이메일 형식에 맞게 입력해 주세요.</div>
		</div>
		<button class="btn btn-primary" type="submit">가입</button>
		<button class="btn btn-danger" type="reset">Reset</button>
	</form>
</div>
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.5.1.js"></script>
<script>
	//아이디를 검증할 정규 표현식
	var reg_id=/^[a-z].{4,9}$/;
	//비밀번호를 검증할 정규 표현식
	var reg_pwd=/^.{5,10}$/;
	//이메일을 검증할 정규 표현식
	var reg_email=/@/;
	
	//각각의 input 요소의 유효성 여부
	var isIdValid=false;
	var isPwdValid=false;
	var isEmailValid=false;
	//폼 전체의 유효성 여부
	var isFormValid=false;
	
	$("#myForm").on("submit", function(){
		//폼 유효성 여부를 얻어낸다
		isFormValid=isIdValid && isPwdValid && isEmailValid;
		if(!isFormValid){//만일 폼이 유효하지 않으면
			return false;//폼 전송 막기 
		}
	});
	//아이디를 입력했을때 실행할 함수 등록 
	$("#id").on("input", function(){
		//입력한 아이디를 읽어온다.
		var inputId=$("#id").val();
		//아이디 형식에 맞게 입력했는지 여부
		var result=reg_id.test(inputId);
		//일단 두개의 클래스를 제거 하고 
		$(this).removeClass("is-valid is-invalid");
		if(result){//형식에 맞게 입력 했다면
			//ajax 를 이용해서 서버에 보낸후 결과를 응답 받는다.
			$.ajax({
				method:"GET",
				url:"checkid.do",
				data:"inputId="+inputId,
				success:function(data){
					$(this).removeClass("is-valid is-invalid");
					//data => {isExist:true} or {isExist:false} 인 object 이다.
					if(data.isExist){//이미 존재하는 아이디임으로 사용 불가
						isIdValid=false;
						$("#id").addClass("is-invalid");
					}else{//사용가능 
						isIdValid=true;
						$("#id").addClass("is-valid");
					}
	 			}
			});				
		}else{//형식에 맞게 입력 하지 않았다면
			isIdValid=false;
			$("#id").addClass("is-invalid");
		}
	});
	//비밀번호 입력란 혹은 비밀번호 확인란 에 input 이벤트 처리 
	$("#pwd, #pwd2").on("input", function(){
		//입력한 비밀번호를 읽어온다. 
		var inputPwd=$("#pwd").val();
		var inputPwd2=$("#pwd2").val();
		//형식에 맞게 입력했는지 여부
		var result=reg_pwd.test(inputPwd);
		$("#pwd").removeClass("is-valid is-invalid");
		if(result){//형식에 맞게 입력 했다면
			if(inputPwd==inputPwd2){//비밀번호 확인란과 동일하게 입력했다면
				isPwdValid=true;
				$("#pwd").addClass("is-valid");
			}else{//확인란과 다르게 입력했다면
				isPwdValid=false;
				$("#pwd").addClass("is-invalid");
			}
		}else{//형식에 맞게 입력 하지 않았다면
			isPwdValid=false;
			$("#pwd").addClass("is-invalid");
		}
	});
	
	$("#email").on("input", function(){
		var inputEmail=$("#email").val();
		//이메일 유효성 여부를 얻어낸다.
		isEmailValid=reg_email.test(inputEmail);
		$(this).removeClass("is-valid is-invalid");
		if(isEmailValid){
			$(this).addClass("is-valid");
		}else{
			$(this).addClass("is-invalid");
		}
	});
</script>
</body>
</html>








