//Peyton Annett
package Chapter6;

import java.util.Scanner;

/**
 * Program to convert currency
 *
 *
 * @author Peyton Annett
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String more = "";

        System.out.println("How many Euros does a dollar buy? ");
        double e1 = input.nextDouble();
        System.out.println("How many Pound Sterling does a dollar buy? ");
        double p1 = input.nextDouble();
        System.out.println("How many Yen does a dollar buy? ");
        double y1 = input.nextDouble();

        while (!more.equalsIgnoreCase("No")) {
            //Get Values

            System.out.println("How many dollars do you want to convert? ");
            double d1 = input.nextDouble();
            System.out.println("Enter \"E\" to buy Euros, \"P\" to buy Pounds, "
                    + "or \"Y\" to buy Yen: ");
            char type = input.next().toLowerCase().charAt(0);

            if (type == 'e') {
                double eFinal = convert(e1, d1);
                System.out.printf("For %.2f dollars, you will be able to buy "
                        + "%.2f Euros", d1, eFinal);
            } else if (type == 'p') {
                double pFinal = convert(p1, d1);
                System.out.printf("For %.2f dollars, you will be able to buy "
                        + "%.2f Pounds", d1, pFinal);
            } else if (type == 'y') {
                double yFinal = convert(y1, d1);
                System.out.printf("For %.2f dollars, you will be able to buy "
                        + "%.2f Yen", d1, yFinal);
            }

            do {

                System.out.println("\nAre there more conversions to perform?");
                more = input.next();

            } while (!more.equalsIgnoreCase("yes") && !more.equalsIgnoreCase("no"));

        }

    }

    /**
     * Method to convert and take out fee
     *
     * @param c1 conversion
     * @param d1 dollars to be converted
     * @return converted currency
     */
    public static double convert(double c1, double d1) {
        double dFin = 0;
        if (d1 > 100) {
            dFin = d1 * 0.05;
            d1 = d1 - dFin;
        } else if (d1 < 100) {
            dFin = d1 * 0.10;
            d1 = d1 - dFin;
        }
        double answer = d1 * c1;
        return answer;
    }

}
