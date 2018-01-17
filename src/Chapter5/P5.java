//Peyton Annett
package Chapter5;

import java.util.Scanner;

/**
 * Program to count votes
 *
 * @author Peyton Annett
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initialize variables
        int yesCount = 0;
        int noCount = 0;
        int invalid = 0;
        int total = 0;
        String vote = "";

        //Loop vote session
        while (!vote.equals("Q")) {

            System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
            vote = input.nextLine();

            //count the votes
            switch (vote.toUpperCase()) {
                case "Y":
                    yesCount++;
                    total++;
                    break;
                case "N":
                    noCount++;
                    total++;
                    break;
                case "Q":
                    System.out.printf("Yes votes: %s", yesCount);
                    System.out.printf("\nNo votes: %s", noCount);
                    System.out.printf("\nInvalid votes: %s", invalid);
                    System.out.printf("\nTotal votes: %s", total);
                    System.exit(0);
                    break;
                default:
                    System.out.print("INVALID CODE: ");
                    invalid++;
                    total++;
                    break;
            }
        }

    }

}
