public class function {
    public static int add(int a, int b) {
        // function overriding
        int result = a + b;
        return result;
    }

    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public static int add(int a, int b, int c) {
        int result = a + b + c;
        return result;

    }

    public static void main(String[] args) {
        int sum1 = add(2, 3);
        System.out.println(sum1);
        double sum2 = add(3, 4);
        System.out.println(sum2);
        int sum3 = add(4, 5, 2);
        System.out.println(sum3);
    }
}
