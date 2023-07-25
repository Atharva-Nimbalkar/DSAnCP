package com.atharva;

import java.util.Scanner;

public class Loops {
    public static  void main(String[] args){
        System.out.println("For Loop");
        for(int i=0;i<=9;i++){
            System.out.println(i);
        }

//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        for (int i=0;i<=n;i++){
//            System.out.println(i);
//        }

        System.out.println("While Loop");
        int i=1;
        while(i<=7){
            System.out.println(i);
            i++;
        }

        System.out.println("Do while line");
        int x=9;
        do {
            System.out.println(x);
            x++;
        }while (x<=20);

    }

}
