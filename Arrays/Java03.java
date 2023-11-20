package Arrays;

import java.util.*;

//Swapping Elements
public class Java03 {
    public static void main(String[] args) {
        int[] arr = { 12, 434, 46, 76, 8, 88, 112 };
        // Swapping Elements
        System.out.println("---Swapping Elements---");
        swap(arr, 3, 0);
        System.out.println(Arrays.toString(arr));

        System.out.println("---Reversing Array---");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
