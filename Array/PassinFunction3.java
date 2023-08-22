package atharva.com;

import java.util.Arrays;

public class PassinFunction3 {

    public static void main(String[] args) {
        int[] nums={3,4,5,6,7};
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }
//    array are mutable in java (string are not mutable)
    static void change(int[] arr){
        arr[0]=10000;
    }
}
