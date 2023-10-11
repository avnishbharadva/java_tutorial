import java.util.Scanner;

public class Diamond_pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Odd Number : ");
		int n = sc.nextInt();

        	for(int i=1;i<=(n/2+1);i++)
		{
            		for(int j=(n/2);j>=i;j--)
			{
                		System.out.print("  ");
            		}
            		for(int j=1;j<=i;j++)
			{
                		System.out.print("* ");
            		}
            		for(int j=1;j<=i-1;j++)
			{
                		System.out.print("* ");
            		}
            		System.out.println();
        	}
        	for(int i=1;i<=(n/2);i++)
		{
            		for(int j=1;j<=i;j++)
			{
                		System.out.print("  ");
            		}
            		for(int j=(n/2);j>=i;j--)
			{
                		System.out.print("* ");
            		}
            		for(int j=(n/2-1);j>=i;j--)
			{
                		System.out.print("* ");
            		}
            		System.out.println();
        	}
	}
}