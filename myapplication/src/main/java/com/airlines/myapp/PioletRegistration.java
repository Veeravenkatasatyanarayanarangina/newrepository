package com.airlines.myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PioletRegistration")
public class PioletRegistration extends HttpServlet 
{
	Connection connection;
	public void init(ServletConfig config)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/satyaairlines";
		String user = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pname = req.getParameter("pname");
		String email = req.getParameter("email");
		String pw = req.getParameter("password");
		int pid = Integer.parseInt(req.getParameter("id"));
		int hrs = Integer.parseInt(req.getParameter("hrs"));
		 
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into  pioletdetails values (?,?,?,?,?)");
			preparedStatement.setString(1, pname);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, pw);
			preparedStatement.setInt(4,pid);
			preparedStatement.setInt(5, hrs);
			int record = preparedStatement.executeUpdate();
			PrintWriter writer = resp.getWriter();
			if (record>0)
			{
				resp.sendRedirect("index.html");
				
			}
			else
			{
				System.out.println("not updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
