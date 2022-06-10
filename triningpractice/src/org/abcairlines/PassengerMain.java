package org.abcairlines;

class Aircraft
{
	String destination;
	
	void destinationList()
	{
		System.out.println(" 1. Goa  \n 2. Bangalore \n 3. Delhi \n 4. Kolkata \n 5. Pune");
	}
	String selectedDestination(String destination)
	{
		this.destination = destination;
		return this.destination;
	}
	String confirmDestinataion()
	{
		return destination;
	}
	void passangers(String name,String name2)
	{
		System.out.println("first passenger is : "+name);
		System.out.println("Second passenger name : "+name2);
	}
}
public class PassengerMain 
{
	public static void main(String[] args)
	{
		Aircraft antov = new Aircraft();
		antov.destinationList();
		System.out.println("================");
		System.out.println("passenger choose destinataion is : "+antov.selectedDestination("Delhi"));
		System.out.println("================");
		System.out.println("conformaed your destination to : "+antov.confirmDestinataion());
		System.out.println("=================");
		antov.passangers("satya","hussain");
		
		
	}

}
