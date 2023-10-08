import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		int num,fact=1;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Any Number : ");
		num = sc.nextInt();
		
		for(int n=num;n>=1;n--)
		{
			fact = fact * n;
		}
		System.out.println("Factorial of " + num + " is : " + fact);
	}
}