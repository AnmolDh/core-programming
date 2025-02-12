import java.util.*;

class Calculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float num1 = sc.nextInt();
    float num2 = sc.nextInt();

    float addition = num1 + num2;
    float subtraction = num1 - num2;
    float multiply = num1 * num2;
    float divide = num1 / num2;

    System.out.println(String.format("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f", num1, num2, addition, subtraction, multiply, divide));
  }
}