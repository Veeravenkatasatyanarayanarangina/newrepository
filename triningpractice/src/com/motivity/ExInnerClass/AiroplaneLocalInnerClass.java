package com.motivity.ExInnerClass;
class Airport1
{
	void permission()
	{
		System.out.println("permisson granted......");
		class KingFisher
		{
			void landing()
			{
				System.out.println("plane is landing......");
				
				class Passengers
				{
					void arrive()
					{
						System.out.println("passengers are arrived...");
					}
				}
				Passengers rahul = new Passengers();
				rahul.arrive();
				
			}
		}
		KingFisher anthov = new KingFisher();
		anthov.landing();
	}
}
public class AiroplaneLocalInnerClass 
{
	public static void main(String[] args) 
	{
		Airport1 rgia = new Airport1();
		rgia.permission();
		
	}

}
