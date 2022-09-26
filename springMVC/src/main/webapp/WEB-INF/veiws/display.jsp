<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>displayjsp</title>
</head>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">
username : <%= request.getAttribute("username")%>
password : <%= request.getAttribute("password")%>
phno : <%= request.getAttribute("phno")%>
</h1>
</body>
</html>