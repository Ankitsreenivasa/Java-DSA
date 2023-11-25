package BinarySearch;

import java.util.Arrays;

public class binarySearchMethod12 {
    public static void main(String[] args) {
        // UnSorted Array
        int[] arr = { 56, 66, 11, 12, 13, 10, 45, 23, 34, };
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        // Sorting the Array
        Arrays.sort(arr);

        String nums = Arrays.toString(arr);
        System.out.println("Sorted Array : " + nums);

        int key = 45;

        int index = Arrays.binarySearch(arr, key);

        System.out.println("Element found at index " + index);
    }
}
