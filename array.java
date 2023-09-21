import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;
        number[2] = 4;
        number[3] = 6;
        number[4] = 9;

        // string array
        String[] names = { "alia", "varun", "charile", "akhil" };
        for (String p : names) {
            for (int n : number) {
                System.out.println(p + " " + n);

            }
        }

    }
}
