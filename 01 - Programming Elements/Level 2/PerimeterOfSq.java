import java.util.*;

class PerimeterOfSq{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double perimerter = sc.nextDouble();

    double length = perimerter / 4;

    System.out.printf("The length of the side is %.2f whose perimeter is %.2f", length, perimerter);
  }
}