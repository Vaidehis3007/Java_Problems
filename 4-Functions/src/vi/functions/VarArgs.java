package vi.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        function(3,4,5,67,8,9,6,4);
//        multiple(2,3,"cat","dog");
        //demo(1,2,3,4,5,6,7,8,9);
        demo("Hello", "World", "Vaidehi");
    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
    }

    private static void demo(String ...v){      // will take array of integers
        System.out.println(Arrays.toString(v));
    }

}
