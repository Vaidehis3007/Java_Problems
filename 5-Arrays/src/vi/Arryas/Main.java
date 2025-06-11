package vi.Arryas;

public class Main {
    public static void main
            (String[] args) {
        // Q: store a roll number
        int a = 21;

        //syntax of an array -
        // datatype[] variable_name = new datatype[size];

//        int[] rnos;
//        rnos = new int[5];
//        System.out.println(rnos[1]);

        String[] arr = new String[5];
        System.out.println(arr[0]);

        for (String element : arr){
            System.out.println(element);
        }
    }
}