package com.atharva;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }

        //another way
        int max= Math.max(c,Math.max(a,b));
        System.out.println("Maximum number is " + max);
    }
}
