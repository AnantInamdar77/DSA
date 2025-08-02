package FunctionorMethods.Methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // take input of 2 nums and print sum
       
        /*
         access modiifier return_type name(arguments){
                  //body
                  return stmt;
                 }
           */
       // int ans=sum();  //calling a function
        //System.out.println(ans);
        greet();

        int ans=sum1(20, 30);
        System.out.println(ans);
        }
       static int sum() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=in.nextInt();
        System.out.println("Enter second number");
        int b=in.nextInt();
        int sum=a+b;
        return sum;  // fuction is over anything after this will never execute and its unrecable
}
    static void greet(){
        System.out.println("Good morning");

     }



     //pass the value of numbers when you are calling the method in main()

     static int sum1(int a, int b){

        int sum=a+b;
        return sum;
     }


     


}