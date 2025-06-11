package vi.Arryas;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        changes(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void changes(int[] arr){
        arr[1] = 99;
    }
}
