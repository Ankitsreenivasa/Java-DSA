package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Java01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of no.:");
        int n = input.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("---For Loop---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---For Each Loop---");
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("---Array class---");
        System.out.println(Arrays.toString(arr));

        System.out.println("---2D Array---");
        int arr2D[][]=new int[3][3];
        System.out.println("No of rows :"+arr2D.length);

        //input
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col]=input.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("---Enhanced ForLoop---");
        System.out.println("---1---");
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }
        System.out.println("---2---");
        for (int[] is : arr2D) {
            System.out.println(Arrays.toString(is));
        }
    }
}
