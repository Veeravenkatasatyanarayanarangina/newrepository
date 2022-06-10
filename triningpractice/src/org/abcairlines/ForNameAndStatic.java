package org.abcairlines;

class Indigo
{
	static {
		System.out.println("this is a indigo airlines sub of abc");
	}
}
public class ForNameAndStatic 
{
	static {
		System.out.println("welcome to abc airlines");
	}
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("org.abcairlines.Indigo");
		
	}

}
