<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>manager profile</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%@ page import="com.org.it.*" %>
<center>
	<h1>(-: MANAGER PROFILE PAGE:-)</h1>
	<br><br><br>
	<h2><a href = "requestleavesapplication.jsp">view leave requests </a> ||| <a href ="#">home</a></h2>
	<br><br>
	<table  border = "2" width = "500" height = "200" cellpadding = "20" margin-top ="40px">
	<tr><td>mgrid</td><td>mgr name </td><td>mgrmail</td><td>mgrphone</td><td>mgrdept</td></tr>
	<%
	String mpassword  = (String)session.getAttribute("mpassword");
	String email = (String) session.getAttribute("memail");
	Connection connection = MysqlConnection.getConnect();
	PreparedStatement ps = connection.prepareStatement("select * from manager where memail = ? and mpassword = ? ");
	ps.setString(1, email);
	ps.setString(2, mpassword);
	
	ResultSet rs = ps.executeQuery();
	
	while(rs.next())
	{
		session.setAttribute("mdept", rs.getString(6));
		%>
		<tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td>
		<td><%=rs.getString(6) %></td></tr>
		<% 
	}
		
	
	%>

</center>

</body>
</html>