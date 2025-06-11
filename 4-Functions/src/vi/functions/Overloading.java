package vi.functions;

public class Overloading {
    public static void main(String[] args) {
//        fun(6);
//        fun("Vaidehi");
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}
