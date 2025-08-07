package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println();
        pat1(5);
    }
    static void pat1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
