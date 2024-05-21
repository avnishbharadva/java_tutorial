public class Demo3ex {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3(2,4);
        System.out.println(d1);
        Demo3 d2 = d1;
        System.out.println(d2);
        d1.a = 59;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        if(d1==d2)
        {
            System.out.println("both ref var pointing to the same object");
        }

        Demo3 d3 = new Demo3(59, 35);
        if(d1==d3)
        {
            System.out.println("both ref var pointing to the same object");
        }else{
            System.out.println("not same");
            System.out.println(d3.hashCode());
        }

        if(d1.equals(d3))
        {
            System.out.println("both ref var has same value of a");
        }else{
            System.out.println(d1.a + " , " + d3.a);
            System.out.println(d1.equals(d3));
            System.out.println("not same value of a");
        }
    }    
}
