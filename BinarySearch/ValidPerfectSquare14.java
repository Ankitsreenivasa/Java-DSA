package BinarySearch;

// https://leetcode.com/problems/valid-perfect-square/description/

/*Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt. */
public class ValidPerfectSquare14 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }

    public static boolean isPerfectSquare(int num) {
        int i = 1;
        // Keep iterating loop check perfectsquare and limit in the condition.
        while (i * i != num && i * i < num && i < num) {
            i++;
        }
        return i * i == num;
    }
}
