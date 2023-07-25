package com.atharva;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        int Number=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            Number=Number*10+rem;
        }

        System.out.println(Number);
    }
}
