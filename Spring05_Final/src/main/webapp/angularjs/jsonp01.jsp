<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// callback 이라는 파라미터 명으로 전달되는 문자열 읽어오기
	String callback=request.getParameter("callback");
	// 클라이언트에게 응답할 데이터라고 가정
	int num=1;
	String name="김구라";
%>    
<%if(callback != null){ %>
	<%=callback %>({num:<%=num %>, name:"<%=name %>"});
<%}else{ %>
	{"num":<%=num %>, "name":"<%=name %>"}
<%} %>


