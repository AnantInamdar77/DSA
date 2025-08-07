package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        System.out.println();
        pat5(5);
    }
    static void pat5(int n){
        for(int row=0;row<2*n;row++){
            int totalcols=row > n? 2*n-row:row;
            for(int col=0;col<totalcols;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
