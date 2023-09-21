import java.util.Arrays;

public class string {
    public static void main(String[] agrs) {

        // string declaretion
        String n = "hello";
        String site = new String("varun kumar");
        System.out.println(site);
        System.out.println(n);

        // adding two strings
        System.out.println(site + " " + n);

        // making new string from substring of already existing string
        String new_n = n.substring(1, 3);
        System.out.println(new_n);
        System.out.println(new_n.equals(n));

    }
}
