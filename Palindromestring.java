import java.util.Scanner;

class Palindromestring
{
	public static void main(String args[])
	{
		String str,nstr="";
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Any String : ");
		str = sc.nextLine();
		
		int len = str.length();
		
		for(int c=len-1;c>=0;c--)
		{
			nstr += str.charAt(c);
		}
		
		if(str.equals(nstr))
			System.out.println(str + " is palindrome");
		else
			System.out.println(str + " is not palindrome");
	}
}