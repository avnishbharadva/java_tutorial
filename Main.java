final class Final1
{
	final String name="Avnish";
	final void greet()
	{
		//this.name = "Radha";
		System.out.println("Good Morning");
	}
}

class Main extends Final1
{
	void display()
	{
		System.out.println("Good NIght");
		super.greet();
	}
	public static void main(String args[])
	{	
		Final1 f = new Final1();
		f.greet();
		Main m = new Main();
		m.display();
	}
}