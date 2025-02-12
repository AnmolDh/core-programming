import java.util.Scanner;

class YoungestTallest {

    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";
        
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        
        if (ages[2] < minAge) {
            youngest = "Anthony";
        }
        
        return youngest;
    }

    public static String findTallest(int[] heights) {
        int maxHeight = heights[0];
        String tallest = "Amar";
        
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        
        if (heights[2] > maxHeight) {
            tallest = "Anthony";
        }
        
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i == 0 ? "Amar" : i == 1 ? "Akbar" : "Anthony") + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i == 0 ? "Amar" : i == 1 ? "Akbar" : "Anthony") + ": ");
            heights[i] = scanner.nextInt();
        }

        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);
        
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
