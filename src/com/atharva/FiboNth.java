package com.atharva;

import java.util.Scanner;

//Q : nth fibo number
public class FiboNth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0;
        int b=1;
        int index=2;

        while(index<=n){
            int temp=b;//
            b=b+a;//this is bcz b is updated to whatever number is having added
            a=temp; //a is updated to b
            index++;
        }
        System.out.println(b);
    }
}
