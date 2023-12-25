package BinarySearch;

public class CeilingOfNumber15 {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 13, 23, 34, 45, 56, 66 };
        int key = 44;

        int index = BinarySearch(arr, key);

        System.out.println("Ceiling : " + index);
    }

    static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2; // OR (start + end) / 2
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else if (key == arr[mid]) {
                return mid;
            }

        }

        return start;

    }
}
