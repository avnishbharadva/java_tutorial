public class Get_Set {
    String name;
    int m1,m2,m3;

    Get_Set(){
        name = "";
        m1 = 0;
        m2 = 0;
        m3 = 0;
    }
    Get_Set(String mname,int n1,int n2,int n3){
        this.name = mname;
        this.m1 = n1;
        this.m2 = n2;
        this.m3 = n3;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String mname){
        this.name = mname;
    }
    public int getM1(){
        return this.m1;
    }
    public void setM1(int n1){
        this.m1 = n1;
    }
    public int getM2(){
        return this.m2;
    }
    public void setM2(int n2){
        this.m2 = n2;
    }
    public int getM3(){
        return this.m3;
    }
    public void setM3(int n3){
        this.m3 = n3;
    }

    public void show(){
        System.out.println("Name : " + name);
        System.out.println("M1 : " + m1);
        System.out.println("M2 : " + m2);
        System.out.println("M3 : " + m3);
    }
    public static void main(String args[]){
        Get_Set obj = new Get_Set();
        obj.show();

        Get_Set o2 = new Get_Set("Avnish",56,87,33);
        o2.show();

        Get_Set o3 = new Get_Set();
        o3.setName("Krishan");
        o3.setM1(100);
        System.out.println(o3.getName());
        System.out.println(o3.getM1());
    }
}
