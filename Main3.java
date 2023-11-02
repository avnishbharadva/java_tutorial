public class Main3
{
	public static void main(String arg[])
	{
		shapeA cs = new circle();
		
		cs.Draw();

		shapeB cs2 = new circle();
		cs2.Draw2();
	}
}

interface shapeA
{
	public String baseclass = "shape";
	public void Draw();
}
interface shapeB extends shapeA
{
	public String baseclass = "shape2";
	public void Draw2();
}
class circle implements shapeB
{
	public String baseclass = "circle";
	public void Draw()
	{
		System.out.println("Drawing Circle Here : " + baseclass);
	}
	public void Draw2()
	{
		System.out.println("Drawing 2 Circle Here : " + baseclass);
	}
}