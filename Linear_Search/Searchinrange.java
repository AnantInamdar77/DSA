package Linear_Search;
import java.util.Arrays;


public class Searchinrange {
    public static void main(String[] args) {
        System.out.println();
        int[]arr={18,12,-7,3,14,28};
        int target=3;
        System.out.println(linear_search(arr, target, 1, 4));

        
    }
    
    static int linear_search(int[]arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <=end; i++) {
            int ele=arr[i];
            if (ele==target) {
                return i;
                
            }
        }
        return -1;
    }

    }

