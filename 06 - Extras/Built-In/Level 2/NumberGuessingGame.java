import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        int guess;
        String feedback = "";
        
        System.out.println("Think of a number between 1 and 100. The computer will try to guess it.");
        
        while (!feedback.equals("correct")) {
            guess = generateGuess(low, high);
            System.out.println("Is the number " + guess + "? (high/low/correct)");
            feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        System.out.println("Yay! The computer guessed your number.");
    }

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
}
