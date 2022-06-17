package com.abc.servletpr;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TicketBooking extends HttpServlet {
	Connection connection = null;
	PreparedStatement ps;
	
	public void init(ServletConfig config)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/satyaairlines";
		String user = "root";
		String password = "root";
		 try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fname = request.getParameter("fname");
		String lname =request.getParameter("lname");
		String mob = request.getParameter("mobno");
		String email = request.getParameter("email");
		String ppno = request.getParameter("passno");
		String fromst = request.getParameter("fromstation");
		String tost = request.getParameter("tostation");
		String date = request.getParameter("tdate");
		String catogiry = request.getParameter("catgiry");
		Random random = new Random();
		String ticket = "ASF"+random.nextDouble(10000);
		
		try {
			ps = connection.prepareStatement("insert into ticketbooking( p_firstname,p_lastname,p_mobile, p_email,p_passport, p_ticketno, from_city,to_city,doj,catogiry )values (?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, mob);
			ps.setString(4, email);
			ps.setString(5, ppno);
			ps.setString(6, ticket);
			ps.setString(7, fromst);
			ps.setString(8, tost);
			ps.setString(0, date);
			ps.setString(10, catogiry);
			
			int record = ps.executeUpdate();
			PrintWriter writer =response.getWriter();
			if (record>0)
			{
				writer.println("<html> <body> <h1 style: color=green;>");
				writer.println("records updated successfully...");
				writer.println("</h1></body></html>");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
