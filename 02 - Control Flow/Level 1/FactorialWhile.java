import java.util.*;

class FactorialWhile{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int sum = 1;
    int i = 1;

    while (i <= num){
	sum *= i;
	i++;
    }

    System.out.println(sum);
  }
}