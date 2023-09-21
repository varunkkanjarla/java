import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // creating switch statement in java
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");

                break;
            case 2:
                System.out.println("hii");
                break;
            case 3:
                System.out.println("bye");
                break;
            case 4:
                System.out.println("gooodbye");
                break;

            default:
                System.out.println("invalid");
                break;
        }

    }
}
