package com.practice.excrption;

import java.util.Scanner;

public class InputMismatchException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			System.out.println(n);
			
			
		} catch (java.util.InputMismatchException e) 
		{
			System.out.println("input mis match plz give the proper input......");
			
			
		}
	}

}
