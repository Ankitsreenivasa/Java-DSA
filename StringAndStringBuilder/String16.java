package StringAndStringBuilder;

public class String16 {
    public static void main(String[] args) {
        // Strings are immutable
        String str1 = "Ankit";
        String str2 = "Ankit";

        // == (checks whether they are pointing to the same object)
        System.out.println(str1 == str2);

        // Creating different object for the same value
        String name1 = new String("tata");
        String name2 = new String("tata");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));// Only checks whether both the values are equal

    }
}
