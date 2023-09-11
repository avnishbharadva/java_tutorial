import java.util.Scanner;

public class Scannerdemo {
    public static void main(String[] args) {
        // byte b;
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Byte Value : ");
        // b = sc.nextByte();
        // System.out.println("Byte Value : " + b);
        // System.out.println("radix : " + sc.radix());
        // sc.close();

        // String s = "Avnish BHaradva";
        // Scanner scan = new Scanner(s);
        // System.out.println("Boolean Result : " + scan.hasNext());
        // System.out.println("String : " + scan.nextLine());
        // System.out.println("Boolean Result : " + scan.hasNext());
        // scan.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.print("Enter Your Age : ");
        int i = sc.nextInt();
        System.out.print("Enter Your Salary : ");
        double d = sc.nextDouble();
        System.out.println("Name : " + name + " , Age : " + i + " , Salary : " + d);
        sc.close();
    }
}