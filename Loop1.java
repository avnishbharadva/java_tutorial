import java.util.Scanner;

class Loop1
{
	public static void main(String args[])
	{
		int age,i=0;
		String name;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Age : ");
		age = sc.nextInt();
		System.out.print("Enter Name : ");
		name = sc.next();

		//for(int i=0;i<age;i++)
		//System.out.println(name);
		
		while(i<age)
		{
			System.out.println(name);
			i++;
		}
	}
}