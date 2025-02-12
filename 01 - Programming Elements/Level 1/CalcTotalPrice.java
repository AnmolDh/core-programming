import java.util.*;

class CalcTotalPrice{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int unitPrice = sc.nextInt();
    int quantity = sc.nextInt();

    int total = unitPrice * quantity;

    System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d", unitPrice, quantity, total);
  }
}