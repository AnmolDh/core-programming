class CalcProfit{
  public static void main(String[] args){
    int cost = 129;
    int sellingPrice = 191;

    int profit = sellingPrice - cost;
    double profitPercent = ((double)profit/cost)*100;

    System.out.println("The Cost Price is INR " + cost + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
  }
}