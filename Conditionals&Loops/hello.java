import java.util.Scanner;
public class hello{
    public static void main(String[]args){
        //comments
        System.out.println();
        // System.out.println("Hello World!");
        // System.out.print("Hello World!\n");
        // System.out.println("*\n**\n***\n****\n*****");

        //printing Z shaped star pattern using simple print statemnt

        // System.out.println("*****\n    *\n   * \n  *   \n *    \n*****");



        int x=4;
        int y=3;
        int sum=x+y;
        int mod=y%x;
        // System.out.println("sum of "+ x +" and "+ y+" is = "+sum);
        System.out.println(mod);

        // int exp=x*y/x+y;
        int exp=(x*y)/(x+y);
        System.out.println(exp);
        // (/,*,%)>(+,-)  if priority is equal then it will consider from left to right
        // 4*3/4+3 =12/4+3= 3+3=6
        System.out.println(12/7);
    }
    
}