package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        System.out.println();
        pat28(5);
    }
    static void pat28(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalcols=row > n? 2*n-row:row;
            int noOfSpaces=n-totalcols;
        for (int s = 0; s < noOfSpaces; s++) {
            System.out.print(" ");
            
        }    

            for (int col = 0; col < totalcols; col++) {
                System.out.print("* ");
                
            }
            System.out.println();

            
        }

    }
}
