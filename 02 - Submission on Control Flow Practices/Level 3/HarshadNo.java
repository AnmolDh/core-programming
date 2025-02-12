import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
