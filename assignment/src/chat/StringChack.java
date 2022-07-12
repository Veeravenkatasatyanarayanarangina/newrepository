package chat;

import java.util.Scanner;

public class StringChack 
{
	public static void main(String[] args) 
	{
		System.out.println("enter string :");
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		System.out.println(checkCaps(k));
	
	}
	public static boolean checkCaps(String k)
	{
		boolean t = true;
		for(int i = 0;i<k.length();i++)
		{
			if(k.charAt(i)>='A' && k.charAt(i)<='Z')
			{
				t = true;
			}
			else
			{
				t = false;
				break;
			}
			
		}
		return t;
		
	}

}
