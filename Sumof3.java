import java.util.Scanner;

class Sumof3{
	public static void main(String args[]){
		int n,rem,newn,ans=0,len=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Digit Number : ");
		n = sc.nextInt();

		// String str = Integer.toString(n);
		// len = str.length();
		int temp = n;
		while(temp!=0){
			temp /= 10;
			len += 1;
		}
		System.out.println("Length : " + len);
		// without using loop
		/*
		rem = n%10;
		ans = ans + rem;
		newn = n/10;
		
		rem = newn%10;
		ans = ans + rem;
		newn = newn/10;
		
		rem = newn%10;
		ans = ans + rem;
		newn = newn/10;
		*/
		
		// using for loop
		for(int i=1;i<=len;i++){
			rem = n%10;
			ans = ans + rem;
			n = n/10;
		}
		System.out.println("Sum : " + ans);
	}
}