package com.atharva;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        add();
    }

    static void add(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the numbers");
    int num1=input.nextInt();
    int num2=input.nextInt();
    int sum=num1+num2;
    System.out.println("Total sum is "+sum);
    }

}
