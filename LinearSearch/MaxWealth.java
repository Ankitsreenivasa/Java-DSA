package LinearSearch;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int customer = 0; customer < accounts.length; customer++) {
            int sum = 0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                sum = sum + accounts[customer][bank];

            }
            if (sum > ans) {
                ans = sum;

            }

        }
        return ans;
    }
}
