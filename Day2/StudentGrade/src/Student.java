import java.util.ArrayList;

public class Student implements IStudent {
    String name;
    int[] marks = new int[3];

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int[] getSubjectMarks(){
        return marks;
    }

    @Override
    public void setSubjectMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public double getGrade(){
        return ((this.marks[0] + this.marks[1] + this.marks[2])/300.0)*100;
    }

    @Override
    public String getResult() {
        double grade = getGrade();
        if (grade > 75) {
            return "Distinction";
        } else if (grade > 40) {
            return "Pass";
        }
        return "Failed";
    }

    public static Student[] getBoundStudents(ArrayList<Student> students){
        double minimumGrade = 101;
        double maximumGrade = -1;

//        String minimumGradeStudent = null;
        Student[] boundGrade = new Student[2];

        for (Student student : students){
            double grade = student.getGrade();
            if (minimumGrade > grade){
                minimumGrade = grade;
                boundGrade[0] = student;
            }
            if (maximumGrade < grade){
                maximumGrade = grade;
                boundGrade[1] = student;
            }
        }
        return boundGrade;
    }
}
