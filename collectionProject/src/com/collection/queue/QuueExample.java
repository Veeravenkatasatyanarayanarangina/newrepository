package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QuueExample 
{
	public static void main(String[] args) 
	{
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		q.add(12);
		q.add(30);
		q.add(21);
		q.add(31);
		q.add(43);
		q.add(56);
		q.add(67);
		q.add(90);
		q.add(470);
		q.add(80);
		q.add(30);
		q.add(20);
		q.add(30);
		q.add(30);
		System.out.println(q);
		q.offer(999);
		System.out.println(q);
		System.out.println("befor clear method "+q);
		
	    System.out.println(	q.isEmpty());
	    System.out.println("poll method is used to get the first elematn of queue");
	 System.out.println(q.poll());
	 System.out.println("peek method is used get the second element of the queue");
	 System.out.println(q.peek());
	 
	 q.clear();
	 System.out.println("after clear method "+q);
	 System.out.println("isempty() ;"+q.isEmpty());
	 
	 
		
		
		
		
		
	}

}
