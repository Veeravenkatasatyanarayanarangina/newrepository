package org.satya;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/RegistrationOfEmployee")
@MultipartConfig(maxFileSize = 99999999)
public class RegistrationOfEmployee extends HttpServlet
{
	Connection connection;
	PreparedStatement ps;
	
	public void init(ServletConfig config)
	{
		try {
			connection=Connecting.getConnect();
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int empid =Integer.parseInt( request.getParameter("empid"));
		String  name = request.getParameter("ename");
		String mail =request.getParameter("mail");
		String design = request.getParameter("designation");
		String password = request.getParameter("password");
		
		
		
		try {
			ps = connection.prepareStatement("insert into employee(empid,ename,email,designation,leaves,password) values (?,?,?,?,?,?)");
			
			ps.setInt(1, empid);
			ps.setString(2, name);
			ps.setString(3, mail);
			ps.setString(4, design);
			ps.setInt(5, 20);
			ps.setString(6, password);
			int record = ps.executeUpdate();
			if(record > 0 )
			{
				response.sendRedirect("employeelogin.html");
				
			}
			else
			{
				System.out.println("not updated.......");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
