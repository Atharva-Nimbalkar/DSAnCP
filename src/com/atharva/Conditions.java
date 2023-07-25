package com.atharva;

public class Conditions {
    public static void main(String[] args) {
        int salary=5000000;
        if(salary>50000){
            salary+=2000;
        }
        else if(salary>20000000){
            salary+=1000;
        }
        else{
            salary+=2;
        }
        System.out.println("total salary is" + salary);
    }




}
