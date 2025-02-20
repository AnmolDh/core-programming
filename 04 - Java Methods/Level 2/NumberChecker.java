import java.util.Scanner;

public class NumberChecker {

    public static String isPositive(int number) {
        return number >= 0 ? "positive" : "negative";
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            String positivity = isPositive(num);
            System.out.println("The number " + num + " is " + positivity);

            if (positivity.equals("positive")) {
                String evenOrOdd = isEven(num);
                System.out.println("The number " + num + " is " + evenOrOdd);
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
