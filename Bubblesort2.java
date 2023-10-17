import java.util.Scanner;

class Bubblesort2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
		float arr[] = new float[size];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter Value " + (i+1) + " : ");
			arr[i] = sc.nextFloat();
		}
		
		System.out.println("-----------------------------");
		System.out.println("Old Array");
		for(float data : arr)
			System.out.println(data);
		System.out.println("-----------------------------");
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>=i;j--)
			{
				if(arr[j-1]>arr[j])
				{
					float temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("New Array");
		for(float data : arr)
			System.out.println(data);
	}
}