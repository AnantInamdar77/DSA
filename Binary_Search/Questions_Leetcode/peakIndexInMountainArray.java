package Binary_Search.Questions_Leetcode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peakIndexInMountainArray {
    public static void main(String[] args) {
        System.out.println();
        /*
         You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

 

Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1

 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
         */

         // 1. if e[mid]>e[mid+1]=> u r at decresing part of array  =>end=mid
         // 2.e[mid]<e[mid+1]=> ur in ascending part of array  => start=mid+1
         // 3. when loop break??  start=end


    }
    static int binarySearch(int[]arr ,int target){
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
}
//  https://leetcode.com/problems/find-peak-element/

// above is copy past of same solutn for the medium prblm