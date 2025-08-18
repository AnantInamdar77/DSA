package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        System.out.println();
        Scanner in=new Scanner(System.in);

        /*
         1 2 3
         4 5 6
         7 8 9           3x3 matrix 
          
         */

       // int[][] arr=new int[3][];    //int [rows][cols]   adding number of rows is necessary cols is not mandatory;
//        int [][] arr={
  //          {1 ,2,3},  //0th index
 //           {4,5,6},  //1st index
 //           {7,8,9}   //2nd index --> arr[2][0]={7}
 //       };

       

         int[][]arr=new int[3][3];
         System.out.println(arr.length);  //gives number of rows
        

        //input
        for (int rows = 0; rows < arr.length; rows++) {
            //for each col in every row
            for (int col = 0; col < arr[rows].length; col++) {  //indvidual size of rows is taken in condtn
                arr[rows][col]=in.nextInt();
            }
        }

             //output
        for ( int rows = 0; rows < arr.length; rows++) {
            //for each col in every row
            for (int col = 0; col < arr[rows].length; col++) {  //indvidual size of rows is taken in condtn
                System.out.print(arr[rows][col]+" ");
            }
            System.out.println();


        }
        //OR
        for (int rows = 0; rows < arr.length; rows++) {
            System.out.println(Arrays.toString(arr[rows]));
            
        }
        //foreach
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
            
        }




    }
}
