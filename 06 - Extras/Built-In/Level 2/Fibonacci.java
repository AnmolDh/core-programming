import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int terms = takeInput("Enter the number of terms in the Fibonacci sequence: ");
        generateFibonacci(terms);
    }

    public static int takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");
        
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
