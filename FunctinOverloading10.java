package com.atharva;

import java.util.Arrays;

public class FunctinOverloading10 {
    public static void main(String[] args) {
        fun(90);
        int ans=fun(10,20);
        System.out.println(ans);
        demo(8,9,6,5,4,3,55,6,7,7,7,7,7);
        demo("a","d","f","tyt","asdfgh","qwert","asdfgrth","krishana-Radha");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a){
        System.out.println(a);
    }

    static int fun(int a,int b){
        return a+b;
    }
}
