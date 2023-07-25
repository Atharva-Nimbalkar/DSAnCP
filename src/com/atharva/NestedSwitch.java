package com.atharva;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int id=in.nextInt();
        String department=in.next();

        switch (id){
            case 1:
                System.out.println("Atharva");
                break;
            case 2:
                System.out.println("Raj");
                break;
            case 3:
                System.out.println("Manas");
                switch (department){
                    case "Computer":
                        System.out.println("Computer department");
                        break;
                    case "ENTC":
                        System.out.println("ENTC department");
                        break;
                    default:
                        System.out.println("No department");
                    }
                break;
            default :
                System.out.println("Jay hanuman");

        }
    }
}
