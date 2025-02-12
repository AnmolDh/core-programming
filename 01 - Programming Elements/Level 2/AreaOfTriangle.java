import java.util.*;

class AreaOfTriangle{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double base = sc.nextDouble();
    double height = sc.nextDouble();

    double areaCm = 0.5 * base * height;

    final double inchInFoot = 12;
    final double cmInInch = 2.54;

    double areaFoot = areaCm / cmInInch / inchInFoot;
    double areaInch = areaCm / cmInInch;

    System.out.printf("Area in cm is %.2f while in feet is %.2f and inches is %.2f", areaCm, areaFoot, areaInch);
  }
}