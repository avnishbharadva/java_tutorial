abstract class Shape
{
	Shape()
	{
		System.out.println("Shape Constructor Called...");
	}
	int n;
	abstract void area();
}

class Circle extends Shape
{
	Circle()
	{
		System.out.println("Circle Constructor Called...");
	}
	void area()
	{
		System.out.println("Circle Area");
	}
	void display()
	{
		System.out.println("Default Method");
	}
}

class Abstract1
{
	public static void main(String args[])
	{
		//Shape s = new Shape();  error: Shape is abstract; cannot be instantiated
		Circle obj = new Circle();
		obj.area();
		obj.display();
	}
}