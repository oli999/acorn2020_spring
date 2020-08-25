<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test01.jsp</title>
<!-- angularjs 로딩 시키기 -->
<script src="${pageContext.request.contextPath }/resources/js/angular.min.js"></script>
</head>
<body ng-app>
<h1>hello angular js!</h1>
<input ng-model="msg" type="text" placeholder="메세지 입력..."/>
<p>{{msg}}</p>
<h1 ng-init="friends=['김구라','해골','원숭이']">친구 목록 입니다.</h1>
<ul>
	<li ng-repeat="tmp in friends">{{tmp}}</li>
</ul>
<h1>체크박스를 체크 해 보세요.</h1>
<input type="checkbox" ng-model="isShow"/> <strong>{{isShow}}</strong><br/>
<img src="../resources/images/kim1.png" ng-show="isShow" />
</body>
</html>






