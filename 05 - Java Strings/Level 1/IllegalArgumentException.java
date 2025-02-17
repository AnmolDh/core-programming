import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateIllegalArgumentException(String str, int start, int end) {
        // Using substring() with start index greater than the end index will throw IllegalArgumentException
        System.out.println(str.substring(start, end)); // This will throw IllegalArgumentException
    }

    public static void handleIllegalArgumentException(String str, int start, int end) {
        try {
            generateIllegalArgumentException(str, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for string and indices
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Call method to generate the exception
        generateIllegalArgumentException(userInput, startIndex, endIndex);

        // Call method to handle the exception
        handleIllegalArgumentException(userInput, startIndex, endIndex);
    }
}
