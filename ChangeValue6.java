package com.atharva;

import java.util.Arrays;

public class ChangeValue6 {
    public static void main(String[] args) {
        int[] arr={6,5,7,4,78};//create an array
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0]=999;//if u make change to the object via this ref variable,same object will be changed
    }
}
