import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the string for substring: ");
        String str = scanner.next();
        System.out.print("Enter the start index for substring: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index for substring: ");
        int end = scanner.nextInt();

        // Create substring using charAt() and built-in substring()
        String charAtSubstring = createSubstringUsingCharAt(str, start, end);
        String builtInSubstring = str.substring(start, end);

        // Output results
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using built-in substring() method: " + builtInSubstring);
        System.out.println("Are the substrings equal? " + charAtSubstring.equals(builtInSubstring));
    }
}
