// abstract class may or may not include abstract method
//Abstract classes cannot be instantiated, but they can be subclassed

abstract class Abstract2         
{
	int a;

	abstract void display();
	/*{
		a = 10;
		System.out.println(a); 
	}*/

	/*public static void main(String args[])
	{
		System.out.println("Hello from abstract class");
		//Abstract2 obj = new Abstract2();
		//obj.display();
	}*/
}

class Demo5 extends Abstract2
{
	public void display()
	{
		System.out.println("Hello from override display method");
	}
	public static void main(String args[])
	{
		//System.out.println("A : " + a);
		//display();

		// it is possible to create instance of an abstract class
		Abstract2 obj = new Demo5();
		// it is not possible to create an object of an abstract class

		System.out.println("A : " + obj.a);
		obj.display();
		System.out.println("Hey from demo class");
	}
}
