package vi.functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       swap(a,b);
        System.out.println("a = "+a+", b = "+b);

        String name = "Vaidehi";
        changeName(name);
        System.out.println(name);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }


    static void changeName(String naam){
        naam = "Sahu";
    }
}
