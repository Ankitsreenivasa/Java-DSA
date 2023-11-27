package BinarySearch;

public class OrderAgnosticBS13 {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};

        int key=3;

        orderAgnosticBinarySearch(arr, key);
    }

    static void orderAgnosticBinarySearch(int arr[], int key){
        if (arr[0]<arr[arr.length-1]) {
            System.out.println(ascOrder(arr, key));
        }
        else{
            System.out.println(descOrder(arr,key));
        }
        
        
    }

    private static int ascOrder(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2; // OR (start + end) / 2
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;

    }

    private static int descOrder(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2; // OR (start + end) / 2
            if (key > arr[mid]) {
                end = mid - 1;
            } else if (key < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;

    }

    
}



