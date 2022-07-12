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
<title>applyleavejsp</title>
</head>
<body>
<%
	int eid = (Integer) session.getAttribute("eid");
	String eemail = (String) session.getAttribute("eemail");
	String edept = (String) session.getAttribute("edept");
	String ename = request.getParameter("ename");
	int appliedleaves = Integer.parseInt(request.getParameter("days"));
	String managername = request.getParameter("mname");
	String fdate = request.getParameter("fdate");
	String tdate = request.getParameter("tdate");
	

	Connection connection = MysqlConnection.getConnect();
	PreparedStatement statement = connection.prepareStatement("insert into  employeeleave(eid,ename,eemail,edept,appliedleaves,status,mname,fdate,tdate) values(?,?,?,?,?,?,?,?,?)");
	statement.setInt(1, eid);
	statement.setString(2, ename);
	statement.setString(3, eemail);
	statement.setString(4, edept);
	statement.setInt(5, appliedleaves);
	statement.setString(6, "pending");
	statement.setString(7, managername);
	statement.setString(8,fdate);
	statement.setString(9,tdate);
	
	int record = statement.executeUpdate();
	
	if(record>0)
	{
		%>
		<center>
		<table border = "2" width = "500" height = "200" cellpadding = "20" margin-top ="40px">
		<tr><td>eid</td><td>ename</td><td>eemail</td><td>edept</td><td>available</td><td>appliedleaves</td><td>status</td><td>mname</td><td>fdate</td><td>tdate</td></tr>
		<%
		
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
		
	}
	else
	{
		response.sendRedirect("applyforleave.html");
	}
	 %>
	
	
	


	
</center>
		</table>
</body>
</html>