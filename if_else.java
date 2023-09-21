import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        // input of variable x for operation
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value x:");
        int x = scanner.nextInt();

        // declare if statement
        if (x > 0) {
            System.out.println("x is positive");
        }

        // else if statement declared
        else if (x < 0) {
            System.out.println("x is negative");
        }

        // else statement declared
        else {
            System.out.println("x is zero");
        }

    }

}
