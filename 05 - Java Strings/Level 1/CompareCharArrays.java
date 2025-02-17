import java.util.*;

public class CompareCharArrays {

    public static char[] getCharactersFromString(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the string to extract characters: ");
        String str = scanner.next();

        // Get characters from the string using custom method and built-in toCharArray()
        char[] userDefinedCharArray = getCharactersFromString(str);
        char[] builtInCharArray = str.toCharArray();

        // Compare the two char arrays
        System.out.println("Comparison of char arrays: " + Arrays.equals(userDefinedCharArray, builtInCharArray));
    }
}
