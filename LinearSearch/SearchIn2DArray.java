package LinearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 21, 4, 17 },
                { 54, 8 },
                { 23, 67, 19, 180, 321 },
                { 18, 22 }
        };

        int key = 67;

        System.out.println(search2D(arr, key));

    }

    static int search2D(int[][] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        return -1;
    }
}
