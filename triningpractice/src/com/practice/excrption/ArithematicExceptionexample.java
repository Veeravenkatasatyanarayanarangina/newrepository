package com.practice.excrption;

public class ArithematicExceptionexample 
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 0;
		try {
			int c =a/b;
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("this is arithematic exception......");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
