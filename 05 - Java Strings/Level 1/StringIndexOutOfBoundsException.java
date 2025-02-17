import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void generateStringIndexOutOfBoundsException(String str) {
        // Trying to access an index beyond the length of the string
        System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            generateStringIndexOutOfBoundsException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call method to generate the exception
        generateStringIndexOutOfBoundsException(userInput);
        
        // Call method to handle the exception
        handleStringIndexOutOfBoundsException(userInput);
    }
}
