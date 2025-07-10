package com.vaidehi;

import java.util.Scanner;

public class FindSimpleInterest {
    public static void main(String[] args){
        System.out.println("Enter Principal(in Rs.), Time(in Years) and Rate for calculating Simple Interest:- ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        int si = (p*r*t)/100;
        System.out.println(si);

    }
}
