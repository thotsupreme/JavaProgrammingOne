//Peyton Annett
package Chapter4;

import java.util.Scanner;

/**
 * Program to display payroll
 *
 * @author Peyton Annett
 */
//4.23 payroll

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get information
        System.out.println("Enter employee's name: ");
        String name = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double feds = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double state = input.nextDouble();

        //Use information
        double gross = hours * payRate;
        double fedTax = feds * gross;
        double fedTaxRate = feds * 100;
        double stateTax = state * gross;
        double stateTaxRate = state * 100;
        double totalTax = fedTax + stateTax;
        double net = gross - totalTax;

        //Final Output
        System.out.printf("Employee Name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hours);
        System.out.printf("\nPay Rate: $%.2f", payRate);
        System.out.printf("\nGross Pay: $%.2f", gross);
        System.out.printf("\nDeductions: ");
        System.out.printf("\nFederal Withholding(%.2f%%):$%.2f", fedTaxRate, fedTax);
        System.out.printf("\nState Withholding(%.2f%%):$%.2f", stateTaxRate, stateTax);
        System.out.printf("\nTotal Deduction: $%.2f", totalTax);
        System.out.printf("\nNet Pay: $%.2f", net);

    }
}
