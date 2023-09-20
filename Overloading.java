// method overloading - compile time polymorphism (early binding)

import java.util.Scanner;

public class Overloading{

	public int n1,n2;
	
	static{
		System.out.println("Static Block Called...");
		//System.out.println(n1+" "+n2);
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Overloading o1 = new Overloading(); 
		
		//System.out.println("In main method : " + o1.n1+" "+o1.n2);
		System.out.print("Enter No 1 : ");
		o1.n1 = sc.nextInt();
		System.out.print("Enter No 2 : ");
		o1.n2 = sc.nextInt();
		
		int sum1,sum2,sum5;
		float sum3,sum4;

		sum1 = o1.add(o1.n1,o1.n2);
		sum2 = o1.add(34,56,11);
		sum3 = o1.add(19.5f,67,11.11);
		sum4 = o1.add(67,19.7f,11.11);
		sum5 = o1.add(90,22);

		System.out.println("Sum 1 : " + sum1);
		System.out.println("Sum 2 : " + sum2);
		System.out.println("Sum 3 : " + sum3);
		System.out.println("Sum 4 : " + sum4);
		System.out.println("Sum 5 : " + sum5);
	}

	public int add(int a,int b){
		return a+b;
	}
	
	// it will throw compile time error bcz java does not support method overloading by just changing the return type of method
	/*public float add(int a,int b){
		return (float)(a+b); 
	}*/
	
	public int add(int a,int b, int c){
		return a+b+c;
	}

	public float add(float a,int b,double c){
		return (float)(a+b+c);  // int to float - automatic (implicit). here, bcz of double c we write (float) - forcefully (explicit)
	}

	public float add(int b,float a,double c){
		return (float)(a+b+c);
	}
}

/*
Can we overload java main() method?
Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only.
*/