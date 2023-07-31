package com.atharva;

public class Scope7 {
    public static void main(String[] args) {
        int n=1;
        int a=2;
        int b=3;
        String name="Kunal";
        //Block scope
         {
            //int a=7; error because already intialize outside the block
            a=5;//reassign the origin ref variable to some other value.
            int c=4;//value intialized will remain only in this block
            System.out.println(c);
            name="Rahul";
            System.out.println(name);
        }
        System.out.println(n);
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
//        System.out.println(c); can't use outside the block
    }

    //outside Intialized thing can used inside the block (modified)
    //but inside block intialized things  can not used outside
    static void some(){
//        System.out.println(n);not possible here
    }
}
