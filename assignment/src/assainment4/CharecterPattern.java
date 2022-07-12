package assainment4;

public class CharecterPattern
{
    public static void main(String[] args)
    {

        int n = 4;

        for (int i=n;i>=1;i--)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
                System.out.print(" ");
            }
            char ch ='A';
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch++ + " ");
            }
            for (int z = i-1;z>=0;z--)
            {
                System.out.print(--ch + " ");
            }
            System.out.println(" ");
        }
    }
}
