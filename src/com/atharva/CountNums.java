package com.atharva;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        System.out.println("Which Number do you want to count");
        int n=in.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==n){
                count+=1;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
