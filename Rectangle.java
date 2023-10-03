import java.util.Scanner;

public class Rectangle {
    double length, width, area;
    static int count;

    // static block
    static {
        System.out.println("static block called...");
    }

    // non-static block
    {
        System.out.println("Non-static block called...");
        count++;
    }

    // default constructor
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
        this.area = 0.0;
    }

    // perameterised contructor
    public Rectangle(double len, double wid) {
        this.length = len;
        this.width = wid;
        this.calcArea();
    }

    // copy constructor
    public Rectangle(Rectangle obj) {
        this.length = obj.length;
        this.width = obj.width;
        this.calcArea();
    }

    // getter and setter for length
    public double getLength(){
        return this.length;
    }
    public void setLength(double len){
        this.length = len;
        this.calcArea();
    }

    // getter and setter for width
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double wid){
        this.width = wid;
        this.calcArea();
    }
    public void show() {
        System.out.println("===========================");
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Area : " + this.area);
        System.out.println("Total Objects Craeted : " + count);
    }

    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        this.length = sc.nextDouble();
        System.out.print("Enter Width : ");
        this.width = sc.nextDouble();
        this.calcArea();
        sc.close();
    }

    public void calcArea(){
        this.area = this.length * this.width;
    }
    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        s1.show();
        s1.getdata();
        s1.show();

        Rectangle s2 = new Rectangle(10.7,56.5);
        s2.show();

        Rectangle s3 = new Rectangle(s2);
        s3.show();
    }
}