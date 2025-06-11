package vi.conditionals;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax of for loops:

        for (initialisation; condition; increment/decrement){
            //body
           }
         */
        // Q: Print numbers from 1 to 5

//        for(int num=1; num <= 5; num += 2){
//            System.out.println(num);
//        }

        //print number from 1 to n
//        System.out.println("Enter the value of n: ");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int i = 0; i <= n; i++){
//            System.out.println(i + " ");
//        }
        // while loop
        /*
        Syntax:
        while(condition) {
        //body
        }
         */

//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num += 1;
//        }

        // do-while loop
        /* Syntax

            do{

            }while(condition);
         */

        int n = 1;
        do{
            System.out.println("Hello World");
//            System.out.println(n);
//            n++;
        }while(n <=5);
    }
}
