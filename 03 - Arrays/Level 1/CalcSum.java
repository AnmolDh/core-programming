import java.util.Scanner;

public class CalcSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (enter 0 or negative to stop): ");
            double number = scanner.nextDouble();
            
            if (number <= 0 || index == 10) {
                break;
            }
            numbers[index] = number;
            total += number;
            index++;
        }

        System.out.println("Sum of all entered numbers: " + total);
    }
}
