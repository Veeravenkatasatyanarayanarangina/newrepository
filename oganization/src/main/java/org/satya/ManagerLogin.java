package org.satya;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ManagerLogin")
public class ManagerLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String mmail = req.getParameter("mmail");
		String mpassword = req.getParameter("mpassword");
		try {
			Connection connection = Connecting.getConnect();
			PreparedStatement ps  = connection.prepareStatement("select * from manager where  mgremail = ? and mgrpassword=?");
			ps.setString(1, mmail);
			ps.setString(2, mpassword);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				HttpSession session = req.getSession();
				session.setAttribute("mid", rs.getInt(1));
				session.setAttribute("mname", rs.getString(2));
				session.setAttribute("mgremail",rs.getString(3));
				session.setAttribute("mgrpassword", rs.getString(4));
				session.setAttribute("mgrdept", rs.getString(5));
				
				resp.sendRedirect("managerprofile.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
