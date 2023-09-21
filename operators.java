import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        // input of a and b for arithmetic operations
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value a:");
        int a = scanner.nextInt();
        System.out.println("enter value b:");
        int b = scanner.nextInt();
        scanner.close();

        // arithmetic add sub mul div mod
        System.out.println("addition is:" + (a + b));
        System.out.println("subtraction is:" + (a - b));
        System.out.println("multiplication is:" + (a * b));
        System.out.println("division is:" + (a / b));

        // comparions [boolean expression]
        System.out.println(a > b);

        // assignment operator ; = ; += ; -= ; /= ; *= ; %= ;
        int x = 10;
        x -= 20;
        System.out.println(x);

        // logical operators ; or ; and ;

    }

}
