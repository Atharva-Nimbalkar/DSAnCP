package atharva.com;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarr4 {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];

//        int[][] arr={
//                {1,2,3},//0th index
//                {4,5,6},//1th index
//                {7,8,9}//2nd index
//        };

        //To input
        Scanner input=new Scanner(System.in);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=input.nextInt();
            }
        }

        //To display
//        for(int row=0;row<arr.length;row++){
//
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//        System.out.println();
//        }

        //or output
//        for(int row=0;row<arr.length;row++){
//            System.out.println((Arrays.toString(arr[row])));
//        }

        //ENHANCE loop
        for(int[] a: arr){//every single elment in this  array is an itself is an array.
            System.out.println(Arrays.toString(a));
        }

    }
}
