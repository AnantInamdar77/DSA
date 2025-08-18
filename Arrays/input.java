package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);

        //array of primitives.
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=55;arr[3]=95;arr[4]=18;
        System.out.println(arr[3]);

        //input using for loop;
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        //OR
        System.out.println(Arrays.toString(arr));
        
        for (int i : arr) {            
            System.out.println(i + " ");  // here i represents element of the array;
            
        }


    }
}
