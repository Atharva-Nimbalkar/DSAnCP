package com.atharva;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float sum=0;
        while(true){
            System.out.println("enter the operator");
            char op=in.next().trim().charAt(0);
            if(op=='+' || op=='/' || op=='*' || op=='-'){
            System.out.println("enter the input");
            float x1=in.nextFloat();
            float x2=in.nextFloat();
            if(op=='+'){
                sum=x1+x2;
            }
            else if(op=='-'){
                sum=x1-x2;
            }
            else if(op=='/'){
                sum=x1/x2;
            }
            else if(op=='*'){
                sum=x1*x2;
                }
            }else if(op=='x' || op=='X'){
                break;
            }
            else{
                System.out.println("invalid input");
            }
            System.out.println(sum);
        }
    }//in java while loop required condition to  terminate loop?
}
