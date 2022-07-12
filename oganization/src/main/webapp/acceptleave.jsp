<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%@page import="org.satya.*" %>
<%
	Connection connection = Connecting.getConnect();
	PreparedStatement ps = connection.prepareStatement("update employee set leavestatus = ? where mgr=?");
	ps.setString(1, "granted");
	ps.setInt(2,(Integer)session.getAttribute("mid"));
	int record = ps.executeUpdate();
	if(record>0)
	{
		%>
		<center>
		<h1>accepted leaves </h1>
					<table border = "2" width = "400" height = "200" cellpadding = "20" margin-top ="40px">
					<tr>
					<td>
						emploayee id
					</td>
					<td>
						emploayee name
					</td>
					<td>
						emploayee emailid
					</td>
					<td>
						emploayee manager
					</td>
					
					<td>
						emploayee desiganation
					</td>
					<td>
						emploayee leaves
					</td>
					<td>
						emploayee applied leaves
					</td>
					<td>
						emploayee leave status
					</td>
					</tr>
					
					<%
					ps = connection.prepareStatement("select * from employee where leavestatus= ?");
					ps.setString(1, "granted");
					ResultSet rs2 = ps.executeQuery();
					while(rs2.next()){
						%>
						<tr>
						<td>
							<%=rs2.getInt(1) %>
						</td>
						<td>
							<%=rs2.getString(2) %>
						</td>
						<td>
							<%=rs2.getString(3) %>
						</td>
						<td>
							<%=rs2.getInt(4) %>
						</td>
						
						<td>
							<%=rs2.getString(5) %>
						</td>
						<td>
							<%=rs2.getInt(6) %>
						</td>
						<td>
							<%=rs2.getInt(8) %>
						</td>
						<td>
							<%=rs2.getString(9) %>
						</td>
						</tr>
						</table>
						</center>
						<%} 
		
	}
	%>


</body>
</html>