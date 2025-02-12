import java.util.Scanner;

class SpringSeason {

  public static boolean checkSpringSeason(int month, int day) {
        if (month > 3 && month < 6) {
            return true;
        } else if (month == 3 && day >= 20) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();

        boolean isSpring = checkSpringSeason(month, day);

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
