package Arrays;

import java.util.*;

public class Java03 {
    public static void main(String[] args) {
        int[] arr = { 12, 434, 46, 76, 8, 88 };
        swap(arr, 3, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
