package assignment2;

public class Maimu 
{
	public static void main(String[] args) 
	{
		System.out.println(pallindrome("anilina"));
		
	}
	public static  int pallindrome(String input1)
	{
		String input2 ="";
		
		int length = input1.length();
		for(int i =length-1;i>=0;i--)
		{
			char c = input1.charAt(i);
			input2 = input2+c;
		}
		if(input1.equalsIgnoreCase(input2))
		{
			return 1;
			
		}
		else
		{
			return 0;
		}
		
	}

}
