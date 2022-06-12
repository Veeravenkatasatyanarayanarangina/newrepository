package com.onlinelibrary;

import java.util.Scanner;

public class MainAdmission 
{
	 int age;
	 static MainAdmission adm = new MainAdmission();
	public static void main(String[] args)
	{
		System.out.println("enter your age....");
		Scanner sc = new Scanner(System.in);
		adm.age=sc.nextInt();
		getobject().registerAccount();
		getobject().requestBook();
		
		
	}
	public static LibraryUsers getobject()
	{
		
		if (adm.age>12)
		{
			return new AudultUsers(); 
		}
		else
		{
			return new KidUsers();
		}
		
	}
	
}
