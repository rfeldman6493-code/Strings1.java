import java.util.Scanner;
import java.text.DecimalFormat;

public class Strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Ask for user input
        System.out.print("Enter employee’s name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = sc.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = sc.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = sc.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = sc.nextDouble();

        // Calculations
        double grossPay = hours * payRate;
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        // Output payroll statement
        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + df.format(hours));
        System.out.println("Pay Rate: $" + df.format(payRate));
        System.out.println("Gross Pay: $" + df.format(grossPay));
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + df.format(federalTaxRate * 100) + "%): $" + df.format(federalWithholding));
        System.out.println("  State Withholding (" + df.format(stateTaxRate * 100) + "%): $" + df.format(stateWithholding));
        System.out.println("  Total Deduction: $" + df.format(totalDeduction));
        System.out.println("Net Pay: $" + df.format(netPay));
    }
}
