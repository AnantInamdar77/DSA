package Linear_Search;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int[]arr={1,2,3,45,67,89,78,87,67,76,11};
        int target=89;
        int ans=linear_search(arr, target);
        System.out.println(ans);

    }
    //serach in the array: return index if iteam found 
    // otherwise return -1
    static int linear_search(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        // run for loop
        for (int i = 0; i < arr.length; i++) {
            //check for ele at every index if it is=target
            int ele=arr[i];
            if (ele==target) {
                return i;
                
            }
        }
        //this line is exicuted if none of the return stmt above have executed
        //hence target not founfd
        return -1;
    }
}
