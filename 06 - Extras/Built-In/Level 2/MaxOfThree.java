import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args) {
        int num1 = takeInput("Enter the first number: ");
        int num2 = takeInput("Enter the second number: ");
        int num3 = takeInput("Enter the third number: ");

        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }

    public static int takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        return max;
    }
}
