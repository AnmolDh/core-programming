import java.util.*;

class CanVote{
  public static int[] generateRandomAge(){
    Random r = new Random();
    int[] ages = new int[10];
    for (int i = 0; i < 10; i++){
      ages[i] = r.nextInt(60);
    }
    return ages;
  }

  public static boolean isEligible(int age){
    return age >= 18;
  }

  public static String[][] generateEligibility(int[] ages){
    String[][] eligible = new String[10][2];

    for (int i = 0; i < ages.length; i++){
      if (isEligible(ages[i])){
        eligible[i][0] = String.valueOf(ages[i]);
        eligible[i][1] = "true";
      } else{
        eligible[i][0] = String.valueOf(ages[i]);
        eligible[i][1] = "false";
      }
    }
    return eligible;
  }

  public static void display(String[][] eligible){
    System.out.println("------------------");
    System.out.println("| age | eligible |");
    System.out.println("------------------");
    
    for (int i = 0; i < eligible.length; i++){
      System.out.printf("| %-3s | %-8s |\n", eligible[i][0], eligible[i][1]);
    }
  }

  public static void main(String[] args){
    int[] randomAges = generateRandomAge();
    String[][] eligible = generateEligibility(randomAges);

    display(eligible);
  }
}