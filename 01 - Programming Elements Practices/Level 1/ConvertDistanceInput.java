import java.util.*;

class ConvertDistanceInput{
  public static void main(String[] args){
    final double kmInMile = 1.6;
    Scanner sc = new Scanner(System.in);

    double kms = sc.nextInt();

    double totalMiles = kms * kmInMile;

    System.out.println(String.format("The total miles is %.2f mile for the given %.2f km", totalMiles, kms));
  }
}