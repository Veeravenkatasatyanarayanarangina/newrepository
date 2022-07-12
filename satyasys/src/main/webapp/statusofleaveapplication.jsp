<%@page import="com.org.it.MysqlConnection"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>status of application</title>
</head>
<body>
<center>
<h1>(-:EMPLOYEE LEAVE APPLICATION STATUS :-)</h1>
	
	<h3><a href = "applyforleave.html">APPLY LEAVE</a> |-| <a href = "statusofleaveapplication.jsp">STATUS OF LEAVE APPLICATION</a></h3>
	<br><br>
		<table border = "2" width = "500" height = "200" cellpadding = "20" margin-top ="40px">
		<tr><td>eid</td><td>ename</td><td>eemail</td><td>edept</td><td>available</td><td>appliedleaves</td><td>status</td><td>mname</td><td>fdate</td><td>tdate</td></tr>
		<%
		Connection connection = MysqlConnection.getConnect();
		int eid = (Integer) session.getAttribute("eid");
		
		PreparedStatement ps = connection.prepareStatement("select * from employeeleave where eid = ?");
		ps.setInt(1, eid);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			%>
			<tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td><td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td><td><%=rs.getInt(5) %></td><td><%=rs.getInt(6)%></td>
			<td><%=rs.getString(7) %></td><td><%=rs.getString(8) %></td><td><%=rs.getString(9) %></td><td><%=rs.getString(10) %></td></tr>
			<% 
		}

%>
</body>
</html>