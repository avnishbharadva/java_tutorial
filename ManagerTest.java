import java.time.LocalDate;

class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;

	Employee(String name,double salary,int year,int month,int day)
	{
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year,month,day);
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}
	LocalDate gethireDay()
	{
		return this.hireDay;
	}
	void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}

class Manager extends Employee
{
	private double bonus;
	
	Manager(String name,double salary,int year,int month,int day)
	{
		super(name,salary,year,month,day);
		bonus = 0;
	}
	double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	void setBonus(double b)
	{
		bonus = b;
	}
}

class ManagerTest
{
	public static void main(String args[])
	{
		Manager boss = new Manager("Avnish",80000,2002,8,1);
		boss.setBonus(5000);

		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("hiren",50000,1989,10,1);
		staff[2] = new Employee("tushar",40000,1990,3,15);
		
		for(Employee e : staff)
			System.out.println("Name : " + e.getName() + " , Salary : " + e.getSalary() + " , Hire day : " + e.gethireDay());
	}
}
