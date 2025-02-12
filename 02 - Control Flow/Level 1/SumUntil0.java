import java.util.*;

class SumUntil0{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    double sum = 0.0;

    while (num != 0){
      sum += num;
      num = sc.nextInt();
    }

    System.out.println(sum);
  }
}