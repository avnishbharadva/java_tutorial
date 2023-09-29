import java.util.Scanner;

public class Get_Set {
    String name;
    int m1,m2,m3,total;
    float percent;

    Get_Set(){
        this.name = "";
        this.m1 = 0;
        this.m2 = 0;
        this.m3 = 0;
        this.total = 0;
        this.percent = 0.0f;
    }
    Get_Set(String mname,int n1,int n2,int n3){
        this.name = mname;
        this.m1 = n1;
        this.m2 = n2;
        this.m3 = n3;
        this.calcResult();
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
    public void add(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        this.name = sc.nextLine();
        System.out.print("Enter Mark 1 : ");
        this.m1 = sc.nextInt();
        System.out.print("Enter Mark 2 : ");
        this.m2 = sc.nextInt();
        System.out.print("Enter Mark 3 : ");
        this.m3 = sc.nextInt();
        this.calcResult();
        sc.close();
    }
    public void calcResult(){
        this.total = m1 + m2 + m3;
        this.percent = total / 3;
    }
    public void show(){
        System.out.println("Name : " + name);
        System.out.println("M1 : " + m1);
        System.out.println("M2 : " + m2);
        System.out.println("M3 : " + m3);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percent);
    }
    public String calcGrade(){
        if(this.percent<=100 && this.percent>=90){
            return "OO";
        }
        else if(this.percent<90 && this.percent>=70){
            return "A+";
        }
        else if(this.percent<70 && this.percent>=60){
            return "A";
        }
        else if(this.percent<60 && this.percent>=50){
            return "B";
        }
        else if(this.percent<50 && this.percent>=40){
            return "C";
        }
        else{
            return "F";
        }
    }
    public static void main(String args[]){
        Get_Set obj = new Get_Set();
        obj.add();
        obj.show();
        System.out.println("Grade : " + obj.calcGrade());

        System.out.println("*******************************");
        Get_Set o2 = new Get_Set("Avnish",56,87,33);
        o2.show();
        System.out.println("Grade : " + o2.calcGrade());
        System.out.println("**********************************");

        Get_Set o3 = new Get_Set();
        o3.setName("Krishan");
        o3.setM1(100);
        System.out.println(o3.getName());
        System.out.println(o3.getM1());
    }
}
