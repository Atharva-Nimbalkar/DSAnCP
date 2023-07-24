package src.atharva;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //Type casting type 1 explicit example big data type can convert
        //to small i.e float to int;

        //Ex 1.explicit (Narrowing Casting)
//        float num1= 67.456f;
//      int num2=num1; this will give error
//        int num2=(int)num1;
//        System.out.println(num2);


        //Ex2. implicit (Widening Casting)
//        int num1=34;
//        float num2=num1;
//        System.out.println(num2);

        //Ex 3.byte store upto 256
        int a=258;
        byte change=(byte)a; //258%256=2;
        System.out.println(change);

        //Ex 4.
//        byte a=50;
//        byte b=40;
//        byte c=100;
//        int d=a*b/c; //byte evaluation can be done automatically by converting/considering the int type
//        System.out.println(d);

//       byte b=20;
//        b=b*2; // this will give error bcz int can't convert to byte

//        Ex 5. automatic type conversion
//        int num1='z';
//        System.out.println(num1);
//        System.out.println("你好");//unicode language

//        Ex 6.

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b) + (i/c) - (d*s);
//        b is promote to f, c is promote to i and so on...
        //float + int - double =double (small data type promote to larger type
        System.out.println((f*b)+ " " +(i/c) + " " + (d*s));
        System.out.println(result);

    }
}



