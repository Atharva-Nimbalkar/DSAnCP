package atharva.com;

import java.util.Arrays;

public class Swap7 {
    public static void main(String[] args) {
        int[] arr={455,67,78,90};
//        swap(arr,0,2);

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
