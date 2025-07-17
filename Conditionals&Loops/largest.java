import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //find largest of 3 nos?
        System.out.println();
        System.out.println("enter the numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=a;
        if (b>max) {
            max=b;
            }
         if (c>max) {
            max=c;
            
         }   
        //  System.out.println("largest nu is=  "+max);

         //other method
         int maxi=Math.max(Math.max(a, b),c);
         System.out.println(maxi);

    }
}
