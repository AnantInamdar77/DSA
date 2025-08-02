package FunctionorMethods.Methods;

public class Shadowing {
    static int a=10;  //can be used in full class Shadowing block   this variabe is shawed by line 8
    public static void main(String[] args) {
        System.out.println();
        System.out.println(a);  //10
        int a=100;   //class  variable a is shadowed by this
        System.out.println(a);  //100
        fun();
        
    }
    static void fun(){
        System.out.println(a);
    }
}
