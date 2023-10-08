import java.util.Scanner;

class Palindromenumber
{
	public static void main(String args[])
	{
		int num,ld=0,ans=0,temp;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Any Number : ");
		num = sc.nextInt();
		
		temp = num;
		while(temp>0)
		{
			ld = temp % 10;
			ans = ans * 10 + ld;
			temp = temp / 10;
		}
		//System.out.println(temp + " " + ans);
		if(num==ans)
			System.out.println(num + " is Palindrome Number");
		else
			System.out.println(num + " is not a Palindrome Number");
	}
}