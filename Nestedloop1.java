class Nestedloop1
{
	public static void main(String args[])
	{
		/*for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1");
			}
			System.out.println();
		}*/
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("1");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}