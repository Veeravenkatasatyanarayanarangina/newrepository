package com.motivity.ExInnerClass;
class Airport3
{
	int runways = 4;
	static class IndianAirlines2
	{
		void permisson()
		{
			System.out.println("authgority not given permisson....");
		}
		static void takeoff()
		{
			System.out.println("waiting for take off.....");
			
		}
		
	}
	
}
public class StaticInnerClass
{
	public static void main(String[] args) 
	{
		Airport3.IndianAirlines2 boing =new  Airport3.IndianAirlines2();
		boing.permisson();
		Airport3.IndianAirlines2.takeoff();
		
		
	}

}
