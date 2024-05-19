import java.util.List;

public class Demo1 {

    int rno;
    String name;

    Demo1()
    {
        System.out.println("default con");
    }
    Demo1(int rno, String name)
    {
        System.out.println("parameterized con");
        this.rno = rno;
        this.name = name;
    }
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println(d.name);

        Demo1 d2 = new Demo1(12,"avnish");
        System.out.println(d2.name);

        // List l;
        // System.out.println(l);
    }
}
