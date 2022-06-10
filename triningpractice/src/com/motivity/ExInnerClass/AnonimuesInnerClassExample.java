package com.motivity.ExInnerClass;

abstract class Airlines
{
	abstract void runway();
}
public class AnonimuesInnerClassExample
{
	public static void main(String[] args) 
	{
		Airlines airlines = new Airlines()
		{
			void runway() {
				System.out.println("airport runway distance is 5000mtrs ");
				
			}
		};
		airlines.runway();
		
	}

}
