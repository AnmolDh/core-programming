import java.util.Scanner;

class Rounds {
    public static double calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3;
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        double rounds = calculateRounds(side1, side2, side3, 5000);

        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");
    }

}
