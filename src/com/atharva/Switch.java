package com.atharva;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String mobiles = input.next();


//new java syntax    internally break statments
//        switch (mobiles) {//internally break statments
//            case "iphone" -> System.out.println("Most expensive");
//            case "Samsung" -> System.out.println("Most Market share");
//            case "Vivo" -> System.out.println("A better a camera");
//            case "Nokia" -> System.out.println("Less used phone");
//            default -> System.out.println("Wrong input");
//        }

/*        switch (mobiles) {
            case "iphone":
                System.out.println("Most expensive");
                break;
            case "Samsung":
                System.out.println("Most Market share");
                break;
            case "Vivo":
                System.out.println("A better a camera");
                break;
            case "Nokia":
                System.out.println("Less used phone");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
*/
//default can also be used above any case but give  break statement
//debugger : When u run programm and find debugger point then you excute program line by line


        int days = input.nextInt();
        switch (days) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
    }
}


