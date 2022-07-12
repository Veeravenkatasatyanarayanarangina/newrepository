package com.org.it;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ManagerLogin")
public class ManagerLogin  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String memail = req.getParameter("memail");
		String mpassword = req.getParameter("mpassword");
		HttpSession session = req.getSession();
		
		
		try {
			Connection connection = MysqlConnection.getConnect();
			PreparedStatement ps =connection.prepareStatement("select * from manager where memail = ? and mpassword = ?	");
			ps.setString(1, memail);
			ps.setString(2, mpassword);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				session.setAttribute("memail", memail);
				session.setAttribute("mpassword", mpassword);
				resp.sendRedirect("managerprofile.jsp");
			}
			else
			{
				resp.sendRedirect("managerlogin.html");
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
