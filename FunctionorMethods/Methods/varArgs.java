package FunctionorMethods.Methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,9);
        multiple(2,3,"anant", "shshi");
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a,int b,String...v){

    }
}
