<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.sql.*" %>
<%@ page import="org.satya.*" %>
<%
	int mid = (Integer)session.getAttribute("mid");
	String mname = (String) session.getAttribute("mname");
	String mgrmail = (String) session.getAttribute("mgremail");
	String mgrdept = (String) session.getAttribute("mgrdept");
%>
<center>
<h1>manager profile</h1>
<h1><a href ="acceptleave.jsp">active leaves </a> ||| <a href ="leavesacceptence.jsp">leave applications</a></h1>
<table border = "2" width = "400" height = "200" cellpadding = "20" margin-top ="40px">
<tr>
<td>managerid</td><td>manager name</td><td>manager mailid</td><td>manager dept. </td>
</tr>
<tr>
<td><%=mid %></td><td><%=mname %></td><td><%=mgrmail %></td><td><%=mgrdept %></td>
</tr>
</table>
<a href="recruting.jsp">recruiting candidates</a>
</center>


</body>
</html>