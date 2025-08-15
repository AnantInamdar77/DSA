package Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        //Array is a collection of Homogenous element with common name.

        //Syntax:
        //datatype[] variable_name=new datatype[size];
        //store 5 roll nos
        int[] rnos=new int[5];    //new is used too create an object.
        //OR
        int[] rnos2={10,14,56,77,90};

        int[] ros;  // decleration of array. ros is geting defined in Stack
        ros=new int[5]; // initialization; actually here object is being created in memory(heap)


        // in c, c++ its continuos memory allocation
        //in java there is no pointer at all it depends on JVM
        //1.we know that array objects are in Heap
        //2.Heap objects are not contineuos
        //3.  Dynamic memory allocation hence array obj in java may not be contineous


        System.out.println(rnos2[3]);
        
        String[] arr=new String[5];
        System.out.println(arr[0]);  //null

        

        

    }
    
}
