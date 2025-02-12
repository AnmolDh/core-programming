import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amarAge = scanner.nextInt();
        int amarHeight = scanner.nextInt();

        int akbarAge = scanner.nextInt();
        int akbarHeight = scanner.nextInt();

        int anthonyAge = scanner.nextInt();
        int anthonyHeight = scanner.nextInt();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = (youngestAge == amarAge) ? "Amar" :
                                (youngestAge == akbarAge) ? "Akbar" : "Anthony";

        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" :
                               (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }
}
