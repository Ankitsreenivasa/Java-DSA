package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Ankit";
        char key = 'i';
        System.out.println(stringSearch(str, key));

    }

    static boolean stringSearch(String str, char key) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==key) {
                System.out.println("Key Found at "+ i);
                return true;
                
            }
        }

        return false;
    }
}
