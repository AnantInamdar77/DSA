package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArraylist {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();


        //initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
            
        }
        //add element
        for (int i = 0; i < 3; i++) {
            list.get(i).add(in.nextInt());
            
        }
        System.out.println(list);
    }
}
