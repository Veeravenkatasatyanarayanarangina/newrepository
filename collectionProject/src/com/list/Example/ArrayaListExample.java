package com.list.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class ArrayaListExample 
{
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		Random random = new Random();
		for (int i = 1;i<11;i++)
		{
			al.add(random.nextInt(100));
		}
		System.out.println(al);
		Iterator<Integer> i = al.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		System.out.println("getclass is used to show fully qualified  class name ;");
		System.out.println(al.getClass());
		System.out.println(al);
		System.out.println("set method is remove perticular index element and plaxe");
		al.set(5, 10);
		System.out.println(al);
		
		
	}

}
