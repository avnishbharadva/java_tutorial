class A1
{
	void disp()
	{
		System.out.println("Display A1");	
	}
}
class B1 extends A1
{
	void disp()
	{
		System.out.println("Display B1");
	}
}
class C1 extends A1
{
	void disp()
	{
		System.out.println("Display C1");
	}
}

class Rpoly1
{
	public static void main(String args[])
	{
		A1 a = new C1();
		a.disp();
		A1 c = new B1();
		c.disp();
		A1 a2 = new A1();
		a2.disp();
	}
}