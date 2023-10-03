import java.util.Scanner;

class Staticdemo2 {
    static int count = 0; // static variable
    String sname; // non static variable
    int m1, m2, m3, total; // non static variable
    float percent; // non static variable

    // default constructor

    Staticdemo2() {
        System.out.println("default constructor called..");
        count = count + 1;
        sname = null;
        m1 = 0;
        m2 = 0;
        m3 = 0;
        total = 0;
        percent = 0.0F;
    }

    // static block
    static {
        System.out.println("Static block called..");
    }

    public void show () //non static method
    {
	System.out.println("--------------------------------------------------");
	System.out.println("Name=" +sname);
	System.out.println("Mark1=" +m1);
	System.out.println("Mark2=" +m2);
	System.out.println("Mark3=" +m3);
	System.out.println("Total=" +total);
	System.out.println("Percentage=" +percent);
	System.out.println("No of object created=" +count);
	System.out.println("---------------------------------------------------");
    }
    // non static block1
	{	
	    System.out.println("non static block1 called");
	}

    public void add() // non static method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name=");
        sname = sc.next();

        System.out.println("Enter mark1=");
        m1 = sc.nextInt();

        System.out.println("Enter mark2=");
        m2 = sc.nextInt();

        System.out.println("Enter mark3=");
        m3 = sc.nextInt();

        calcresult();
        sc.close();
    }

    void calcresult() // non static method
    {
        total = m1 + m2 + m3;
        percent = total * 0.3F;
    }

    public static void main(String[] args) // static method
    {
        System.out.println("object s1 created");
        Staticdemo2 s1 = new Staticdemo2();
        s1.add();
        s1.show();

        System.out.println("object s2 created");
        Staticdemo2 s2 = new Staticdemo2();
        s2.show();
    }
}