package Linear_Search;

public class Leetcode_1672 {
    public static void main(String[] args) {
        System.out.println();
        //https://leetcode.com/problems/richest-customer-wealth/


    }
    public int maximumWealth(int[][] accounts){
        //person=row
        // account=col
        int ans=Integer.MIN_VALUE;
        for (int[] ints: accounts) {
            //when u start  new,col take new sum for that row
            int sum=0;
            for (int anInt:ints) {
                sum+=anInt;
                
            }
            //now we hae sum of accounts of person
            // check with overall ans
            if (sum>ans) {
                ans=sum;
                
            }
            return ans;
        }
    }
}
