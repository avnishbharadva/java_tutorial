import java.util.Scanner;

class Bubblesort3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int size = args.length;
		int arr[] = new int[size];

		for(int i=0;i<arr.length;i++)
		{
			//System.out.print("Enter Value " + (i+1) + " : ");
			arr[i] = Integer.parseInt(args[i]);
		}
		
		System.out.println("-----------------------------");
		System.out.println("Old Array");
		for(int data : arr)
			System.out.println(data);
		System.out.println("-----------------------------");
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>=i;j--)
			{
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("New Array");
		for(int data : arr)
			System.out.println(data);
	}
}