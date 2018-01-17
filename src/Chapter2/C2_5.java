//Peyton Annett
package Chapter2;

import java.util.Scanner;

/**
 * Program to find a tip
 *
 * @author Peyton Annett
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        //more math stuff
        double tip = gratuity / 100;
        double tot = subtotal * tip;
        double total = tot + subtotal;
        System.out.print("The gratuity is $" + tot);
        System.out.println();
        System.out.print("The total is $" + total);

    }
}
