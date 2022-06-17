package com.airlines.myapp;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.protocol.Resultset;
@WebServlet("/Check_Details")
public class Check_Details extends HttpServlet
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Connection connection = com.airlines.myapp.JdbcConnection.connect();
			String ticket = req.getParameter("ticketid");
			String mob = req.getParameter("phonenumber");
			PreparedStatement ps = connection.prepareStatement("select * from ticketbooking where  p_mobile=? and  p_ticketno=?");
			ps.setString(1, mob);
			ps.setString(2, ticket);
			ResultSet rs = ps.executeQuery();
			PrintWriter writer = resp.getWriter();
			while(rs.next())
			{
				System.out.println("hai");
				writer.println(rs.getString(2));
				
			}
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
