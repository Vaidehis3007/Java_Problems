package vi.Arryas;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        //int[] arr = new int[5];
//        arr[0]=23;
//        arr[1]=24;
//        arr[2]=25;
//        arr[3]=26;
//        arr[4]=27;
//        System.out.println(arr[3]);

//        //input using for loops
//        for(int i=0;i<=arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//
//        //printing an array
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
//
//        //for-each loop
//        for(int num : arr){ //for every element in array, print the element
//            System.out.println(num + " "); //here num represents elements of the array
//        }

//        System.out.println(arr[5]);  // index out of bound

        // array of objects
        String[] str  = new String[4];
        for(int i = 0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "ved";
        System.out.println(Arrays.toString(str));
    }
}
