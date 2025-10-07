package Linear_Search;

public class Leetcode_1295 {
    public static void main(String[] args) {
        System.out.println();
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(7890678));


        //Qn: Given an array mu,s of integer ,return how many of them contain an even numbe ofn digits.
//    https://leetcode.com/problems/find-number-with-even-number-of-digits/

    }
    static int findNumbers(int[]nums){
        int count=0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    //fuctn to check num contains even digits or not
    static boolean even(int num){
        int numberOfdigits=digits(num);
    //     if(numberOfdigits%2==0){
    //         return true;
    //     }
    //     return false;
    // }
    return numberOfdigits%2==0;
    }
    //count  number of digits
    static int digits(int num){
        if(num<0){
            num=num*-1;

        }
        if (num==0) {
            return 1;
            
        }
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }


        return count;

    }
    
}
