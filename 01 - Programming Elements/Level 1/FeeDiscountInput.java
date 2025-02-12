import java.util.*;

class FeeDiscountInput{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int fee = sc.nextInt();
    int discount = sc.nextInt();

    int discountedAmount = fee / discount;
    int finalFee = fee - discountedAmount;

    System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + finalFee);
  }
}