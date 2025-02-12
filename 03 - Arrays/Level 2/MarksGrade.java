import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + " in Physics: ");
            marks[i][0] = scanner.nextDouble();
            System.out.print("Enter marks for student " + (i + 1) + " in Chemistry: ");
            marks[i][1] = scanner.nextDouble();
            System.out.print("Enter marks for student " + (i + 1) + " in Maths: ");
            marks[i][2] = scanner.nextDouble();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d | %.2f | %.2f | %.2f | %.2f%% | %s\n", 
                              i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
