package vi.functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "cat";
        {
            a= 78; //reassigned the original ref variable to some other value
            int c = 99;
            name = "dog";
            //values initialised in this block will remain in this block
        }
        // System.out.println(c); cannot be used outside the block
        System.out.println(a);
        System.out.println(name);

        for(int i=0; i<10; i++){
            System.out.println(i);
        }

    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
