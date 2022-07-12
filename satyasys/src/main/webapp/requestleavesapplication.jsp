<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.org.it.MysqlConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>(-: Leave Request Page :-)</h1>
	<br><br><br>
	<h2><a href = "requestleavesapplication.jsp">view leave requests </a> ||| <a href ="#">home</a></h2>
	<br><br>
	<table  border = "2" width = "500" height = "200" cellpadding = "20" margin-top ="40px">
	<tr><td>eid</td><td>ename </td><td>eemail</td><td>edept</td><td>available leaves</td><td>applied leaves</td><td>status</td><td>mname</td>
	<td>fdate</td><td>tdate</td><td>leave id</td><td>action</td></tr>
	<br><br>
	<%
		String mdept = (String) session.getAttribute("mdept");
		Connection connection =MysqlConnection.getConnect();
		PreparedStatement ps = connection.prepareStatement("select * from employeeleave where edept = ? and status = ? ");
		ps.setString(1, mdept);
		ps.setString(2, "pending");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			%>
			<tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td><td><%=rs.getString(3) %></td><td><%=rs.getString(4)%></td><td><%=rs.getInt(5) %></td>
			<td><%=rs.getInt(6) %></td><td><%=rs.getString(7) %></td>
			<td><%=rs.getString(8) %></td><td><%=rs.getString(9) %></td>
			<td><%=rs.getString(10) %></td><td><%=rs.getInt(11) %></td><td><a href ="acceptence.jsp?leaveid=<%=rs.getInt(11)%>&eid=<%=rs.getInt(1)%>">accept</a></td>
			</tr>
			<%
		}
	
	%>
</center>
</body>
</html>