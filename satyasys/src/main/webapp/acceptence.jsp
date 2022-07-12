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
<title>hai</title>
</head>
<body>
	<%
		Connection connection = MysqlConnection.getConnect();
	
		int eid = Integer.parseInt(request.getParameter("eid"));
		int lid =Integer.parseInt(request.getParameter("leaveid"));
		out.println(eid);
		out.println(lid);
		int availableleaves;
		int appliedleaves;
		
		PreparedStatement ps = connection.prepareStatement("select available,appliedleaves from  employeeleave where eid = ? and  leaveid=?");
		ps.setInt(1, eid);
		ps.setInt(2, lid);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			availableleaves=rs.getInt(1);
			appliedleaves = rs.getInt(2);
			if(availableleaves>=appliedleaves)
			{
				PreparedStatement statement = connection.prepareStatement("update employeeleave set available = ?,appliedleaves =? , status = ? where edept = ?");
				statement.setInt(1, availableleaves-appliedleaves);
				statement.setInt(2, appliedleaves-appliedleaves);
				statement.setString(3, "approved");
				statement.setString(4,(String) session.getAttribute("mdept"));
				int result = statement.executeUpdate();
				if(result>0)
				{
					response.sendRedirect("requestleavesapplication.jsp");
				}
			}
		}
		
		else
		{
			response.sendRedirect("requestleaveapplication.jsp");
		}
	
	%>

</body>
</html>