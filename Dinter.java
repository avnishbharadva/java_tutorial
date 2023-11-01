interface inter1
{
	default void show()
	{
		System.out.println("HEyyyy");
		pmethod();
	}
	void avnish();
	private void pmethod()
	{
		System.out.println("private method");
	}
	
}
abstract class Aclass implements inter1
{
	abstract void secondmethod();
	public void show()
	{
		System.out.println("override default method in abstract class");
	}
}
class Dinter extends Aclass
{
	public void show()
	{
		System.out.println("Override show method");
	}
	public void avnish()
	{
		System.out.println("avnish method");
	}
	public void secondmethod()
	{
		System.out.println("method of abstract class");
	}
	public static void main(String args[])
	{
		System.out.println("Main Method");
		inter1 i1 = new Dinter();
		i1.avnish();
		i1.show();
		//i1.pmethod();
	}
}