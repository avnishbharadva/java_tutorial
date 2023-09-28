import java.util.Scanner;

class Automorphic{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Any Number : ");
		n = sc.nextInt();

		Boolean ans = n == (n*n%Math.pow(10,Integer.toString(n).length()));

		System.out.println(n + " is Automorphic : " + ans);
	}
}