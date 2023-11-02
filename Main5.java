interface shape
{
	public String myname = "shape";
	public void Draw();
}
abstract class circle implements shape
{
	public void Draw()
	{
		System.out.println("Drawing Circle Here : " + myname);
	}
	abstract public void fillingAlgorithm();
}
class SolidCircle extends circle
{
	public void fillingAlgorithm()
	{
		System.out.println("Filling Algorithm Method");
	}
	public void Draw()
	{
		System.out.println("Drawing Circle Here from sc : " + myname);
	}
}

public class Main5
{
	public static void main(String arg[])
	{
		shape sc = new SolidCircle();
		sc.Draw();
	}
}