//Peyton Annett
package Chapter3;

import java.util.Scanner;

/**
 * Program to find whether a number is divisible by 5 or 6
 *
 * @author Peyton Annett
 */

public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize divisors
        int a = 5;
        int b = 6;
        //input
        System.out.println("Enter an Integer: ");
        int numbah = input.nextInt();
        //logic and math
        boolean divisible;

        if (numbah % a == 0 && numbah % b == 0) {
            divisible = true;
            System.out.println("Is " + numbah + " divisible by 5 and 6? " + divisible);
        } else {
            divisible = false;
            System.out.println("Is " + numbah + " divisible by 5 and 6? " + divisible);
        }

        if (numbah % a == 0 || numbah % b == 0) {
            divisible = true;
            System.out.println("Is " + numbah + " divisible by 5 or 6? " + divisible);
        } else {
            divisible = false;
            System.out.println("Is " + numbah + " divisible by 5 or 6? " + divisible);
        }

        if ((numbah % a == 0 || numbah % b == 0) && (numbah % a != 0 || numbah % b != 0)) {
            divisible = true;
            System.out.println("Is " + numbah + " divisible by 5 or 6, but not both? " + divisible);
        } else {
            divisible = false;
            System.out.println("Is " + numbah + " divisible by 5 or 6, but not both? " + divisible);
        }

    }
}
