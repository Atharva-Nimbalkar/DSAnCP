package com.atharva;

import java.util.Arrays;

public class VarArgs9 {
    public static void main(String[] args) {
//        fun(7,6,8,9,4,56,5,7,5,455);
          fun1(56,78,978,8969,53,5,6,7,8,9,9,9,99);
    }

    public  static  void fun1(int a,int b,int ...x){ //...x (this is at end bcz that is array which does not have any length
        // so how should you after b variable give array elements
        System.out.println(Arrays.toString(x));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
