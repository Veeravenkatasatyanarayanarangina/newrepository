package org.abcairlines;

abstract class Flights
{
	abstract void crewdetais(String crew1,String crew2,String crew3);
	abstract void crewdetais(String crew1,String crew2);
	abstract void crewdetails();
		
}
class Anthov extends Flights
{

	void crewdetais(String crew1, String crew2, String crew3)
	{
		System.out.println("anthov [crew1=" + crew1 + ", crew2=" + crew2 + ", crew3=" + crew3 + "]");
		
		
		
	}
	void crewdetais(String crew1, String crew2) {
		System.out.println("flights [crew1=" + crew1 + ", crew2=" + crew2 + "]");
		
	}
	void crewdetails() 
	{
		System.out.println("no crew available here.......");
		
		}
	
}

public class CheckingCargoFlights 
{
	public static void main(String[] args) 
	{
		Flights flights = new Anthov();
		flights.crewdetails();
		flights.crewdetais("raju", "ramana");
		flights.crewdetais("venu", "satya", "noor");
		
		
	}
	

}
