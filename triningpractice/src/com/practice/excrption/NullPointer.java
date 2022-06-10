package com.practice.excrption;

public class NullPointer 
{
	public static void main(String[] args) 
	{
		String name = null;
		
		try {
			//try to get length of name without initializing the variable
			
			System.out.println(name.length());
			
		} catch (NullPointerException e) {
			System.out.println("exception accours ");
			// TODO: handle exception
		}
		catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}
