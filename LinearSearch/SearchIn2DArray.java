package LinearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                { 21, 4, 17 },
                { 54, 8 },
                { 23, 67, 19, 180, 321 },
                { 18, 22 }
        };

        int key = 67;

        System.out.println(search2D(arr2D, key));

    }

    static int search2D(int[][] arr2D, int key) {
        if (arr2D.length == 0) {
            return -1;
        }

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                if (key == arr2D[row][col]) {
                    System.out.println("Key found at index " + row + "," + col);
                    return 0;
                }
            }
            System.out.println();
        }

        return -1;
    }
}
