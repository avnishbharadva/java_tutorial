public class Diamond_pattern {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}