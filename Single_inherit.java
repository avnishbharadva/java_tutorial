class Single_inherit
{
	protected String str;
	
	Single_inherit()
	{
		str = "Avnish";
	}
	void display()
	{
		System.out.println("Parentclass Str : " + str);
	}
}

class Subclass extends Single_inherit
{
	Subclass()
	{
		str = str.concat(" Bharadva");   // concat method returns new string 
	}
	void display()
	{
		System.out.println("Subclass Str : " + str);
		super.display();
	}
}

class Mainclass
{
	public static void main(String args[])
	{
		Single_inherit si = new Single_inherit();
		si.display();
		Subclass obj = new Subclass();
		obj.display();
		si.display();
	}
}