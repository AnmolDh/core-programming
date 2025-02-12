class FeeDiscount{
  public static void main(String[] args){
    int fee = 125000;
    int discount = 10;

    int discountedAmount = fee / discount;
    int finalFee = fee - discountedAmount;

    System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + finalFee);
  }
}