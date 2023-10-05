import java.util.Scanner;

public class Employee
{
	private static int count=0;
	private int empid;
	private String empname;
	private char gender;
	private double basicsal,hra,da,ta=800.0,sales,commi,netsal;

	private Employee()
	{
		this.empid = ++count;
		this.empname = null;
		this.gender = ' ';
		this.basicsal = 0.0;
		this.hra = 0.0;
		this.da = 0.0;
		this.sales = 0.0;
		this.commi = 0.0;
		this.netsal = 0.0;	
	}

	Employee(String ename,char gen,double bsal,double esale)
	{
		this.empid = ++count;
		this.empname = ename;
		this.gender = gen;
		this.basicsal = bsal;
		this.sales = esale;
		this.calc_perk();
	}

	public void calc_perk()
	{
		if(this.basicsal>=5000 && this.basicsal<=10000)
		{
			this.hra = this.basicsal * 0.10;
		}
		else if(this.basicsal>10000 && this.basicsal<=20000)
		{
			this.hra = this.basicsal * 0.15;
		}
		else if(this.basicsal>20000 && this.basicsal<=50000)
		{
			this.hra = this.basicsal * 0.20;
		}	
		else
		{
			this.hra = this.basicsal * 0.40;
		}

		this.da = this.basicsal * 0.40;

		if(this.sales>=5000 && this.sales<=10000)
		{
			if(this.gender=='M' || this.gender=='m')
			{
				this.commi = this.sales * 0.05;
			}
			else
			{
				this.commi = this.sales * 0.07;
			}
		}
		else if(this.sales>10000 && this.sales<=20000)
		{
			if(this.gender=='M' || this.gender=='m')
			{
				this.commi = this.sales * 0.10;
			}
			else
			{
				this.commi = this.sales * 0.12;
			}
		}
		else if(this.sales>20000 && this.sales<=50000)
		{
			if(this.gender=='M' || this.gender=='m')
			{
				this.commi = this.sales * 0.20;
			}
			else
			{
				this.commi = this.sales * 0.22;
			}
		}	
		else
		{
			if(this.gender=='M' || this.gender=='m')
			{
				this.commi = this.basicsal * 0.50;
			}
			else
			{
				this.commi = this.basicsal * 0.52;
			}
		}

		this.netsal = this.basicsal + this.hra + this.da + this.ta + this.commi;
	}
	
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		this.empname = sc.next();
		System.out.print("Enter Gender : ");
		this.gender = sc.next().charAt(0);
		System.out.print("Enter Basic Salary : ");
		this.basicsal = sc.nextDouble();
		System.out.print("Enter Sales : ");
		this.sales = sc.nextDouble();
		this.calc_perk();
	}

	public void show()
	{
		System.out.println("===========================");
		System.out.println("Emp ID : " + this.empid);
		System.out.println("Emp Name : " + this.empname);
		System.out.println("Emp Gender : " + this.gender);
		System.out.println("Basic Salary : " + this.basicsal);
		System.out.println("HRA : " + this.hra);
		System.out.println("DA : " + this.da);
		System.out.println("TA : " + this.ta);
		System.out.println("Sales : " + this.sales);
		System.out.println("Commision : " + this.commi);
		System.out.println("Net Salary : " + this.netsal);
	}

	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		emp1.add();
		emp1.show();

		Employee emp2 = new Employee("Avni",'F',40000.0,67000.0);
		emp2.show();
	}
}

// public class Nmc
// {
// 	public static void main(String args[])
// 	{
// 		Employee emp1 = new Employee();
// 		emp1.show();

// 		Employee emp2 = new Employee("Avnish",40000.0,67000.0);
// 		emp2.show();
// 	}
// }