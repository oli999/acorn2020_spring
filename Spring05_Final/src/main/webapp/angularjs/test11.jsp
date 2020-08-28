<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test11.jsp</title>
<script src="../resources/js/angular.min.js"></script>
<script>
	var myApp=angular.module("myApp", []);
	myApp.controller("msgCtrl", function($scope){
		$scope.msgs=[{msg:"하나"},{msg:"두울"}];
		$scope.send=function(){
			$scope.msgs.push({msg:$scope.inputMsg});
		};
	});
</script>
</head>
<body ng-app="myApp">
	<div class="container" ng-controller="msgCtrl">
		<input type="text" placeholder="메세지 입력..." ng-model="inputMsg"/>
		<button ng-click="send()">전송</button>
		<ul>
			<li ng-repeat="tmp in msgs">{{tmp.msg}}</li>
		</ul>
	</div>
</body>
</html>







