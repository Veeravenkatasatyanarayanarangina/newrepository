package com.automobile.test;

import com.automibile.twowheler.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Hero h1 = new Hero();
		System.out.println("hero bike name : "+h1.getModelName());
		System.out.println("hero bike registration number : "+h1.getRegistrationNumber());
		System.out.println("hero bike owner name : "+h1.getOwnerName());
		System.out.println("hero bike current speed : "+h1.getspeed());
		h1.radio();
		System.out.println("==========================================");
		Honda h2 = new Honda();
		System.out.println("hero bike name : "+h2.getModelName());
		System.out.println("hero bike registration number : "+h2.getRegistrationNumber());
		System.out.println("hero bike owner name : "+h2.getOwnerName());
		System.out.println("hero bike current speed : "+h2.speed());
		h2.cdPlayer();
		
		
		
	}

}
