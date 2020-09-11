<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// callback 이라는 파라미터 명으로 전달되는 문자열 읽어오기
	String callback=request.getParameter("callback");
	// msg 라는 파라미터 명으로 전달되는 문자열 읽어오기
	String msg=request.getParameter("msg");
	System.out.println("msg:"+msg);
%>    
<%if(callback != null){ %>
	<%=callback %>({isSuccess:true});
<%}else{ %>
	{"isSuccess":true}
<%} %>


