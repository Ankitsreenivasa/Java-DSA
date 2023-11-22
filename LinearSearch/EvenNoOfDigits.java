package LinearSearch;

import java.util.*;

public class EvenNoOfDigits {

    public static void main(String[] args) {
        int[] nums = { 7, 43, 230, 640993, 65, 321 };

    }

    static int findNum(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (even(i)) {
                count++;
            }
        }

        return count;

    }

    // To check a no. contains even no. of digits
    static boolean even(int i) {
        int numOfDigits = countDigits(i);

        if (numOfDigits % 2 == 0) {
            return true;
        }

        return false;
    }

    // count no. of digits in a no.
    static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

}
