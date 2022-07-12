
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>


	<%@ page import="java.sql.*" %>
	<%@ page import="org.satya.*" %>
	<h1>employee profile</h1>
	
	<h1><a href = "index.html">home</a>||<a href ="employeeleaveform.html">apply for leave</a> </h1>
	<%
		
	Connection connection = Connecting.getConnect();
	String empemail = (String) session.getAttribute("empemail");
	String emppassword = (String) session.getAttribute("emppassword");
	PreparedStatement ps  =connection.prepareStatement("select * from employee where email = ? and password=?");
	ps.setString(1,empemail);
	ps.setString(2,emppassword);
	ResultSet resultset = ps.executeQuery();
	%>
	<table border = "2" width = "400" height = "200" cellpadding = "20" margin-top ="40px">
		<tr>
		<td> empid</td><td>empname</td><td>email</td><td>managerid</td><td>designation</td><td>reaminingleaves</td></tr>
		
	<% 
	while(resultset.next())
	{
	%>
		<tr>
		<td><%=resultset.getInt(1) %></td><td><%=resultset.getString(2) %></td><td><%=resultset.getString(3) %></td><td><%=resultset.getInt(4) %></td><td><%=resultset.getString(5) %></td><td><%=resultset.getInt(6) %></td></tr>
		
	<%
	}
	%>
	</table>
			
</center>
</body>
</html>