package org.satya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecting 
{
	
	public static Connection getConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/organization";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

}
