package vi.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//    switch(fruit){
//        case "Mango":
//            System.out.println("King of fruits");
//            break;
//        case "Apple":
//            System.out.println("A sweet and red fruit");
//            break;
//        case "Orange":
//            System.out.println("ROund fruit");
//            break;
//        case "Grape":
//            System.out.println("a small fruit");
//            break;
//        default:
//            System.out.println("Please enter a valid fruit");
//    }

//
        int day = in.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }

    }
}