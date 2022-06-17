package stringbufferex;

public class StringBufferExample 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("hellodflksjgifsdjgijufoiguerigtjuidfgih;usgjji ");
		System.out.println("append method will use to concate two strings...");
		System.out.println(sb);
		sb.append("satya... ");
		System.out.println(sb);
		System.out.println("================================================");
		System.out.println("The insert() method inserts the given String with this string at the given position.");
		sb.insert(0, "this is insert by using index value....");
		System.out.println(sb);
		
		
		
	}

}
