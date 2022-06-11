package com.automibile.twowheler;

public class Prct {
	public static void main(String[] args) 
	{
		int i=4,a=3,b=2,c=1,d;
		a=i++ + a%2 + b%3 + b/2 +c%10;
		System.out.println(a);
		System.out.println(i);
		c=c++ + a++ + c%2 + --c + --b;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		a=a+ c++ + a++ + --i + --i;
		System.out.println(a);
		System.out.println(i);
		System.out.println(c);
		i=i++ + i-- + a%2 + i*2 + --i;
		System.out.println(i);
		a=a+ b + c + i++ + a++;
		System.out.println(i);
		System.out.println(a);
		d=a+ c-- + a-- + i/3;
		System.out.println(c);
		System.out.println(a);
		System.out.println(d);
		a=a++ + c + i + d--;
		System.out.println(a);
		System.out.println(d);
		i=i + a + c + d++ + a++;
		System.out.println(i);
		System.out.println(a);
		System.out.println(d);
		
	}

}
