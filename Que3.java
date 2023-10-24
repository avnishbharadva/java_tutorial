class Que3
{	
	static int i = 10;
	static
	{
		System.out.println("Static Block");
	}
}

class Check
{
	static
	{
		System.out.println("Static Block of Check class.");
	}

	public static void main(String args[])
	{
		System.out.println("Main Method...");

		System.out.println("I : " + Que3.i);
	}
}