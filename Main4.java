public class Main4
{
	public static void main(String arg[])	
	{
		shapeA cs = new circle();
		cs.Draw();
		shapeB cs2 = new circle();
		cs2.Draw2();
		shapeC cs3 = new circle();
		cs3.Draw3();
	}
}

interface shapeA
{
	public String baseclass = "shapeA";
	public void Draw();
}
interface shapeB extends shapeA
{
	public String baseclass = "shapeB";
	public void Draw2();
}
interface shapeC extends shapeB
{
	public String baseclass = "shapeC";
	public void Draw3();
}
class circle implements shapeA,shapeB,shapeC
{
	public void Draw()
	{
		//baseclass = "trying to change";
		System.out.println("Drawing Circle Here : " + shapeA.baseclass);
	}
	public void Draw2()
	{
		//baseclass = "trying to change";
		System.out.println("Drawing Circle Here : " + shapeB.baseclass);
	}
	public void Draw3()
	{
		//baseclass = "trying to change";
		System.out.println("Drawing Circle Here : " + shapeC.baseclass);
	}
}