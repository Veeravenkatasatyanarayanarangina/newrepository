<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String temp = request.getParameter("days");
 int days = Integer.parseInt(temp);

%>
<h1><%=days %></h1>

</body>
</html>