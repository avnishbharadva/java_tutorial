import java.util.Scanner;

class Loop4
{
	public static void main(String args[])
	{
		int count=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Starting Value : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Value : ");
		int end = sc.nextInt();

		//for(;start<=end;start++)
		//{
			//if(start % 2 != 0)
			//count++;
		//}

		/*while(start<=end)
		{
			if(start%2!=0)
				count++;
			start++;
		}*/
		do
		{
			if(start%2==1)
				count++;
			start++;
		}while(start<=end);
		System.out.println("Total Odd Numbers in Given Range : " + count);
	}
}