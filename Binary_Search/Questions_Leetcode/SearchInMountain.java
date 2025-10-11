package Binary_Search.Questions_Leetcode;
// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        System.out.println();


        // arr=[1,2,3,4,5,3,1] target=3;

        //1. find peak elemet => 4 index
        // 2.binary search inascending array=> (0,4)
        //3. if not found binary search in [4,6] decresing array

    }
    int search(int[]arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr, target,0,peak);
        if (firstTry!=-1) {
            return firstTry;
            
        }
        // else try to search in second half
        return orderAgnosticBS(arr, target, peak, arr.length-1);

    }
    int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end) {
              int mid=start+(end-start)/2;     // better way to find mid


             if (arr[mid]>arr[mid+1]) {
                // ur in decresing part of array
                // this may be ans but look at left
                //tis  is why end!=mid-1
                end=mid;
             }
             else{
                // ur in acsending part of array
                start=mid+1;   // becauz wkt mid+1 elemet > mid element
             }
        //  in end , start===end and pointing to the largest num becauz of two checks above
        // startand end are always trying to find max element in above 2 checks
        // hence when they are pointing to one eement that is maximum one becauz that is what checks say
        // more eloboration:  at every point of time for start an end, they have best possible ans till that time
        //&  if we are saying only one item is remaining ,hence cuz of above line that is the best possible ans

    }
    return start; // end also ,becuz both are equal

}
static int orderAgnosticBS(int[] arr, int target,int start, int end){
        

        //find weather array is sorted in ascending or descending

        boolean isAsc=arr[start]<arr[end];
        

        while (start<=end) {
            //find mid ele
   //         int mid=(start+end)/2;   //might be possible that(start+end) exceeds range of int in java
              int mid=start+(end-start)/2;     // better way to find mid


              if(arr[mid]==target){
                return mid;
              }

              if (isAsc) {
                if (target< arr[mid]) {
                end=mid-1;
                
              }
              else {
                start=mid+1;

              }
              
              }
              else{


              if (target>arr[mid]) {
                end=mid-1;
                
              }
              else {
                start=mid+1;

              }
              
            } 
        }
        return -1;

    }
    }

/*
 ublic int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);

        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak, true);
        if (firstTry != -1) return firstTry;

        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int orderAgnosticBS(MountainArray arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) return mid;

            if (isAsc) {
                if (target < midVal) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > midVal) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}

 */

 // i'll submit after the oops lerning.