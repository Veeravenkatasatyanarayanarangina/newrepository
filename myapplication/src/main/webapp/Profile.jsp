<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<div align="center">
<br><br><br>
<h2 align="center"><a href="piolet_home">HOME</a></h2>
<a href ="Profile.jsp">pilot profile</a>
<a href ="pilot_travels.jsp">pilot timings</a>
<a href ="index.html">logout</a>


<%@ page import="java.sql.*" %>
<%@ page import="com.airlines.myapp.*" %>
<br><br><br>
<table border = "2" width = "400" height = "200" cellpadding = "20" margin-top ="40px">
<tr><td>pname</td><td>email</td><td>pid</td><td>experience</td></tr>
<%
	
	
	Connection connection = Connecting.getConnect();
	String email= (String)session.getAttribute("email");
	PreparedStatement ps = connection.prepareStatement("select * from pioletdetails where email=? ");
	ps.setString(1, email);
	ResultSet rs =ps.executeQuery();
	while(rs.next())
	{
%>
<tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getInt(4)%></td>
<td><%=rs.getInt(5)%></td></tr>

<%} %>

</table>
</div>
</body>
</html>