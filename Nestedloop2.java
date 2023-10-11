class Nestedloop2
{
	public static void main(String args[])
	{
		/*for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("* ");

			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
				System.out.print("* ");

			System.out.println();
		}*/
		int i=1;
		while(i<=6)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
		int z=1;
		while(z<=5)
		{
			int j=5;
			while(j>=z)
			{
				System.out.print("* ");
				j--;
			}
			System.out.println();
			z++;
		}
	}
}