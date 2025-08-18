package Arrays;
import java.util.Arrays;

public class PassingInFunctn {
    public static void main(String[] args) {
        System.out.println();
        int[] nums={3,4,5,19};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[]arr){
        arr[0]=99;   //mutable 
    }
}
