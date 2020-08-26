<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html ng-app="myApp">
<head>
<meta charset="UTF-8">
<title>/angularjs/test08.jsp</title>
<script src="../resources/js/angular.min.js"></script>
<script>
	// myApp 이라는 이름의 모듈 만들기 
	var myApp=angular.module("myApp", []);
	// 모듈을 이용해서 one 이라는 이름의 컨트롤러 만들기 
	myApp.controller("one", function($scope, $http){
		//$http 는 서버와 통신을 할수 있는 함수 이다.
		console.log($http);
		//전송 버튼을 눌렀을때 호출되는 함수 
		$scope.send=function(){
			$http({
				url:"send.jsp",
				method:"post",
				params:{msg:$scope.msg},
				headers:{"Content-Type":"application/x-www-form-urlencoded;charset=utf-8"}
			}).success(function(data){
				//data : {toClient:"hello"} 구조의 object 이다.
				console.log(data);
				$scope.result=data.toClient;
			});
		};
		
		$scope.send2=function(){
			$http({
				url:"send.jsp",
				method:"get",
				params:{msg:$scope.msg2}
			}).success(function(data){
				//data : {toClient:"hello"} 구조의 object 이다.
				console.log(data);
				$scope.result2=data.toClient;
			});
		};
	});
</script>
</head>
<body ng-controller="one">
	<h3>$http 서비스 테스트</h3>
	<input type="text" ng-model="msg" placeholder="서버에 할말 입력..."/>
	<button ng-click="send()">Ajax 전송(post)</button>
	<p ng-bind="result"></p>
	
	<input type="text" ng-model="msg2" placeholder="서버에 할말 입력..."/>
	<button ng-click="send2()">Ajax 전송(get)</button>
	<p ng-bind="result2"></p>
</body>
</html>














