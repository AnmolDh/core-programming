import java.util.Scanner;

public class DigitFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] digits = new int[10];
        while (num > 0) {
            int digit = num % 10;
            digits[digit]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println(i + ": " + digits[i]);
            }
        }
    }
}
