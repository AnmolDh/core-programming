import java.util.*;

class CalcHandshake{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int nosStudents = sc.nextInt();

    int possibleHandshakes = nosStudents * (nosStudents - 1) / 2;

    System.out.println(possibleHandshakes);
  }
}