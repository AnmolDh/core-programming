import java.util.*;

class SumOfNaturalFor{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int sum = 0;

    for (int i = 1; i <= num; i++){
	sum += i;
    }

    int nsum = num * (num-1) / 2;

    if (nsum == sum){
      System.out.println("equal");
    }

    System.out.println(sum);
  }
}