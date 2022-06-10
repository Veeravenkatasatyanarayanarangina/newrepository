package com.collection.map;

import java.util.HashMap;

public class HashmapExample 
{
	public static void main(String[] args) 
	{
		System.out.println("hashmap is an class which is extends the abstract class"
				+ " named Map");
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 1);
		hm.put('c', 3);
		hm.put('e', 5);
		hm.put('b', 2);
		System.out.println("==================================");
		System.out.println("it will print ascending order  by using key element");
		hm.put('f',6);
		hm.put('g',7);
		System.out.println(hm);
		System.out.println("==================================");
		System.out.println("hm.keySet() method will be returns key values of an"
				+ " MAP ");
		System.out.println(hm.keySet());
		System.out.println("==================================");
		System.out.println("hm.containsKey(k) it is check given key is present in the map or not");		
		System.out.println(hm.containsKey('e'));
		System.out.println("==================================");
		System.out.println("hm.containsvalue(v) is used to check the value is presnt in map or not");
		System.out.println(hm.containsValue(6));
		System.out.println("====================================");
		System.out.println("replace() method is used to rplace an value by using key ;;");
		System.out.println("before replace ;"+hm);
		int k = hm.replace('c',4);
		System.out.println("after replace : "+hm);
		System.out.println("====================================");
		System.out.println("size method is used to check the size of method....");
		System.out.println(hm.size());
			
	}

}
