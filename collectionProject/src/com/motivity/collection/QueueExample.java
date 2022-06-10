package com.motivity.collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample 
{
	// Java program to demonstrate a Queue


		public static void main(String[] args)
		{
			Queue<Integer> q
				= new LinkedList<>();
			q.add(12);
			q.add(15);
			q.add(14);
			q.add(29);
			q.add(11);
			q.add(12);
			q.add(17);
			q.add(12);
			q.add(22);
			System.out.println(q);
			q.offer(12);
			System.out.println("here we use to methods to add element in queue 1 is add() ,offer()");
			System.out.println(q.offer(12));
			System.out.println(q.offer(222));
			System.out.println(q);
			System.out.println("element method will give first element in the queue...");
			int k = q.element();
			System.out.println(k);
			k=q.element();
			System.out.println(k);

			System.out.println(q);
			int s=q.remove();
			System.out.println("removed element is "+s);
			System.out.println(q);
			System.out.println("element and poll methods are given the first element of an queue");
			System.out.println(q.poll());
			System.out.println("peek method will give last element of an queue ");
			System.out.println(q.peek());
			
			
			

			
					}
	


}
