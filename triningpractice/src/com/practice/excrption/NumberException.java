package com.practice.excrption;

public class NumberException 
{
	public static void main(String[] args)
	{
		String a= "123";
		String b = "123e";
		
		try {
			int k = Integer.parseInt(a);
			System.out.println("number is "+k);
			System.out.println(Integer.parseInt(b));// number  format exception 
			
		} catch (NumberFormatException e) 
		{
			System.out.println("exception accure becouse in String we hava numerics and alphabets");
		}
		
		
		
		
	}

}
