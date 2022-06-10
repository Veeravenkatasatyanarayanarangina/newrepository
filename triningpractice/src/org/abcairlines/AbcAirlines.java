package org.abcairlines;

public class AbcAirlines 
{
	static String planename = "Boing-121V";//static variable  
	int no_of_passengers;//instance variable
	public static void destination(String destination,int passngers)
	{
		AbcAirlines a1 = new AbcAirlines();
		a1.no_of_passengers =passngers;
		System.out.println("the "+planename+" will carry  "+a1.no_of_passengers+" passngers to "+destination);
	}
	public void crew(String name1,String name2,int passengers)
	{
		/*here instance variable calls directly becouse both are present in the same object......*/
		no_of_passengers = passengers; 
		
		destination("delhi", no_of_passengers);
		/*here static variable are called directly , Because of single copy nature . 
		  this is single copy of static variable belongs to whole class*/
		
		System.out.println("with crew names are "+name1+" and "+name2);
		
	}
	public static void main(String[] args) 
	{
		AbcAirlines a1 = new AbcAirlines();
		/*here we create an object because static and intance methods are stored in different memory's */
		a1.crew("abhiram", "skewer",340);
		
	}

}
