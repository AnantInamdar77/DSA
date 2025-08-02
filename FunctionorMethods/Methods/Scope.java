package FunctionorMethods.Methods;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            //block scope cannot initiaize value again but can change like= a=100;
            //values decleared or initialized i block will remin in block
        }


    // scoping in for loop
    for(int i=0;i<7;i++){
        System.out.println(i);  //i is  not accesable outside loop
    }    
    }
    
    static void function(){
        //fuctn scope
    }
}
