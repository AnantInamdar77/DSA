package Binary_Search;

public class Main {
    public static void main(String[] args) {
        System.out.println();


       /*  Algorithm

         step 1:- Find the middle element
         step2:- If array is sorted ascending check if target ele> middle ele => search in right
                  else search in left
         step 3:- if middle ele== target ele then its answer  


         Why Binary Search???
        =>  
        Qns: find max number of search comparison inworst case.
            when worst case the linear search make 1000000 comparisions
            while Binary Search makes 20 comparisions.(log2(N))
            Complexity :O(log N)


        */

        int []arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
        int ans=binarySearch(arr, target);
        System.out.println(ans);


    }
    static int binarySearch(int[]arr ,int target){
        int start=0;
        int end=arr.length-1;

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
