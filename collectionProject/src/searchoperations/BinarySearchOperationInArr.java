package searchoperations;

public class BinarySearchOperationInArr 
{
	public static void main(String[] args)
	{
		int arr[] = {10,120,30,30,40,50};
		System.out.println(binarySearchop(arr, 40));
		
	}
    static int binarySearchop(int arr[],int x)
	{
		int r = arr.length-1;
		int l= 0;int m;
		while(l<= r)
		{
			m=l+(r-1)/2;
			if(arr[m]==x)
			{
				return m;
			}
			
			else if(arr[m]<x)
			{
				l=m+1;
			}
			else
			{
				r= m-1;
			}
		}
		return -1;
		
	}

}
