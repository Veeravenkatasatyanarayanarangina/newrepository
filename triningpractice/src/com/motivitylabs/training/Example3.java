package com.motivitylabs.training;

class MagellanicCloud
{
	String claintname = "absd";
	String projectname = "abcapplication Development";
	
	void usedTechnology()
	{
		System.out.println("nothing declared is here");
		System.out.println("claint name : "+claintname);
		System.out.println("");
	}
	
	
}
class MotivityLabs extends  MagellanicCloud
{
	void usedTechnology()
	{
		System.out.println("motivity labs to develop or build a project   used the progaraming language java");
		System.out.println("claint name : "+claintname);
		System.out.println("");
	}
	
}
class Jnit extends MagellanicCloud
{
	void usedTechnology()
	{
		System.out.println("JNIT is used to develop a project using .Net");
		System.out.println("claint name : "+claintname);
		System.out.println("");
	}
}


public class Example3 
{
	public static void main(String[] args) 
	{
		MagellanicCloud mc = new MagellanicCloud();
		mc.usedTechnology();
		System.out.println("============");
		mc = new MotivityLabs();
		mc.usedTechnology();
		System.out.println("============");
		mc=new Jnit();
		mc.usedTechnology();
		
		
	}

}
