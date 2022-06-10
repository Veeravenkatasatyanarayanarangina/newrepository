package com.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashmapExample 
{
	public static void main(String[] args) throws InterruptedException
	{
		LinkedHashMap<Integer, Float> lhm = new LinkedHashMap<Integer, Float>();
		lhm.put(1, 1.5f);
		lhm.put(2, 2.5f);
		lhm.put(3, 3.5f);
		lhm.put(5, 5.5f);
		lhm.put(4, 4.4f);
		System.out.println(lhm);
		System.out.println("entryset method is used to make a copy of map and it transeform to set");
		System.out.println(lhm.entrySet());
		System.out.println("replace with three arguments which is perform a task called replace the"
				+ "value of an old value and new value and return type is boolean ");
		
		System.out.println(lhm.replace(1, 5.4f, 5.6f));
		System.out.println("teString method is used to convert the map into String ");
		System.out.println(lhm.toString());
		System.out.println("get method is used to get the value of an element by using key value....");
		System.out.println(lhm.get(3));
		System.out.println(lhm);
		
		
		
		
		
		
	}

}
