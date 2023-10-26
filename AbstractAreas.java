// abstract class

abstract class Figure
{
	double dim1,dim2;
	Figure(double a,double b)
	{
		System.out.println("Figure Constuctor Called...");
		dim1 = a;
		dim2 = b;
	}
	abstract double area();
}
class Rectangle2 extends Figure
{
	Rectangle2(double a,double b)
	{
		super(a,b);
		System.out.println("Rectangle Constuctor Called...");
	}
	double area()
	{
		System.out.println("Area method of Rectangle");
		return dim1*dim2;
	}
}
class Triangle2 extends Figure
{
	Triangle2(double a,double b)
	{
		super(a,b);
		System.out.println("Triangle Constuctor Called...");
	}
	double area()
	{
		System.out.println("Area method of Triangle");
		return dim1*dim2/2;
	}
}
class AbstractAreas
{
	public static void main(String args[])
	{
		//Figure f = new Figure();
		Rectangle2 r = new Rectangle2(10.00,45.00);
		Figure f;
		f = r;
		System.out.println(r.area());
		Triangle2 t = new Triangle2(1.00,5.00);
		f = t;
		System.out.println(t.area());
	}
}