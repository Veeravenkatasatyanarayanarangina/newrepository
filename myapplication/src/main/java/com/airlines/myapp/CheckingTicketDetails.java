package com.airlines.myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckingTicketDetails")
public class CheckingTicketDetails extends HttpServlet {
	Connection connection;
	
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String pnumber = request.getParameter("pnumber");
		String mob = request.getParameter("phonenumber");
		String query = "select * from ticketbooking where p_mobile = ? and  p_passport=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,mob);
			preparedStatement.setString(2, pnumber);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("prepare also executed..........");
			PrintWriter writer = response.getWriter();
			if(resultSet.next())
			{
				System.out.println();
				response.sendRedirect("index.html");
				writer.println("<html><body><h1>"+resultSet.getString(2)+" login success full </h1></body></html>");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("program excecuted......");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
