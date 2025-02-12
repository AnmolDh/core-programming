import java.util.*;

class QuotientReminder{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();

    double quotient = num1 / num2;
    double reminder = num1 % num2;

    System.out.printf("The Quotient is %.2f and Reminder is %.2f of two number %.2f and %.2f", quotient, reminder, num1, num2);
  }
}