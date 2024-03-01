package Basics;

public class Scope {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        String name = "Ankit";

        System.out.println(a);

        // Block Scope
        {
            // int a = 75; already initializes outside this block, cannot re-initialise
            a = 75; // re-assign the origin ref variable to some other value
            name = "Akshay";

            int c = 33;

        }
        System.out.println(a);
        // System.out.println(c); cannot use outside the Block scope
        System.out.println(name);
    }
}
