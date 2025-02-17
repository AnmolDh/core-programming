import java.util.Scanner;

public class CompareStringsUsingCharAt {
    
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();
        
        boolean comparisonResult = compareStringsUsingCharAt(str1, str2);
        
        System.out.println("Comparison using charAt(): " + comparisonResult);
        System.out.println("Comparison using equals() method: " + str1.equals(str2));
    }
}
