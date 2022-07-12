package org.satya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ManagerRegistration")
public class ManagerRegistration extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try {
			Connection connection = Connecting.getConnect();
			PreparedStatement ps = connection.prepareStatement("insert into manager values (?,?,?,?,?)");
			ps.setInt(1,Integer.parseInt(req.getParameter("mid")));
			ps.setString(2,req.getParameter("mname"));
			ps.setString(3, req.getParameter("memail"));
			ps.setString(4,req.getParameter("mpassword"));
			ps.setString(5, req.getParameter("department"));
			int record = ps.executeUpdate();
			PrintWriter writer = resp.getWriter();
			
			
			if(record>0)
			{
				resp.sendRedirect("managerlogin.html");
				
			}
			else
			{
				writer.println("check once...");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
