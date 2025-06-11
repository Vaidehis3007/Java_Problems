package vi.functions;

public class Shadowing {
    static int x=70; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //70
        int x=50; // scope will begin when value is initialised
        System.out.println(x); //40
        fun();
    }
    static void fun(){

        System.out.println(x);
    }
}
