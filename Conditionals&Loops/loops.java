import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        //Q.print number from 1-1000;
        //for loop
        /*
         * syntax:
         * for(intilaize;condn;inc/dec){
         
         }
         */
        for(int i=1;i<=5;i++){
            // System.out.println(i);
        }

        //Q.print num from 1 to n
        // System.out.println("enter the number");
        // int num=sc.nextInt();
        // for (int i = 1; i<=num; i++) {
            // System.out.println(i);
            
        // }

        //while -loop
        /*
         syntax:
         while(condn){
         //body
         } 
        */
        int n=1;
        while(n<=5){
            // System.out.println(n);
            // n++;
        }

        // while loop is used when u don't know how many times loop is going to run;
        // for loop is used when u  know how many times loop is going to run;


//Do-while loop

        /*
         syntax:
         do{
         
            }while(condn);
         */

         int a=1;
         do{
            System.out.println(a);
         }while(a<=5);
        


    }
}
