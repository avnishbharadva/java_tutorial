import java.util.Scanner;

class SectoHour
{
	public static void main(String args[])
	{
		int sec,hour,min;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Second : ");
		sec = sc.nextInt();

		hour = sec/3600;
		sec = sec%3600;
		min = sec/60;
		sec = sec%60;
		
		System.out.println("-----------------------------");
		System.out.println("Hour : " + hour);
		System.out.println("Minute : " + min);
		System.out.println("Second : " + sec);
	}
}