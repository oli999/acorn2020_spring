<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test07.jsp</title>
<script src="../resources/js/angular.min.js"></script>
<script>
	// "myApp" 이라는 이름의 모듈 만들기 
	var myApp=angular.module("myApp", []);
	// 모듈을 이용해서 myCtrl 이라는 이름의 컨트롤러 만들기 
	myApp.controller("myCtrl", function($scope){
		$scope.nums=[10,20,30,40,50];
		$scope.mem={num:1, name:"김구라"};
		$scope.msg="empty";
		$scope.obj={};
	});
	
</script>
</head>
<body ng-app="myApp">
	<div ng-controller="myCtrl">
		<ul>
			<li ng-repeat="tmp in nums" ng-bind="tmp"></li>
		</ul>
		<p>번호 : {{mem.num}}</p>
		<p>이름 : <span ng-bind="mem.name"></span></p>
		<input type="text" ng-model="msg"/>
		<p> msg : <strong ng-bind="msg"></strong></p>
		<p> obj : <strong>{{obj}}</strong></p>
		<input type="text" ng-model="obj.height" placeholder="키 입력..."/>
		<input type="text" ng-model="obj.weight" placeholder="몸무게 입력..."/>
	</div>
</body>
</html>






