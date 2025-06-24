package com.vaidehi;

public class GreatestTwoNumbers {
    public static void main(String[] args) {
        int num1=30, num2 = 23;
        int temp=0;

        //Using ternary operator
//        if(num1==num2){
//            System.out.println("Both are equal");
//        }else{
//            temp = num1>num2 ? num1: num2;
//            System.out.println(temp);
//        }

        //Using if-else
        if(num1==num2){
            System.out.println("Both are equal");
        }else if(num1>num2){
            System.out.println(num1 + "is greater than" +num2);
        }else{
            System.out.println(num2 + "is greater than" +num1);
        }
        //using Math.max operator
        if(num1==num2){
            System.out.println("Both are equal");
        }else{
            System.out.println(Math.max(num1,num2)+" is greater");
        }

    }
}
