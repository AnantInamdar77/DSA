package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println();
        pat3(5);
    }
    static void pat3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
