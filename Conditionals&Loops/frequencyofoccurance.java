import java.util.Scanner;

public class frequencyofoccurance {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        //logic 
        //  if we take remainder of anny num by 10 we get last digit((1389%10=9))
        //if we take divide by 10 we can remove  last number((1389/10==138))
        int n=45536;
        int count=0;
        while (n>0) {
            int rem=n%10;
            if (rem==5) {
                count++;
                
            }
            n=n/10;
            
        }
        System.out.println(count);
    }
}
