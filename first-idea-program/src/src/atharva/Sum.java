package src.atharva;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        float sum = num1 + num2; //automatic casting or implicit casting
        System.out.println("SUM =" + sum);


    }
}


