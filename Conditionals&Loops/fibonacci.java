import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println();
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=n) {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
            
        }
        System.out.println(b);           //1, 1, 2, 3, 5, 8, 13, 21, and so on
    }
}
