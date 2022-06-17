package assignment2;

import java.util.LinkedList;

public class Assign3
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> first = new LinkedList<Integer>();
		first.add(10);
		first.add(20);
		first.add(30);
		first.add(10);
		first.add(11);
		first.add(12);
		first.add(20);
		first.add(30);
		System.out.println("list contains duplicate values : "+first);
		
		LinkedList<Integer> second = new LinkedList<Integer>();
		
		for (Integer duplicate : first) 
		{
			if(!second.contains(duplicate))
			{
				second.add(duplicate);
			}
			
		}
		System.out.println("after removing duplicate elements : "+second);
		//another way is to change the linked list into any set
		//set will not take any duplicate values
		
		
		
	}

}
