package com.motivity.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample 
{
	public static void main(String[] args)
	{
		TreeSet<Character> letters = new TreeSet<Character>();
		letters.add('a');
		letters.add('b');
		letters.add('r');
		letters.add('s');
		letters.add('k');
		letters.add('a');
		letters.add('l');
		letters.add('g');
		letters.add('c');
		letters.add('q');
		letters.add('w');
		letters.add('7');
		letters.add('0');
		System.out.println("treeset is set the elements by default ascending order ...");
		System.out.println(letters);
		System.out.println("=================================");
		System.out.println("descendingIterator() method is used to make the set descending order");
		Iterator desc =letters.descendingIterator();
		while(desc.hasNext())
		{
		System.out.print(" "+desc.next());
		}
		System.out.println();
		System.out.println("================================");
		System.out.println("first method will give first element of an set ");
		System.out.println("the first element of the set is : "+letters.first());
		System.out.println(letters.comparator());
		
		
	}

}
