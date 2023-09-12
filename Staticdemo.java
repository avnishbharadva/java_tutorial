public class Staticdemo {
    static int a=0;
    String name;

    Staticdemo(){
        // a = 2;
        a+=1;
    }
    public static void main(String[] args) {
        int a=10;
        Staticdemo s1 = new Staticdemo();
        Staticdemo s2 = new Staticdemo();
        System.out.println("A : " + a);
        System.out.println("static A : " + Staticdemo.a);
        System.out.println("Name : " + s1.name);
        System.out.println("Name 2 : " + s2.name);
    }
}