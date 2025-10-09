package Binary_Search.Questions_Leetcode;

public class Ceiling_of_number {
    public static void main(String[] args) {
        System.out.println();

        /*  Qn: arr=[2,3,5,9,14,16,18]
                target=15

                ceiling = smallest element in array gereater or equal to target

                ceiling(arr,target=15)= 16;
                
                target=4
                ceiling=5;
           

             when condn is voilated start=end+1;
             for ceiling its asking smallest ele greter or equal to target
             therfor we return start   
         */

          int[]arr={1,2,3,5,6,8,12,15,18,21,25};
          int target=13;

         System.out.println(binarySearch(arr, target));


    }
    static int binarySearch(int[]arr ,int target){
        //but wht if target > greatest num in array
        if (target> arr[arr.length-1]) {
            return -1;
            
        }
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
        return start;
        
    }
    
}
