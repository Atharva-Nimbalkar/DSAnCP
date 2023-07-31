package com.atharva;

public class Swap5 {
    public static void main(String[] args) {
        int a=50;
        int b=2343;
        swap(a,b);
        System.out.println(a+ " " + b);

//        String name="Bhagwan hey kaha re tu";
//        changeName(name);
//        System.out.println(name);

        //MIMP java functions are passed by value only (not by reference)
        //in primitive data types it is always going to change by value
        //other complex data type it it copy of that refernce variable
    }

//    static void changeName(String naame){
//        naame="Atharva Nimbalkar";// create a new object() not modifing
//    }//string are immutable in java

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
//in primitve data types modification not possible (pass by value)
//complex data types modification possible(pass by value of copy of that refernce varibale)

