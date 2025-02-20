import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative approach to check if text is palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive approach to check if text is palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays to check if text is palindrome
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();

        // Checking palindrome using Logic 1 (Iterative)
        if (isPalindromeIterative(inputString)) {
            System.out.println("The text is a palindrome (Iterative check).");
        } else {
            System.out.println("The text is not a palindrome (Iterative check).");
        }

        // Checking palindrome using Logic 2 (Recursive)
        if (isPalindromeRecursive(inputString, 0, inputString.length() - 1)) {
            System.out.println("The text is a palindrome (Recursive check).");
        } else {
            System.out.println("The text is not a palindrome (Recursive check).");
        }

        // Checking palindrome using Logic 3 (Using char arrays)
        if (isPalindromeUsingCharArray(inputString)) {
            System.out.println("The text is a palindrome (Char array check).");
        } else {
            System.out.println("The text is not a palindrome (Char array check).");
        }

        scanner.close();
    }
}
