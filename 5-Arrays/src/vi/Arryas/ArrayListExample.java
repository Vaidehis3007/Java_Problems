package vi.Arryas;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(63);
//        list.add(65);
//        list.add(16);
//        list.add(28);
//        list.add(746875);

//        System.out.println(list.contains(65));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        //input
        for(int i=0;i<10;i++){
            list.add(in.nextInt());
        }

        // get item at any index
        for(int i=0;i<10;i++){
            System.out.println(list.get(i));  // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);
    }
}
