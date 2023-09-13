import java.util.Scanner;

public class Staticblockdemo {
    static int count=0;
    String name;
    int m1,m2,m3,total;
    float per;
    
    Staticblockdemo(){
        System.out.println("Default Constructor Called...");
        name = null;
        m1 = 0;
        m2 = 0;
        m3 = 0;
        total = 0;
        per = 0.0f;
        count += 1;
    }
    
    static{
        System.out.println("Static Block Called...");
    }

    void calcper(){
        total = m1 + m2 + m3;
        per = total * 0.3f;
    }
    
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Marks 1 : ");
        m1 = sc.nextInt();
        System.out.print("Enter Marks 2 : ");
        m2 = sc.nextInt();
        System.out.print("Enter Marks 3 : ");
        m3 = sc.nextInt();
        sc.close();
        calcper();
    }

    void show(){
        System.out.println("Name : " + name);
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2 : " + m2);
        System.out.println("Marks 3 : " + m3);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + per);
        System.out.println("Total Objects Created : " + count);
    }

    {
        System.out.println("Non-static Block Called...");
    }
    public static void main(String[] args) {
        System.out.println("obj is created...");
        Staticblockdemo obj = new Staticblockdemo();
        obj.add();
        obj.show();

        System.out.println("o2 is created...");
        Staticblockdemo o2 = new Staticblockdemo();
        o2.show();
    }    
}