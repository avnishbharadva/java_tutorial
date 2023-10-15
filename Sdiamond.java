class Sdiamond
{
	public static void main(String args[])
	{	
		int q=0,row=13;
		int n=row/2+1;
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=q;j++)
			{
				System.out.print("  ");
			}
			for(int j=n;j>=i;j--)
			{	
				System.out.print("* ");
			}
			if(i>=(row/2+1))
			{
				n+=2;
				q-=2;
			}
			else
			{
				q+=2;
			}
			System.out.println();
		}
	}
}