<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name=request.getParameter("name");
	String addr=request.getParameter("addr");
	System.out.println(name+"|"+addr);
%>
{"isSuccess":true}