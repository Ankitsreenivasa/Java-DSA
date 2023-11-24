package LinearSearch;

import java.util.*;

public class EvenNoOfDigits10 {

    public static void main(String[] args) {
        int[] nums = { 7, 43, -2030, 640993, 65, 321 };

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }

        return count;

    }

    // To check a no. contains even no. of digits
    static boolean even(int num) {
        int numOfDigits = countDigits(num);

        if (numOfDigits % 2 == 0) {
            return true;
        }

        return false;
    }

    // count no. of digits in a no.
    static int countDigits(int num) {
        int count = 0;

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;

        }

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

}
