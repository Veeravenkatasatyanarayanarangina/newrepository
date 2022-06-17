package com.postgrasql.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostGreConnection 
{
	static Connection getConnection()
	{
		 Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/airlines",
	            "postgres", "root");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      return c;
		
	}
	public static void main(String[] args) 
	{
		if (getConnection() != null)
		{
			System.out.println("connection established");
		}
		
	}
	

}
