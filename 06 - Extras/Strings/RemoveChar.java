import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char charToRemove = scanner.next().charAt(0);

        String result = str.replaceAll(String.valueOf(charToRemove), "");

        System.out.println("Modified String: " + result);
    }
}
