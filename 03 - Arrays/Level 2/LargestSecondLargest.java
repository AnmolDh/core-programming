import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int[] digits = new int[10];
        int index = 0;

        while (num > 0) {
            digits[index] = num % 10;
            num = num / 10;
            index++;

            if (index == digits.length) {
                int[] temp = new int[digits.length + 10];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
