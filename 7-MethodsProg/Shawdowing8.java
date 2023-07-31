package com.atharva;

public class Shawdowing8 {
    static int x=100;//This will be shadowed at line 9
    public static void main(String[] args) {
            System.out.println(x);
            int x;//the class variable at line 4 is showded by this
//            System.out.println(x);Scope will begin when value is initialized
            x=10000;
            System.out.println(x);//10000
            fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
