import java.util.*;

class DoubleOp{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    System.out.printf("%.2f, %.2f, %.2f, %.2f", a + b *c, a * b + c, c + a / b, a % b + c);
  }
}