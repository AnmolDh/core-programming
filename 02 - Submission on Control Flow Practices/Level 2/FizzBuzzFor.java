import java.util.Scanner;

public class FizzBuzzFor {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int num = scanner.nextInt();

      for (int i = 1; i <= num; i++) {
          if (i % 3 == 0 && i % 5 == 0) {
              System.out.println("FizzBuzz");
          } else if (i % 3 == 0) {
              System.out.println("Fizz");
          } else if (i % 5 == 0) {
              System.out.println("Buzz");
          } else {
              System.out.println(i);
          }
      }

      scanner.close();
  }
}
