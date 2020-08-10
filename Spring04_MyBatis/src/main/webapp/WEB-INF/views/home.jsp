<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
</head>
<body>
<div class="container">
	<h1>인덱스 페이지 입니다.</h1>
	<ul>
		<li><a href="member/list.do">회원 목록 보기</a></li>
		<li><a href="todo/list.do">할일 목록 보기</a></li>
		<li><a href="json01.do">json 응답01</a></li>
		<li><a href="json02.do">json 응답02</a></li>
		<li><a href="json03.do">json 응답03</a></li>
		<li><a href="json04.do">json 응답04</a></li>
		<li><a href="json05.do">json 응답05</a></li>
		<li><a href="json06.do">json 응답06</a></li>
		<li><a href="json07.do">json 응답07</a></li>
		<li><a href="json08.do">json 응답08</a></li>
		<li><a href="xml01.do">xml 응답01</a></li>
		<li><a href="xml02.do">xml 응답02</a></li>
		<li><a href="xml03.do">xml 응답03</a></li>
	</ul>
	<button id="testBtn">ajax 테스트(콘솔확인)</button>
	
	<h2>파일 업로드 테스트</h2>
	<form action="upload.do" method="post" enctype="multipart/form-data">
		<input type="file" name="myFile"/>
		<button type="submit">업로드</button>
	</form>
</div>
<script src="resources/js/jquery-3.5.1.js"></script>
<script>
	$("#testBtn").on("click", function(){
		$.ajax({
			url:"json06.do",
			method:"GET",
			success:function(data){
				//data 는 plain object or array 이다.
				console.log(data);
			}
		});
	});
</script>
</body>
</html>





