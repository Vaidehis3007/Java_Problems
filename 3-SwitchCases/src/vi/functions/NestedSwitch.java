package vi.functions;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID) {
            case 1:
                System.out.println("Vaidehi Sahu");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department choosen");
                        break;
                }
                break;
            default:
                System.out.println("ENter correct EMP");
        }
    }
}
