<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	Date now = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<title>invalidCharset.jsp</title>
</head>
<body>
	현재 시각:
	<%= now %>
</body>
</html>