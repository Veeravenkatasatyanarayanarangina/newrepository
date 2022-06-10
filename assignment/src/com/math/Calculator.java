package com.math;

import java.util.Scanner;

public class Calculator 
{
	static int powerInt(int a,int b)
	{
		return (int) Math.pow(a, b);
	}
	static double powerDouble(double a, double b)
	{
		return Math.pow(a, b);
	}
	public static void main(String[] args) 
	{
		
		System.out.println("the int datatype  values of 4^6 is  "+Calculator.powerInt(4, 6));
		System.out.println("the double datatype value of 3.4^4.6 is "+Calculator.powerDouble(3.4, 4.6));
		
		
	}
}
