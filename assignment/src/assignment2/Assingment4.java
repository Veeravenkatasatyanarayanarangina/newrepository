package assignment2;

public class Assingment4 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		nearestPallindrom("129");
		
	}
	public static  int nearestPallindrom(String value)
	{
		int  n = Integer.parseInt(value);
		int pn = n;
		int nn = n;
		int rev = 0;
		int pcount=0;
		
		boolean pside = true;
		boolean nside = true;
		int temp1,temp2 = 0;
		
		while(pside)
		{
			temp1 = pn;
			rev =0;
			while (temp1 != 0)
			{
				rev = rev+temp1%10;
				temp1 =temp1/10;
			}
			if (rev==pn)
			{
				pside=false;	
			}
			else
			{
				pcount++;
				pn++;
				
			}
		}
		
		return pn;
	}

}
