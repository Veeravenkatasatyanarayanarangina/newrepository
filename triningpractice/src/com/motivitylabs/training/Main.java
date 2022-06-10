package com.motivitylabs.training;
//single level inheritance 
class Company
{
	
	void adminDept()
	{
		System.out.println("administration..............");
		System.out.println("admin department is responsible to mange office supplies and place orders");
		System.out.println("mange the regular reports on expences and office budgets.");
		System.out.println("=============================================================");
	}
	void hrdept()
	{
		System.out.println("human resourses dept.................");
		System.out.println("staffing,training,worker protection");
		System.out.println("===================================================");
		
	}
	void itservices()
	{
		System.out.println("it services........");
		System.out.println("identify and diagnose issues and problems");
		System.out.println("support problem identification");
		System.out.println("================================");
	}
	
}
class Motivity extends Company
{
	
}

public class Main 
{
	public static void main(String[] args) 
	{
		Motivity motivity = new Motivity();
		motivity.adminDept();
		motivity.hrdept();
		motivity.itservices();
		
	}
	

}
