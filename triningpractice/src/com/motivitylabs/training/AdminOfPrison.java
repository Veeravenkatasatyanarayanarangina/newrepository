package com.motivitylabs.training;

class Prisoner
{
	int prisonerid;
	float months;
	static String jailname;
	static int prisonid;
	String cellno;

}
public class AdminOfPrison 
{
	public static void main(String args[])
	{
		Prisoner javid = new Prisoner();
		javid.prisonerid = 100;
		javid.months = 3.6f;
		javid.cellno = "b-1";
		Prisoner.jailname = "rajahmundry central jail";
		Prisoner.prisonid = 53431;
		System.out.println("prisonerid : "+javid.prisonerid);
                System.out.println("months of punishment : "+javid.months);
		System.out.println("prisoner cell no : "+javid.cellno);
		System.out.println("prison name : "+Prisoner.jailname);
		System.out.println("Prison id : "+Prisoner.prisonid);
		System.out.println("===================================");
		Prisoner gopal = new Prisoner();
		gopal.prisonerid = 101;
		gopal.months = 12.6f;
		gopal.cellno = "c-2";
		Prisoner.jailname = "rajahmundry central jail";
		Prisoner.prisonid = 53431;
		System.out.println("prisonerid : "+gopal.prisonerid);
                System.out.println("months of punishment : "+gopal.months);
		System.out.println("prisoner cell no : "+gopal.cellno);
		System.out.println("prison name : "+Prisoner.jailname);
		System.out.println("Prison id : "+Prisoner.prisonid);
		System.out.println("===================================");
		
		
	}

}
