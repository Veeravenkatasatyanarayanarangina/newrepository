
<!DOCTYPE html>
<%@page import="com.org.it.MysqlConnection"%>
<%@page import="java.sql.*"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>(-:EMPLOYEE PROFILE :-)</h1>
	
	<h3><a href = "applyforleave.html">APPLY LEAVE</a> |-| <a href = "statusofleaveapplication.jsp">STATUS OF LEAVE APPLICATION</a></h3>
	<br><br>
	<table  border = "2" width = "500" height = "200" cellpadding = "20" margin-top ="40px">
	<tr><td>empid</td><td>emp name </td><td>email</td><td>ephone</td><td>edept</td></tr>
	<%
		int eid  = (Integer)session.getAttribute("eid");
		String email = (String) session.getAttribute("eemail");
		Connection connection = MysqlConnection.getConnect();
		PreparedStatement ps = connection.prepareStatement("select * from employee where eid = ? and eemail = ?");
		ps.setInt(1, eid);
		ps.setString(2, email);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			%>
			<tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td>
			<td><%=rs.getString(6) %></td></tr>
			<% 
		}
	%>
	
	
	</table>
	
	</center>

</body>
</html>