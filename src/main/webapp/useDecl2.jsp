<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	public int add(int a, int b){
		return a+b;
	}
	public int subtract(int a, int b){
		return a-b;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useDecl2.jsp</title>
</head>
<body>
<%
	int value1 = 3;
	int value2 = 9;	
	
	int addResult = add(value1, value2);
	int subtractResult = subtract(value1, value2);
%>

<%= value1 %> + <%= value2 %> = <%= addResult %><br>
<%= value1 %> - <%= value2 %> = <%= subtractResult %>

</body>
</html>