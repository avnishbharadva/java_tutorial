import java.util.Scanner;

class Loop2
{
	public static void main(String args[])
	{
		int start,end;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Starting Value : ");
		start = sc.nextInt();
		System.out.print("Enter Ending Value : ");
		end = sc.nextInt();

		//for(;start<=end;)
		//{
			//System.out.println(start);
			//start++;
		//}
		while(start<=end)
		{
			System.out.println(start);
			start++;	
		}
	}
}