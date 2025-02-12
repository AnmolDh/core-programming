import java.util.Scanner;

class NaturalSum {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return sumRecursive(n-1) + n;
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        int sumRecursive = sumRecursive(n);

        int sumFormula = sumFormula(n);

        System.out.println("Sum of first " + n + " natural numbers recursive: " + sumRecursive);
        System.out.println("Sum of first " + n + " natural numbers formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results are equal.");
        } else {
            System.out.println("The results do not match.");
        }
    }
}
