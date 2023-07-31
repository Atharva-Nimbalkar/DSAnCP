package com.atharva;

import java.util.Scanner;

public class StringExample3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name= input.nextLine();
        String X=info(name);
        System.out.println(X);
    }

    static String info(String name){
        String store="My name is " + name;
        return store;
    }
}
