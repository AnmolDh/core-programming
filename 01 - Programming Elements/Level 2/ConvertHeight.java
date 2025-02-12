import java.util.*;

class ConvertHeight{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    
    final double inchInFoot = 12;
    final double cmInInch = 2.54;

    double heightInFoot = height / cmInInch / inchInFoot;
    double heightInInch = height / cmInInch;

    System.out.println(String.format("Your Height in cm is %d while in feet is %.2f and inches is %.2f", height, heightInFoot, heightInInch));
  }
}