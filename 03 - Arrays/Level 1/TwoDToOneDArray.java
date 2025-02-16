import java.util.*;

public class TwoDToOneDArray {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

       // Creating a 2D array (Matrix)
       int[][] matrix = new int[rows][cols];

       System.out.println("Enter the elements of the matrix:");
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               matrix[i][j] = sc.nextInt();
           }
       }

       // Creating a 1D array of size (rows * cols)
       int[] array = new int[rows * cols];
       int index = 0; // Index for the 1D array

       // Copying elements from the 2D array to the 1D array
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               array[index++] = matrix[i][j];
           }
       }

       System.out.println("The 1D array after copying from the 2D matrix:");
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();

    }
}