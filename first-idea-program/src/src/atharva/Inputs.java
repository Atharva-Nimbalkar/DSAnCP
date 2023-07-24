package src.atharva;

import java.util.Scanner;//this package contains Scanner class

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner after new is constructor.
//         System.out.print("enter a number");
//        int rollno = input.nextInt();
//        System.out.println("Your roll no is " + rollno);

        int a=234_000_000;//234 Million
        System.out.println(a);

        String name=input.nextLine();
        System.out.println(name);

        //Scanner.in is an object attached to keyboard
        System.out.print(input.hasNextInt());//give boolean value

    }
}
