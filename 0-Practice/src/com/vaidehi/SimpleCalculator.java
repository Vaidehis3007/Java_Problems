package com.vaidehi;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and operator for which the operation needs to be performed-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();

        if(op.equals("+")){
            System.out.println(a+b);
        }else if(op.equals("-")){
            System.out.println(a-b);
        }else if(op.equals("*")){
            System.out.println(a*b);
        }else{
            System.out.println(a/b);
        }
    }
}
