import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println();
        char ch=in.next().trim().charAt(0);
        // trim removes extra spaces at end of the words
        //charAt give character @ index position
        String word="Hello";
        System.out.println(word.charAt(0));    //returns H

        if (ch>='a' && ch<='z') {
            System.out.println("lower case");
            
        }
        else{
            System.out.println("upper case");
        }
    }
}
