package FunctionorMethods.Methods;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        //Armstrong number
        //153= 1^3+5^3+ 3^3 =1+125+27=153 ;
        int num=in.nextInt();
        // System.out.println(isArm(num));

        for(int i=100;i<1000;i++){
            if(isArm(i)){
                System.out.println(i);
            }
        }
        // int sum=0;

        // while (num>0) {
        //     int rem=num%10;
        //     int cube=rem*rem*rem;
        //     sum+=cube;
        //     num=num/10;
        // }

    }
    static boolean isArm (int num){
        int original=num;
        int sum=0;
        while (num>0) {
            int rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
           }
           return(sum==original);


    }
}
