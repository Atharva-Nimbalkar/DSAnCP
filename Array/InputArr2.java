package atharva.com;

import java.util.Arrays;
import java.util.Scanner;

public class InputArr2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[4];//syntax in java
//        int arr1[]=new int[6]; syntax in c

        //for taking input
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        //for display output
        System.out.print(Arrays.toString(arr));


        //or
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        //or
        for(int num : arr){//for every element in array,print the element
            System.out.print(num + " ");//here num represent elements of array
        }

    }
}
