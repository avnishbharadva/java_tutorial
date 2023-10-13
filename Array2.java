import java.util.Scanner;

class Array2
{
	public static void main(String args[])
	{
		int arr[] = new int[4];
		int min,max;
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter No for " + (i+1) + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("-------------------------------------");
		min = arr[0];
		max = arr[0];
		for(int data : arr)
		{
			System.out.println(data);
			if(data>max)
				max = data;
			if(data<min)
				min = data;
		}
		System.out.println("-------------------------------------");
		System.out.println("Maximum Value : " + max);
		System.out.println("Minimum Value : " + min);
		for(int data : arr)
		{
			if(data%2!=0)
				System.out.println("Odd Value : " + data);
			if(data%2==0)
				System.out.println("Even Value : " + data);
		}
	}
}