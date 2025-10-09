package Binary_Search.Questions_Leetcode;

public class Floor_of_number {
    public static void main(String[] args) {
        System.out.println();
        /*
        
        Floor= greatest number that is smaller or equal to target
        ex: arr={2,3,5,9,14,16,18}
        target=15

        Floor = 14;
        
        
         */
        int[]arr={1,2,3,5,6,8,12,15,18,21,25};
          int target=13;

         System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[]arr ,int target){

        // return index greatest num<=target
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
              int mid=start+(end-start)/2;     

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
        return end;
        
    }
}
