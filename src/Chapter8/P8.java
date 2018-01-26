//Peyton Annett
package Chapter8;

import java.util.*;

/**
 * Program to list sales of salesman in an array
 *
 *
 * @author Peyton Annett
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // variables defined
        Scanner input = new Scanner(System.in);
        char[] people = {'A', 'B', 'C', 'D'};
        char[] week = {'M', 'T', 'W', 'H', 'F'};
        double[][] sales = new double[people.length][week.length];
        double amt = 0;
        int n = 0;
        int l = 0;
        String x;
        String day;
        String yeet = "y";
        boolean bruh = false;

        while (yeet.toLowerCase().charAt(0) != 'n') {

            // Prompts user to enter a salesman ID, Day, and sales amt
            System.out.print("Computer prompt: Enter the salesman ID as A,B,C, or D." + ""
                    + "\n\tUser reply: ");
            x = input.next();

            if ((x.toLowerCase().charAt(0) != 'a') && (x.toLowerCase().charAt(0) != 'b') && (x.toLowerCase().charAt(0) != 'c') && (x.toLowerCase().charAt(0) != 'd')) {
                bruh = false;
            } else {
                bruh = true;
            }

            while (bruh = false) {
                System.out.print("Computer prompt: Invalid ID. Enter the salesman ID as A,B,C, or D." + ""
                        + "\n\tUser reply: ");
                x = input.next();
                if ((x.toLowerCase().charAt(0) != 'a') && (x.toLowerCase().charAt(0) != 'b') && (x.toLowerCase().charAt(0) != 'c') && (x.toLowerCase().charAt(0) != 'd')) {
                    bruh = false;
                } else {
                    bruh = true;
                }
            }

            if (x.toLowerCase().charAt(0) == 'a') {
                n = 0;
            } else if (x.toLowerCase().charAt(0) == 'b') {
                n = 1;
            } else if (x.toLowerCase().charAt(0) == 'c') {
                n = 2;
            } else if (x.toLowerCase().charAt(0) == 'd') {
                n = 3;
            } else {
                n = 0;
            }

            System.out.print("Computer prompt: Enter the day as M, T, W, H, or F." + ""
                    + "\n\tUser reply: ");

            day = input.next();

            bruh = false;

            if ((day.toLowerCase().charAt(0) != 'm') && (day.toLowerCase().charAt(0) != 't') && (day.toLowerCase().charAt(0) != 'w') && (day.toLowerCase().charAt(0) != 'h') && (day.toLowerCase().charAt(0) != 'f')) {
                bruh = false;
            } else {
                bruh = true;
            }

            while (bruh = false) {
                System.out.print("Computer prompt: Invalid ID. Enter the day as M, T, W, H, or F." + ""
                        + "\n\tUser reply: ");
                x = input.next();
                if ((x.toLowerCase().charAt(0) != 'a') && (x.toLowerCase().charAt(0) != 'b') && (x.toLowerCase().charAt(0) != 'c') && (x.toLowerCase().charAt(0) != 'd')) {
                    bruh = false;
                } else {
                    bruh = true;
                }
            }

            if (day.toLowerCase().charAt(0) == 'm') {
                l = 0;
            } else if (day.toLowerCase().charAt(0) == 't') {
                l = 1;
            } else if (day.toLowerCase().charAt(0) == 'w') {
                l = 2;
            } else if (day.toLowerCase().charAt(0) == 'h') {
                l = 3;
            } else if (day.toLowerCase().charAt(0) == 'f') {
                l = 4;
            }

            System.out.print("Computer prompt: Enter the amount of the sale." + ""
                    + "\n\tUser reply: ");
            amt = input.nextDouble();

            sales[n][l] = sales[n][l] + amt;

            System.out.print("Computer prompt: More data? Enter Y for more or N to stop." + ""
                    + "\n\tUser reply: ");
            yeet = input.next();
            while (yeet.toLowerCase().charAt(0) != 'y' && yeet.toLowerCase().charAt(0) != 'n') {
                System.out.print("Computer prompt: More data? Enter Y for more or N to stop." + ""
                        + "\n\tUser reply: ");
                yeet = input.next();
            }
        }

        // Prints the recorded data
        System.out.print("\t\t M\t\t T\t\t W\t\t H\t\t F\n");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Salesman " + (i + 1) + ":\t");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("$%.2f \t\t", sales[i][j]);
            }
            System.out.print("\n");
        }
    }
}
