import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the conversion option:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double fahrenheit = takeInput("Enter temperature in Fahrenheit: ");
            System.out.println(fahrenheit + "°F is " + fahrenheitToCelsius(fahrenheit) + "°C");
        } else if (choice == 2) {
            double celsius = takeInput("Enter temperature in Celsius: ");
            System.out.println(celsius + "°C is " + celsiusToFahrenheit(celsius) + "°F");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
