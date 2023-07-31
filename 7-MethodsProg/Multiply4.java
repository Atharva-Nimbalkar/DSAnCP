package com.atharva;

import java.util.Scanner;

public class Multiply4 {
    public static void main(String[] args) {
        int x=mult();
        System.out.println(x);
    }

    static int mult() {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int op=n1*n2;
        return op;
    }
}
