package FunctionorMethods.Methods;

import java.util.Scanner;

public class  StringExample {

    public static void main(String[] args) {
        // String msg=greet();
        // System.out.println(msg);


        String personlised=mygreet("Anant");
        System.out.println(personlised);



    }

    static String greet(){
        String greeting="How are you?";
        return greeting;
    }
    static String mygreet(String name){
        String msg="hello "+name;
        return msg;
    }
}