import java.util.Scanner;

public class Reverseanumber {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        // n=23597   ans=79532
        int num=23597;
        int ans=0;
        while (num>0) {
            int rem=num%10;
            num/=10;
            ans=ans*10+rem;
            
        }
        System.out.println(ans);

    }
}
