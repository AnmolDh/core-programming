import java.util.*;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        int employees = 10;
        double[][] employeeData = generateEmployeeData(employees);
        double[][] newSalaries = calculateBonus(employeeData);
        displayResults(employeeData, newSalaries);
    }

    public static double[][] generateEmployeeData(int employees) {
        Random random = new Random();
        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + random.nextInt(90000);
            data[i][1] = 1 + random.nextInt(10);
        }

        return data;
    }

    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] newData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            newData[i][0] = salary + bonus;
            newData[i][1] = bonus;
        }

        return newData;
    }

    public static void displayResults(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s%n", "ID", "Old Sal", "Years", "Bonus", "New Sal", "Total Bonus");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("%-5d %-10.2f %-10.0f %-10.2f %-10.2f%n",
                    i + 1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-10s %-10.2f %-10.2f%n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }
}

