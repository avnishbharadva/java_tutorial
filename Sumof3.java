import java.util.Scanner;

class Sumof3{
	public static void main(String args[]){
		int n,rem,newn,ans=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any 3 Digit Number : ");
		n = sc.nextInt();

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
		for(int i=1;i<=3;i++){
			rem = n%10;
			ans = ans + rem;
			n = n/10;
		}
		System.out.println("Sum : " + ans);
	}
}