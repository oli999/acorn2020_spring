<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myApp">
<head>
<meta charset="UTF-8">
<title>/users/signup_form.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
<script src="${pageContext.request.contextPath }/resources/js/angular.min.js"></script>
<script>
	//myApp 이라는 모듈 만들기 
	var myApp=angular.module("myApp", []);
	//formCtrl 이라는 컨트롤러 만들기 
	myApp.controller("formCtrl", function($scope, $http){
		//angularjs  가 초기화 될때 최초 한번만 호출된다.
		$scope.idChanged=function(){
			$http({
				url:"checkid.do",
				method:"get",
				params:{inputId:$scope.id}
			})
			.success(function(data){
				//data => {isExist:true} or {isExist:false} 인 object 이다.
				//입력한 아이디가 DB 에 존재 하지 않아야지 사용할수 있다.
				$scope.myForm.id.$valid = !data.isExist;
				$scope.myForm.id.$invalid = data.isExist;
			});
		};
		//비밀번호 입력란을 입력했을때 호출되는 함수 
		$scope.pwdChanged=function(){
			//비밀번호를 같게 입력했는지 여부를 모델로 관리한다. 
			$scope.myForm.pwd.$valid = $scope.pwd==$scope.pwd2;
			$scope.myForm.pwd.$invalid = $scope.pwd!=$scope.pwd2;
		};
	});
</script>
</head>
<body>
<div class="container" ng-controller="formCtrl">
	<h1>회원 가입 폼 입니다.</h1>
	<form action="signup.do" method="post" name="myForm" novalidate>
		<div class="form-group">
			<label for="id">아이디</label>
			<input class="form-control" type="text" name="id" id="id"
				ng-model="id"
				ng-required="true"
				ng-pattern="/^[a-z].{4,9}$/"
				ng-class="{'is-invalid': myForm.id.$invalid && myForm.id.$dirty,'is-valid': myForm.id.$valid}"
				ng-change="idChanged()"/>
			<small class="form-text text-muted">영문자 소문자로 시작하고 최소 5글자~10글자 이내로 입력 하세요.</small>
			<div class="invalid-feedback">사용할수 없는 아이디 입니다.</div>
		</div>
		<div class="form-group">
			<label for="pwd">비밀번호</label>
			<input class="form-control" type="password" name="pwd" id="pwd"
				ng-model="pwd"
				ng-required="true"
				ng-minlength="5"
				ng-maxlength="10"
				ng-class="{'is-invalid': myForm.pwd.$invalid && myForm.pwd.$dirty , 'is-valid': myForm.pwd.$valid}"
				ng-change="pwdChanged()"/>
			<small class="form-text text-muted">최소 5글자~10글자 이내로 입력 하세요.</small>
			<div class="invalid-feedback">비밀번호를 확인 하세요.</div>
		</div>
		<div class="form-group">
			<label for="pwd2">비밀번호 확인</label>
			<input class="form-control" type="password" name="pwd2" id="pwd2"
				ng-model="pwd2"
				ng-change="pwdChanged()"/>
		</div>
		<div class="form-group">
			<label for="email">이메일</label>
			<input class="form-control" type="text" name="email" id="email"
				ng-model="email"
				ng-required="true"
				ng-pattern="/@/"
				ng-class="{'is-invalid':myForm.email.$invalid && myForm.email.$dirty, 'is-valid':myForm.email.$valid}"/>
			<div class="invalid-feedback">이메일 형식에 맞게 입력해 주세요.</div>
		</div>
		<button ng-disabled="myForm.$invalid" class="btn btn-primary" type="submit">가입</button>
		<button class="btn btn-danger" type="reset">Reset</button>
	</form>
</div>
</body>
</html>








