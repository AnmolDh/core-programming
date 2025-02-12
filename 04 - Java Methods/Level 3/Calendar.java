import java.util.Scanner;

class Calendar {
    static String[] months = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };
    
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1]; 
    }
  
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + (31 * m) / 12) % 7;
        return d;
    }

    public static String getMonthName(int month) {
        return months[month - 1];
    }
  
    public static void printCalendar(int month, int year) {
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); 
            }
        }
        
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        printCalendar(month, year);
        
        scanner.close();
    }
}
