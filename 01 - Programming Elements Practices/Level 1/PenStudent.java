class PenStudent{
  public static void main(String[] args){
    int pens = 14;
    int students = 3;

    int pensStudentGets = pens / students;
    int undistributedPens = pens % students;

    System.out.println("The Pen Per Student is " + pensStudentGets + " and the remaining pen not distributed is " + undistributedPens);
  }
}