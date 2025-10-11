package Binary_Search.Questions_Leetcode;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-number/
public class GFG_Amazon {
    public static void main(String[] args) {
        System.out.println();
        /*
         arr=[2,3,5,6,7,8,10,11,12,15,20,23,30];
         target=15;
         
         find start n end index
         for infinite array
         */
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr, target));

      

    }
    static int ans(int []arr, int target){
        //find the range
        //first start with box size =2
        int start=0;
        int end=1;

        //condn for target to lie in range
        while (target>arr[end]) {
            int newStart=end+1;
            // end= previous end + sizeof box* 2
            end=end+(end-start+1)*2;
            start=newStart;
            
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[]arr ,int target,int start,int end){
        
        while (start<=end) {
            //find mid ele
   //         int mid=(start+end)/2;   //might be possible that(start+end) exceeds range of int in java
              int mid=start+(end-start)/2;     // better way to find mid


              if (target< arr[mid]) {
                end=mid-1;
                
              }
              else if(target>arr[mid]){
                start=mid+1;

              }
              else{
                return mid;
              }

            
        }
        return -1;
        
    }
}
