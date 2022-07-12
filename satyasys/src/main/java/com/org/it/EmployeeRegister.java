package com.org.it;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int eid = Integer.parseInt(req.getParameter("eid"));
		String ename = req.getParameter("ename");
		String eemail = req.getParameter("eemail");
		String  ephone = req.getParameter("ephone");
		String epassword = req.getParameter("epassword");
		String edept = req.getParameter("edept");
		
		try {
			Connection connection = MysqlConnection.getConnect();
			PreparedStatement ps = connection.prepareStatement("insert into employee values (?,?,?,?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setString(3, eemail);
			ps.setString(4, ephone);
			ps.setString(5,epassword);
			ps.setString(6, edept);
			int record = ps.executeUpdate();
			if(record>0)
			{
				resp.sendRedirect("employeelogin.html");
			}
			else
			{
				resp.sendRedirect("employeeregistration.html");
			}
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		
	}
	

}
