public class array2d {
    public static void main(String[] args) {
        // one dimension array
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 9;
        arr[4] = 7;

        System.out.println("element at index 0: " + arr[0]);
        System.out.println("element at index 1: " + arr[1]);
        System.out.println("element at index 2: " + arr[2]);
        System.out.println("element at index 3: " + arr[3]);
        System.out.println("element at index 4: " + arr[4]);

        // two dimension array
        int arra[][] = { { 2, 3, 1 }, { 3, 6, 1 }, { 7, 5, 1 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arra[i][j] + " ");
            }
            System.out.println();
        }

    }
}
