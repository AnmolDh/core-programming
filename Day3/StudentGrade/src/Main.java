import java.util.*;

public class Main {
    static void printStudents(ArrayList<Student> students){
        System.out.println();
        System.out.println("Results!!");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.print(s.getName() + ":     ");
            System.out.println((s.getResult()));
        }
    }

    static void printBoundGrade(ArrayList<Student> students){
        Student[] boundGrade = Student.getBoundStudents(students);
        System.out.println();
        System.out.println("Minimum Grade Scored:");
        System.out.println(boundGrade[0].getName() + " has " + boundGrade[0].getGrade() + "%");

        System.out.println("Maximum Grade Scored:");
        System.out.println(boundGrade[1].getName() + " has " + boundGrade[1].getGrade() + "%");
    }

    static void printGradeFrequency(HashMap<Double, Integer> hashmap){
        System.out.println();
        System.out.println("Grade Frequency:");
        for (double key : hashmap.keySet()){
            System.out.println(key + ": " + hashmap.get(key));
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<Student>();
//        CustomLinkedList<Student> students = new CustomLinkedList<>();

        while (n > 0) {
            System.out.print("Enter the student name: ");
            String name = sc.next();
            int[] marks = new int[3];
            System.out.print("Enter the " + name + "'s Physics Marks: ");
            marks[0] = sc.nextInt();
            System.out.print("Enter the " + name + "'s Chemistry Marks: ");
            marks[1] = sc.nextInt();
            System.out.print("Enter the " + name + "'s Maths Marks: ");
            marks[2] = sc.nextInt();

            Student s = new Student();
            s.setName(name);
            s.setSubjectMarks(marks);
            students.add(s);
            n--;
        }

        Student.removeDuplicateStudents(students);

        printStudents(students);
        printBoundGrade(students);
        printGradeFrequency(Student.GradeFrequency(students));

    }
}