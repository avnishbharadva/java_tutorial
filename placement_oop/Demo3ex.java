public class Demo3ex {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3(2,4);
        System.out.println(d1);
        Demo3 d2 = new Demo3(d1);
        System.out.println(d2);
        d1.a = 59;
        System.out.println(d1);
        System.out.println(d2);
    }    
}
