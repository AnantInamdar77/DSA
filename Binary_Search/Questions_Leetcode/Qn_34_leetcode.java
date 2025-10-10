package Binary_Search.Questions_Leetcode;
//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-numay/
public class Qn_34_leetcode {
    public static void main(String[] args) {
        System.out.println();

        /*
        Given an numay of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the numay, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing numay.
-109 <= target <= 109


          num=[5,7,7,7,7,8,8,10]   target=7
          op=[1,4]

          * find first occurance of 7
          =>   end=mid-1;
          * for last occurance
          =>   start=mid+1;

         */
    }
    public int[] searchRange(int[] num, int target){

        int[]ans={-1,-1};

        //chck for first occurance if  target first
        int start=search(num, target, true);
        int end=search(num, target, false);
        ans[0]=start;
        ans[1]=end;

        return ans;
        
    }
    int search(int[] num, int target , boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=num.length-1;

        while (start<=end) {
            
              int mid=start+(end-start)/2;     


              if (target< num[mid]) {
                end=mid-1;
                
              }
              else if(target>num[mid]){
                start=mid+1;

              }
              else{
                //potential ans is found
                ans=mid;
                if (findStartIndex) {
                    end=mid-1;
                    
                }
                else{
                    start=mid+1;
                }
              }

            
        }
        return ans;
        
    }

    }

    
    


