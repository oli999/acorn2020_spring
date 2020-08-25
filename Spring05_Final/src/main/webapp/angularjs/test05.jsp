<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test05.jsp</title>
<!-- bootstrap css 로딩 시키기 -->
<link href="../resources/css/bootstrap.css" rel="stylesheet"/>
<!-- angularjs 로딩 시키기 -->
<script src="../resources/js/angular.min.js"></script>
</head>
<!-- body 에서 일어나는 일은 angular 로 관리를 하겠다라는 의미 -->
<body ng-app>
<div class="container">
	<h1>form 검증</h1>
	<!-- novalidate 는 웹브라우저가 자체 유효성 검증을 하지 못하도록 하는 설정 -->
	<form name="myForm" action="insert.jsp" method="post" novalidate>
		<div class="form-group">
			<label for="id">아이디</label>
			<input ng-model="id" ng-required="true" 
				type="text" name="id" id="id" class="form-control"
				ng-class="{'is-invalid': myForm.id.$invalid && myForm.id.$dirty, 'is-valid': myForm.id.$valid}"/>
			<div class="invalid-feedback">아이디는 반드시 입력하세요</div>
			<div class="valid-feedback">아이디를 제대로 입력 했습니다</div>
		</div>
		<button class="btn btn-outline-primary" type="submit" ng-disabled="myForm.id.$invalid">제출</button>	
	</form>
	<p> 입력한 아이디 : <strong>{{id}}</strong></p>
	<p> 아이디 유효한지 여부 : <strong>{{myForm.id.$valid}}</strong></p>
	<p> 아이디 유효하지 않은지 여부 : <strong>{{myForm.id.$invalid}}</strong></p>
	<p>	아이디가 청결(순결) 한지 여부 : <strong>{{myForm.id.$pristine}}</strong></p>
	<p> 아이디가 더렵혀졌는지 여부: <strong>{{myForm.id.$dirty}}</strong>
</div>
</body>
</html>
















