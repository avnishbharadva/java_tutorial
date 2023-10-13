import java.util.Scanner;

class Diamond_binary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Number : ");
		int n = sc.nextInt();

		int p = 1;
		int q = n/2+1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<q;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=p;j++)
			{
				System.out.print(j%2 + " ");
			}
			if(i<n/2+1)
			{
				p+=2;
				q--;
			}
			else
			{
				p-=2;
				q++;
			}
			System.out.println();l.
		} 
	}	
}