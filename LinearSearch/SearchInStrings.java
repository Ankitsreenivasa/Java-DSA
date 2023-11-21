package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Fortunex";
        char key = 'x';
        System.out.println(stringSearch(str, key));

        // In Range
        System.out.println("---Search in Range---");
        System.out.println(stringSearchRange(str, key));

    }

    static boolean stringSearch(String str, char key) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                System.out.println("Key Found at " + i);
                return true;

            }
        }

        return false;
    }

    static boolean stringSearchRange(String str, char key) {
        if (str.length() == 0) {
            return false;
        }

        int start = 1;
        int end = 7;

        for (int i = start; i <= end; i++) {
            if (str.charAt(i) == key) {
                System.out.println("Key Found at " + i);
                return true;

            }
        }

        return false;
    }
}
