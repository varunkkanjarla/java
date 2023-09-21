import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("your name :" + name);
        scanner.close();
    }
}