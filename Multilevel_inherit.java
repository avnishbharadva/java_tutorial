class Parent_class1
{
	protected String str;

	Parent_class1()
	{
		str = "J";
	}
	void display()
	{
		System.out.println("Parentclass 1 str : " + str);
	}
}

class Subclass1 extends Parent_class1
{
	Subclass1()
	{
		str = str.concat("A");
	}
	void display()
	{
		super.display();
		System.out.println("Subclass 1 str : " + str);
	}
}

class Subclass2 extends Subclass1
{
	Subclass2()
	{
		str = str.concat("V");
	}
	void display()
	{
		super.display();
		//str = str.concat("V");
		System.out.println("Subclass 2 str : " + str);
	}
}

class Subclass3 extends Subclass2
{
	Subclass3()
	{
		str = str.concat("A");
	}
	void display()
	{
		System.out.println("Subclass 3 str : " + str);
		super.display();
	}
}

class Multilevel_inherit
{
	public static void main(String args[])
	{
		Subclass3 obj = new Subclass3();
		obj.display();
	}
}
