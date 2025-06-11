package com.vaidehi;

import java.util.Scanner;

public class CheckSign {
    public static void main(String[] args) {
        System.out.println("Enter a number to check the sign - ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>0){
            System.out.println("Positive");
        } else if(num<0){
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }

    }
}