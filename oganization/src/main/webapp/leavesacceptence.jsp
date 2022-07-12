<%@page import="java.net.http.HttpConnectTimeoutException"%>
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
					<table border = "2" width = "400" height = "200" cellpadding = "20" margin-top ="40px">
					<tr>
					<td>
						employee id
					</td>
					<td>
						employee name
					</td>
					<td>
						employee email id
					</td>
					<td>
						employee manager
					</td>
					
					<td>
						employee designation
					</td>
					<td>
						employee leaves
					</td>
					<td>
						employee applied leaves
					</td>
					<td>
						employee leave status
					</td>
					<td>
					     accept
					</td>
					</tr>
					<%@ page import="java.sql.*" %>
					<%@page import="org.satya.*" %>
					<%
						Connection connection = Connecting.getConnect();
						Statement st = connection.createStatement();
						ResultSet rs = st.executeQuery("select * from employee where leavestatus  = 'pending'");
						while(rs.next()){
					%>
					<tr>
					<td>
						<%=rs.getInt(1) %>
					</td>
					<td>
						<%=rs.getString(2) %>
					</td>
					<td>
						<%=rs.getString(3) %>
					</td>
					<td>
						<%=rs.getInt(4) %>
					</td>
					
					<td>
						<%=rs.getString(5) %>
					</td>
					<td>
						<%=rs.getInt(6) %>
					</td>
					<td>
						<%=rs.getInt(8) %>
					</td>
					<td>
						<%=rs.getString(9) %>
					</td>
					<td>
					     <a href = "acceptleave.jsp">accept</a>
					</td>
					</tr>
					
					<%} %>
					</table>
					</center>
					

</body>
</html>