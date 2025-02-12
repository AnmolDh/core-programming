import java.util.Scanner;

class SumOfNatural {

    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = findSumOfNaturalNumbers(N);

        System.out.println("The sum of first " + N + " natural numbers is: " + sum);
    }
}
