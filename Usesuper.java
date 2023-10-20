class A
{
	int i;
	
	void show()
	{
		System.out.println("A i = " + this.i);
	}
}

class B extends A
{
	int i;
	B(int a,int b)
	{
		super.i = a;
		this.i = b;
	}
	
	void show()
	{
		super.show();
		System.out.println("B i = " + this.i);
	}
}

class Usesuper
{
	public static void main(String args[])
	{
		B b = new B(10,100);
		b.show();
	}
}