class Maxmin3t
{
	public static void main(String args[])
	{
		int a,b,c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);

		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println("Max Number : " + max);
		
		int min = a < b ? (a < c ? a : c) : (b < c ? b : c);

		System.out.println("Min Number : " + min);
	}
}