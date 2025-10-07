package Linear_Search;
import java.util.Arrays;
public class findmin {
    public static void main(String[] args) {
        System.out.println();
        int[]arr={18,12,-7,3,14,28};
        System.out.println(min(arr));
        
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans) {
                ans=arr[i];
            }
        }
        return ans;
    }
}
