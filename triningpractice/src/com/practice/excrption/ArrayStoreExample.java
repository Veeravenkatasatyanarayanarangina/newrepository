package com.practice.excrption;

public class ArrayStoreExample 
{
	public static void main(String[] args) 
	{
		Object arr[] = new String[3];
		
		arr[0]="satya";
		
		try {
			arr[1]=122;
			
		} catch (ArrayStoreException e) 
		{
			System.out.println("int is doesn't convert to String ");
		}
		
		
		
		
	}

}
