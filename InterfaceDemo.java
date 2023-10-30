interface interface1
{
	void show();
	void show(int no);
	//int show();
}
interface interface2
{
	void show(int no);
}
interface interface3
{
	int show(int n1,int n2);
}
class InterfaceDemo implements interface1,interface2,interface3
{
	public void show()
	{
		System.out.println("Show Method 1");
	}
	public void show(int n)
	{	
		System.out.println(n);
	}
	public int show(int a,int n2)
	{
		return a*n2;
	}
	public static void main(String args[])
	{
		interface1 if1 = new InterfaceDemo();
		if1.show();
		if1.show(9);
		//obj.show();
		//obj.show(8);
		//System.out.println(obj.show(2,3));
		System.out.println("hey");
	}
}