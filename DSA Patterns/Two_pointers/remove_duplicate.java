package Two_pointers;

public class remove_duplicate {
    public static void main(String[] args) {
        System.out.println();
    }
     public int removeDuplicates(int[] nums) {
        int high=1;
        int low=0;
        int res=1;
        while(high<nums.length){
            if(nums[high]==nums[high-1]){
                high++;
                continue;
            }
            //here we found unique element
            nums[low+1]=nums[high];
            low++;
            res++;
            high++;

        }
        return res;
    }

}
