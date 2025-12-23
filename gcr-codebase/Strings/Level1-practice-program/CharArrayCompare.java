import java.util.Scanner;

public class CharArrayCompare {

    //  Convert String to char array WITHOUT toCharArray()
    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] a1, char[] a2) {

        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();   

        // Call user-defined method
        char[] userArray = getChars(str);

        // Call built-in method
        char[] builtInArray = str.toCharArray();

        // Compare both arrays
        boolean result = compareArrays(userArray, builtInArray);

        // Display result
        System.out.println("Are both character arrays same? " + result);

        sc.close();
    }
}
