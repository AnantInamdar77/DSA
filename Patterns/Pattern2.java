package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println();
        pat1(4);
        
    }
    static void pat1(int n){
        for(int row=1;row<=n;row++){
               // for every row , run the col
               for(int col=1;col<=row;col++){
                System.out.print("*");
               }
               // when one row is printed we need to add a new line
               System.out.println();
        }

    }
}
