package com.atharva;

import java.util.Scanner;
//Q : first char is lower or upper
public class CaseCheck {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);

        if(ch >='a' && ch <='z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }

//         System.out.println(input.next().trim()); trim is used here bcz if space is given at input then it will remove it.
//         System.out.println(input.next().trim().charAt(2));//charAt give the character at index at 2


    }
}
