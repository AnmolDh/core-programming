import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int num = takeInput("Enter a number to calculate its factorial: ");
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    public static int takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
