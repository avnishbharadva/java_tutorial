public class Demo2 {

    static int a = 10;
    static int b;

    static{
        System.out.println("static block called");
        b = 33;
    }
    public static void main(String[] args) {
        // System.out.println("A : " + Demo2.a);
        // System.out.println("B : " + b);   
        
        // Demo2 obj = new Demo2();
        // System.out.println(Demo2.a);

        SingletonEx ins1 = SingletonEx.getInstance();
        ins1.a=100;
        System.out.println("A ins1 : " + ins1.a);
        SingletonEx ins2 = SingletonEx.getInstance();
        ins2.a = 2464;
        System.out.println("A ins2 : " + ins2.a);
        System.out.println("A ins1 : " + ins1.a);
    }
}
