import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height for friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println("The youngest friend is: Friend " + (youngestIndex + 1) + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: Friend " + (tallestIndex + 1) + " with height " + heights[tallestIndex]);
    }
}
