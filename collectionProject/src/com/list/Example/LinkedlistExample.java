package com.list.Example;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedlistExample 
{
	public static void main(String[] args)
	{
		List<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(3);
		li.add(4);
		Random random = new Random();
		
		for(int i=0;i<10;i++)
		{
			li.add(random.nextInt(100));
		}
		System.out.println(li);
		
		List<Integer> li1 = new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		{
			li1.add(random.nextInt(100));
		}
		System.out.println(li1);
		System.out.println("addall method to concate the values to one lis and another list");
		li.addAll(li1);
		System.out.println(li);
		System.out.println("here li object contains li1 elemnets");
		System.out.println(li.containsAll(li1));
		System.out.println("here li object not contains li elements.....");
		System.out.println(li1.containsAll(li));
		System.out.println("here li1 is not empty");
		System.out.println(li1.isEmpty());
		li1.clear();
		System.out.println("here li1 is empty ");
		System.out.println(li1.isEmpty());
		System.out.println("Size of li is "+li.size()+"\n size of li1 is "+li1.size());
		
		
		
		
		
	}

}
