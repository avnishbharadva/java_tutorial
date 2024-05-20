public class Demo3 {
    int a;
    int b;

    Demo3(int a,int b){
        this.a = a;
        this.b = b;
    }

    Demo3(Demo3 old){
        this.a = old.a;
        this.b = old.b;
    }

    @Override
    public String toString() {
        return "A : " + this.a + " B : " + this.b;
    }
}
