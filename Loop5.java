import java.util.Scanner;

class Loop5
{
	public static void main(String args[])
	{
		int mul=1,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Starting Value : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Value : ");
		int end = sc.nextInt();

		for(;start<=end;start++)
		{
			if(start%2!=0)
				mul *= start;
			if(start%2==0)
				sum += start;
		}
		System.out.println("Multiplication of Odd Number : " + mul);
		System.out.println("Addition of Even Number : " + sum);
	}
}