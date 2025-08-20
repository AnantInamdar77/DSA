package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);

        //syntax
        ArrayList<Integer> list=new ArrayList<>(10);

        // list.add(67);
        // list.add(6);
        // list.add(7);
        // list.add(68);
        // list.add(60);
        // list.add(61);
        // list.add(62);
        // list.add(64);


        
        // list.set(0, 99);
        // list.remove(2);

        // System.out.println(list.contains(7));
        // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            
        }

        //get iteam at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  //pass index here.,list[index] SYntax will not work here

        }
        //Internal working

        // 1.size is fixed iternally
        //2.say Arraylist fills by some amount => it will create new Arraylist of say,double the size
        // old elements are copied in new one   & old one is deleted


    }
}
