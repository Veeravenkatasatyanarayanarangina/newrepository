package org.abcairlines;

abstract class Airline
{
	abstract void travel();
	abstract void specification();
	
}

class Abc extends Airline
{

	@Override
	void travel() {
		System.out.println("Abc travels to india to porchugal");
	}

	@Override
	void specification() {
		System.out.println("Abc provide businessclass and normal both....");
		
	}
	
}
class Xyz extends Airline
{

	@Override
	void travel() 
	{
		System.out.println("xyz flight travels us to canada ");
		// TODO Auto-generated method stub
		
	}

	@Override
	void specification() {
		System.out.println("Xyx provides only business class  ");
		// TODO Auto-generated method stub
		
	}
	
}
public class FactoryMethodEx 
{
	public static void main(String[] args) 
	{
		Airline airline = getobject("ABc");
		airline.specification();
		airline.travel();
		airline = getobject("Xyz");
		airline.specification();
		airline.travel();
		airline = getobject("asdf");
		try {
			airline.specification();
			
		} 
		catch (NullPointerException e) 
		{
			System.err.println("enter a valid flight name .....");
			
		}
		
		
	}
	
	static Airline getobject(String fname)
	{
		if(fname.equalsIgnoreCase("abc"))
		{
			return new Abc();
		}
		else if(fname.equalsIgnoreCase("xyz"))
		{
			return new Xyz();
		}
		else
		{
			return null;
		}
	}

}


	
