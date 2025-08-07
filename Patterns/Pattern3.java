package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println();
        pat3(5);
    }
    static void pat3(int n){
        for(int row=0;row<=n;row++){
            for (int col =1; col<=n-row; col++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
