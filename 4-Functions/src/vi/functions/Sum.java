package vi.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(10,34);
        System.out.println(ans);
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        return a+b;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum = " +sum);
    }

    /*
        return_type name (arguments) {
        //body
        return statement;
     }
     */
}
