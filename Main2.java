public class Main2
{
	public static void main(String arg[])
	{
		shape cs = new circle();
		cs.draw();
	}
}

interface shape
{
	public String baseclass = "shape";

	public void draw();
}
class circle implements shape
{
	public void draw()
	{
		System.out.println("Drawing Circle Here");
	}
}