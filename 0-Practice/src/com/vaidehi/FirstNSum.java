package com.vaidehi;

import java.util.Scanner;

public class FirstNSum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int sum = 0;
//        for(int i =0; i<=number;i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        //using recursion

        int n = 10;
        int sum = getSum (n);
        System.out.println(sum);
    }

    static int getSum (int n){

            if (n==0)
                return n;

            return n + getSum(n-1);
    }
}


