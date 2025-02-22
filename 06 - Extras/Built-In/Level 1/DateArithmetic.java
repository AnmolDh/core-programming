import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 2, 22);

        LocalDate newDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting 3 weeks
        newDate = newDate.minusWeeks(3);

        System.out.println("Original date: " + inputDate);
        System.out.println("After adding 7 days, 1 month, 2 years, and subtracting 3 weeks: " + newDate);
    }
}
