package LinearSearch;

public class LinearSearch05 {
    public static void main(String[] args) {
        int[] arr = { 12, 434, 46, 76, 8, 88, 112 };
        int key = 8;

        System.out.println("---Linear search---");
        linearSearch(arr, key);
    }

    static void linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key Found at index " + i);
                break;
            } 
            
        }
    }

}
