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

@WebServlet("/ManagerRegister")
public class ManagerRegister extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int mid = Integer.parseInt(req.getParameter("mid"));
		String mname = req.getParameter("mname");
		String memail = req.getParameter("memail");
		String  mphone = req.getParameter("mphone");
		String mpassword = req.getParameter("mpassword");
		String mdept = req.getParameter("mdept");
		
		try {
			Connection connection = MysqlConnection.getConnect();
			PreparedStatement ps = connection.prepareStatement("insert into manager values (?,?,?,?,?,?)");
			ps.setInt(1, mid);
			ps.setString(2, mname);
			ps.setString(3, memail);
			ps.setString(4, mphone);
			ps.setString(5,mpassword);
			ps.setString(6, mdept);
			int record = ps.executeUpdate();
			if(record>0)
			{
				resp.sendRedirect("managerlogin.html");
			}
			else
			{
				resp.sendRedirect("managerregistration.html");
			}
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		
	}

}
