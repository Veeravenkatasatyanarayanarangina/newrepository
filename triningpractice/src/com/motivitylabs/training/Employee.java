package com.motivitylabs.training;

public class Employee {

	public static void main(String[] args) 
	{
		ItServiceDesk isd = new ItServiceDesk();
		isd.ticketissuelist();
		System.out.println("===========================");
		isd.ticketissue("server problem");
		System.out.println("============================");
		System.out.println(isd.solvedissue());
		System.out.println("============================");
		System.out.println(isd.confirmation(true));
		
	}

}
