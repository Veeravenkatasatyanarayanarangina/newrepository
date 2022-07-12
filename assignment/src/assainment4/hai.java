package assainment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hai {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> li1 =new ArrayList<Integer>();
		for(int i = 0;i<10;i++);
		{
			li1.add(sc.nextInt());
			System.out.println(li1);
			
		}
		System.out.println(li1);
		List<Integer> li2 = new ArrayList<Integer>();
		for(int i=0;i<3;i++)
		{
			li2.add(sc.nextInt());
		
		}
		if(li1.contains(li2))
		{
			li1.remove(li2);
		}
		System.out.println(li1);
		
	}
}
