import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Weight must be positive! Enter again: ");
                personData[i][0] = scanner.nextDouble();
            }
            
            System.out.print("Enter height for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Height must be positive! Enter again: ");
                personData[i][1] = scanner.nextDouble();
            }

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Person | Weight | Height | BMI | Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d: %.2f kg | %.2f m | %.2f | %s\n", 
                              i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
