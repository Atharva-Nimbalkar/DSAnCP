package src.atharva;

import java.util.Scanner;

//Q: Converting Binary to decimal
public class Radix {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        input.useRadix(2);
        int x=input.nextInt();

        System.out.println(x);
    }
}
