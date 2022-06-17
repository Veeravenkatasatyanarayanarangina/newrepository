package com.airlines.myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/PioletLogin")
public class PioletLogin extends HttpServlet
{
	Connection connection;
	public void init(ServletConfig config)
	{
		try {
			connection = Conneter.getConnect();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pid = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		HttpSession httpSession = req.getSession();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from pioletdetails where pid = ? and email=?");
			preparedStatement.setInt(1, pid);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				httpSession.setAttribute("id", pid);
				httpSession.setAttribute("email", password);
				
				PrintWriter writer = resp.getWriter();
				writer.println("<html><body><h1>"+resultSet.getString(1)+" login  successfull</h1>");
				writer.println("<p>if you want go to index page <a href = 'index.html'>click here</p>");
				writer.println("</body></html>");
				resp.sendRedirect("piolet_home.html");
				
			}
			else
			{
				resp.sendRedirect("pioletlogin.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
