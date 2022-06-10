package com.practice.excrption;


public class NegiteveArraySizeExample 
{
	public static void main(String[] args) 
	{
		String s ="123s";
		try 
		{
			int arr[]=new int[-10];
			
		} catch (NegativeArraySizeException e) 
		{
			System.err.println("you are given negiteve size of an array");
		}
		
	}

}
