import java.util.ArrayList;

public interface IStudent {
    String getName();
    void setName(String name);
    String getResult();
    void setSubjectMarks(int[] marks);
    int[] getSubjectMarks();
    double getGrade();
}
