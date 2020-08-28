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
		//페이지가 로딩되는 시점에 msgs 라는 모델을 정의하고 배열 저장하기 
		$scope.msgs=[{msg:"하나"},{msg:"두울"}];
		//페이지가 로딩되는 시점에 send  라는 함수 정의하기 
		$scope.send=function(){
			//msgs 배열에 새로운 object 만들어서 저장하기 (view 에 자동 반영된다.)
			$scope.msgs.push({msg:$scope.inputMsg});
		};
		
		//전화기 목록을 담을 배열
		$scope.phones=[];
		//전화기 목록을 얻어오는 함수 
		$scope.getPhones=function(){
			$scope.phones.push({name:"아이폰 6",snippet:"가볍고 이쁜 폰입니다.",price:80});
			$scope.phones.push({name:"겔럭시 S5",snippet:"삼성에서 만든 방수폰 입니다.",price:110});
			$scope.phones.push({name:"Nexus 6",snippet:"Google 테블릿 입니다.",price:65});
			$scope.phones.push({name:"옵티머스 G",snippet:"LG 핸드폰 입니다.", price:80});
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
		<h1>전화기 목록입니다.</h1>
		<button ng-click="getPhones()">목록 받아오기</button>
		<table>
			<tr>
				<th>이름</th>
				<th>설명</th>
				<th>가격</th>
			</tr>
			<tr ng-repeat="tmp in phones | filter:keyword | orderBy: orderValue : isReverse">
				<td ng-bind="tmp.name"></td>
				<td ng-bind="tmp.snippet"></td>
				<td>{{tmp.price}}</td>
			</tr>
		</table>
		<input ng-model="keyword" type="text" placeholder="검색어 입력..."/>
		<select ng-model="orderValue">
			<option value="">정렬</option>
			<option value="name">이름</option>
			<option value="price">가격</option>
		</select>
		<label>
			<input type="checkbox" ng-model="isReverse"/> 역순
		</label>
		<p>입력한 검색어 : <strong>{{keyword}}</strong></p>
		<p>정렬 방식 : <strong>{{orderValue}}</strong></p>
	</div>
</body>
</html>







