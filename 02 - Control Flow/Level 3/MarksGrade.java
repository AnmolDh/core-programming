import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double physics = scanner.nextDouble();
        double chemistry = scanner.nextDouble();
        double maths = scanner.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;

        String grade;
        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else if (percentage >= 40){
          grade = "E";
        } else {
            grade = "R";
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (grade.equals("A")) {
            System.out.println("Remarks: Level 4.");
        } else if (grade.equals("B")) {
            System.out.println("Remarks: Level 3.");
        } else if (grade.equals("C")) {
            System.out.println("Remarks: Level 2.");
        } else if (grade.equals("D")) {
            System.out.println("Remarks: Level 1.");
        } else if (grade.equals("E")) {
            System.out.println("Remarks: Level 1 - LOW.");
        } else{
          System.out.println("Remarks: Remedial.");
        }

        scanner.close();
    }
}
