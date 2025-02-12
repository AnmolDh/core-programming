import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int count = 0;
        int tempNum = num;
        while (tempNum > 0) {
            count++;
            tempNum /= 10;
        }
        
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
