package org.satya;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		try {
		Connection connection = Connecting.getConnect();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PreparedStatement ps = connection.prepareStatement("select * from employee where email = ? and password = ?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet resultSet = ps.executeQuery();
		if (resultSet.next())
		{
			HttpSession session = request.getSession();
			session.setAttribute("empemail", email);
			session.setAttribute("emppassword", password);
			
			
			resp.sendRedirect("employeeprofile.jsp");
		}
		else
		{
			System.out.println("pass word error");
		}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}

}
