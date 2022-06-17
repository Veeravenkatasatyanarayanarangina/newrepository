package assignment2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assainment2 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> li =new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(34);
		li.add(35);
		li.add(20);
		li.add(36);
		li.add(11);
		li.add(15);
		li.add(18);
		li.add(10);
		li.add(99);
		li.add(33);
		System.out.println(li);
		//1 method
		int k=3;
		System.out.println(li.size()-k);
		
		while(k !=0)
		{
			li.addFirst(li.removeLast());
			k--;
		}
		System.out.println(li);
		
		
		
	
	}
	
}
