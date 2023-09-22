import java.util.Scanner;

class Operator1{
	public static void main(String args[]){
		int n1;
		
		Scanner sc = new Scanner(System.in);
		
		try{
		System.out.print("Enter Any Num : ");
		n1 = sc.nextInt();
		
		if(n1==0){
			System.out.println(n1 + " is Zero");
		}
		if(n1 > 0 && n1%2!=0){
			System.out.println(n1 + " is Positive Odd Number");
		}
		if(n1 > 0 && n1%2==0){
			System.out.println(n1 + " is Positive Even Number");
		}
		if(n1 < 0 && n1%2!=0){
			System.out.println(n1 + " is Negative Odd Number");
		}
		if(n1 < 0 && n1%2==0){
			System.out.println(n1 + " is Negative Even Number");	
		}
		}
		catch(Exception e){
			System.out.println("Enter Valid Number");
		}
	}	
}