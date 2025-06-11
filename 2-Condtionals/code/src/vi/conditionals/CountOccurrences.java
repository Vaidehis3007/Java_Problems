package vi.conditionals;

import java.util.*;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println("Enter a number - ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Number of occurrences to be checked for - ");
        Scanner a = new Scanner(System.in);
        int m = a.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == m){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
