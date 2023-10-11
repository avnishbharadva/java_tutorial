import java.util.Scanner;

class Loop3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter Starting Value : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Value : ");
		int end = sc.nextInt();

		//for(;start<=end;start++)
		//{
			//if(start%2==1)
			//System.out.println(start);
		//}
		while(start<=end)
		{
			if(start%2!=0)
				System.out.println(start);
			start++;
		}
	}
}