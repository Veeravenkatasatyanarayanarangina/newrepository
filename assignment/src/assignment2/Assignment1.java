package assignment2;

import java.util.Scanner;

public class Assignment1
{

	public static void main(String[] args) 
	{
	     System.out.println(Assignment1.qutient(-3,7));
		
		
	}
static int qutient(int divisor,int divident)
	{
		if (divisor==0)
		{
			return 0;
		}
		boolean negresult=false;
		if(divisor<0|| divident<0)
		{
			//here if it is negative value it will not appear the while loop condition thats why 
			// i change into positive value;
			negresult=true;
			divisor = -(divisor);
			
		}
		int quetient = 0;
		while(divident>= divisor)
		{
			//here 14-7 and 7-7 = 0 loop recursing 2 times so it will 2 times
			divident-=divisor;
			quetient++;
		}
		if(negresult)
		{
			quetient = -(quetient);
			
		}
		return quetient;
		
		
	
		
	}

}
