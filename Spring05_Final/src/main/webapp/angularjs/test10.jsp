<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test10.jsp</title>
<script src="../resources/js/angular.min.js"></script>
</head>
<body ng-app>
	<h1>과일을 선택하세요.</h1>
	<select ng-model="selectedFruit" ng-change="selectedFruit2=selectedFruit">
		<option value="">선택</option>
		<option value="orange">오렌지</option>
		<option value="apple">사과</option>
		<option value="banana">바나나</option>
	</select>
	<p>선택된 과일 : <strong ng-bind="selectedFruit"></strong></p>
	<select ng-model="selectedFruit2">
		<option value="">선택</option>
		<option value="orange">오렌지</option>
		<option value="apple">사과</option>
		<option value="banana">바나나</option>
	</select>
	<h1>체크 박스를 테스트 해 보세요.</h1>
	<label>
		<input type="checkbox" ng-model="isShow"/> isShow
	</label>
	<label>
		<input type="checkbox" ng-model="isMake"/> isMake
	</label>
	<!-- 문서객체를 보이고 숨기고를 조작하는 지시어는 ng-show -->
	<p ng-show="isShow">안녕하세요</p>
	<!-- 문서객체를 동적으로 만들고 제거하고를 조작하는 지시어는 ng-if -->
	<p ng-if="isMake">또 만났군요!</p>
</body>
</html>







