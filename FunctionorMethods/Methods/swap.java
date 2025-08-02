package FunctionorMethods.Methods;

public class swap {
    public static void main(String[] args) {
        int a=10,b=20;
        swap(a, b);
        System.out.println();

        System.out.println(a +" " +b);




    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        
    }  //its not swapped           becauz priitives int,short,char,byte- just passing value
    //  object and reernces:= passing value of reference variable
}
