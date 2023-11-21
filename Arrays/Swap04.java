package Arrays;

public class Swap04 {
    public static void main(String[] args) {
        int[] arr = { 10, 43, 46, 100, 8, 88 };

        System.out.println("Max Val : " + max(arr));
        System.out.println("Max Val in Range : " + maxInRange(arr, 1, 2));
    }

    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int maxInRange(int[] arr, int ind1, int ind2) {

        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];

        for (int i = ind1; i <= ind2; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
