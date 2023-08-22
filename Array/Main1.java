package atharva.com;

public class Main1 {
    public static void main(String[] args) {
//        Syntax
        //datatype[] variable_name= new datatype[size];

//        store 5 numbers
//        int[] rnos=new int[10];
        //or directly
        int[] rnos ={3,4,5,6,7,78,233,45};

        int[] ros;//declaration of array. ros is getting defined in the stack.(variable)
        ros= new int[10]; //actually here object is being created in the memory (heap)

        System.out.println(ros[1]);
        //in Python all are objects
        //in java primitive data types are stored in stack while non-primitives stored in heap

        String[] arr=new String[4];
        System.out.println(arr[0]);

    }


}