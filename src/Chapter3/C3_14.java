//PeytonAnnett
package Chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Program to display heads or tails
 *
 * @author Peyton Annett
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int coin = random.nextInt(2);

        System.out.print("Flip a coin. Enter 1 for heads, 0 for tails: ");
        int guess = input.nextInt();

        if (guess == coin) {
            System.out.println("You got it!");
        } else {
            System.out.println("Denied.");
        }

    }
}
