import java.util.*;

class RocketLaunchWhile{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int temp = num;

    while (temp >= 0){
      System.out.print(temp + "... ");
      temp--;
    }
  }
}