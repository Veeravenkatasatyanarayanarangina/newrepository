package railwaydetails;

import java.util.Random;

public class UserChoose
{
	public static void main(String[] args) 
	{
		int n=7;
		while(n>0)
		{
		getObject().notice();
		n--;
		}
		
	}
	
	static Compartment getObject()
	{
		Object[] object = {new Firstclass(),new LadiesCompartment(),new GeneralCompartment(),new Luggage()};
		Random random = new Random();
		return (Compartment) object[random.nextInt(3)];
		
	}

}
