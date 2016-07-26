<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public int multiply(int a, int b){
		int c = a * b;
		return c;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useDecl.jsp</title>
</head>
<body>
<h1>선언부를 사용한 두 정수값의 곱</h1>

10 * 25 = <%= multiply(10, 25) %>

</body>
</html>