import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Date format 1: dd/MM/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Current date (dd/MM/yyyy): " + currentDate.format(formatter1));

        // Date format 2: yyyy-MM-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date (yyyy-MM-dd): " + currentDate.format(formatter2));

        // Date format 3: EEE, MMM dd, yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Current date (EEE, MMM dd, yyyy): " + currentDate.format(formatter3));
    }
}
