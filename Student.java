class person
{
	protected String firstname;
	protected String lastname;

	person(String fn,String ln)
	{
		this.firstname=fn;
		this.lastname=ln;
	}
	public void display()
	{
		System.out.println("first name=" + this.firstname);
		System.out.println("last name=" + this.lastname);
	}
}
class Student extends person
{
	private int rollno;
	private int age;
	private float percentage;

	Student(String fn,String ln,int rno,int ag,float percent)
	{
		super(fn,ln);
		//super.thisfirstname;
		//super.thislastname;
		this.rollno=rno;
		this.age=ag;
		this.percentage=percent;
	}

	public void display()
	{
		super.display();
		System.out.println("rollno=" +this.rollno);
		System.out.println("age=" + this.age);
		System.out.println("percent=" +this.percentage);
	}
	public static void main(String[] args)
	{
		person p1 = new person("Nirali","Joshi");
		p1.display();

		Student s1 = new Student("Nirali","Joshi",48,20,98.95f);
		s1.display();
	}
}