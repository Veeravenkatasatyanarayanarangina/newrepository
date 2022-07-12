
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
	Connection connection = Connecting.getConnect();
	Statement ps = connection.createStatement();
	ResultSet rs = ps.executeQuery("select * from employee ");
	%>
	<center>
	
	<h1>MANAGER RECRUITING CANDIDATES PAGE </h1>
<table border = "2" width = "400" height = "200" cellpadding = "20" margin-top ="40px">
<tr><td>empid</td>
<td>empname</td>
<td>empmailid</td>
<td>emp manager</td>
<td>designation</td>
<td>leaves</td>
<td>recruite</td>
</tr>
<%
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getInt(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getInt(6) %></td>
<td><a href = "selectedupdate.jsp">select</a></td>
</tr>

<%} %>
	

</body>
</html>