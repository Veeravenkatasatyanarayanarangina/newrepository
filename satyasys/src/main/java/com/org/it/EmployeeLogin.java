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

@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String eemail = req.getParameter("eemail");
		String epassword = req.getParameter("epassword");
		
		try {
			Connection connection = MysqlConnection.getConnect();
			PreparedStatement ps = connection.prepareStatement("select * from employee where eemail = ? and epassword = ?");
			ps.setString(1, eemail);
			ps.setString(2, epassword);
			ResultSet set = ps.executeQuery();
			if (set.next())
			{
				HttpSession hs = req.getSession();
				hs.setAttribute("eid",set.getInt(1));
				hs.setAttribute("eemail",set.getString(3));
				hs.setAttribute("ephone", set.getString(4));
				hs.setAttribute("edept", set.getString("edept"));
				resp.sendRedirect("EmployeeProfile.jsp");
			}
			else
			{
				resp.sendRedirect("employeelogin.html");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
