
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
	<%@ page import= "org.satya.*" %>
	
	<%
		int empid = Integer.parseInt(request.getParameter("lid"));
		int leaves =  Integer.parseInt(request.getParameter("leaves"));
		String email = request.getParameter("lmail");
		String reason = request.getParameter("reason");
		Connection connection = Connecting.getConnect();
		if (leaves<=30)
		{
			int availableleaves=0;
			PreparedStatement ps = connection.prepareStatement("select leaves from employee where empid = ? and email = ?");
			ps.setInt(1, empid);
			ps.setString(2,email);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				availableleaves = rs.getInt(1);
			}
			if(leaves <=availableleaves)
			{
				PreparedStatement ps1 = connection.prepareStatement("update employee set leaves =? , apliedleaves = ? , leavestatus = ? where empid = ?");
				ps1.setInt(1, availableleaves-leaves);
				ps1.setInt(2, leaves);
				ps1.setString(3,"pending");
				ps1.setInt(4,empid);
				int record = ps1.executeUpdate();
				if(record>0)
				{
					ps = connection.prepareStatement("select * from employee where empid = ?");
					ps.setInt(1, empid);
					ResultSet rs2 = ps.executeQuery();
					%>
					<center>
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
					if (rs2.next())
					{
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
						<%=rs2.getString(9)%>
					</td>
					</tr>
					</table>
					</center>
					<% 						
						
					}
				}
					
			}
			else
			{
				%>
				<h1>not updated  <%= availableleaves %></h1>
				<% 
			}
			
			
		}
		
	
	%>

</body>
</html>