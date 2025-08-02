package FunctionorMethods.Methods;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        // create an array
        System.out.println();

        int[]arr={1,2,3,5,7,9};
        change(arr);  //pass by the copy of reference;

        System.out.println(Arrays.toString(arr));

    }
    static void change(int[]nums){
        nums[0]=99;
        //if u make changes to the object via this ref variable same obj will be changed
    }
}
