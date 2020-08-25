<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test02.jsp</title>
<!-- angularjs 로딩 시키기 -->
<script src="${pageContext.request.contextPath }/resources/js/angular.min.js"></script>
</head>
<!-- body 에서 일어나는 일은 angular 로 관리를 하겠다라는 의미 -->
<body ng-app>

<!-- count 라는 이름의 모델을 만들고 초기값을 0 으로 부여 하겠다 -->
<h1 ng-init="count=0">이벤트 처리</h1>

<!-- 버튼에 클릭 이벤트가 일어나면  count=count+1 이 수행된다. -->
<button ng-click="count=count+1">눌러보셈</button>
<button ng-click="count=0">리셋</button>

<!-- count 모델안에 있는 값을 출력하기 -->
<p>{{count}}</p>
<p ng-bind="count"></p>
</body>
</html>












