//Peyton Annett
package Chapter4;

import java.util.Scanner;

/**
 * Program to determine a student's major and status
 *
 * @author Peyton Annett
 */

public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Character Entry
        System.out.println("Enter two characters, a letter and then a number:");
        String letterOne = input.nextLine();
        if (letterOne.length() != 2) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        if (letterOne.charAt(1) != '1' && letterOne.charAt(1) != '2'
                && letterOne.charAt(1) != '3' && letterOne.charAt(1) != '4') {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        if (letterOne.charAt(0) != 'm' && letterOne.charAt(0) != 'c'
                && letterOne.charAt(0) != 'i') {
            System.out.println("Invalid entry");
            System.exit(0);
        }

        //Determine Letter Characters
        String first = " ";
        if (letterOne.toLowerCase().charAt(0) == 'm') {
            first = "Mathematics";
        }
        if (letterOne.toLowerCase().charAt(0) == 'c') {
            first = "Computer Science";
        }
        if (letterOne.toLowerCase().charAt(0) == 'i') {
            first = "Information Technology";
        }

        //Determine Number Characters
        if (letterOne.charAt(1) == '1') {
            String second = first + (" Freshman");
            System.out.print(second);
        }
        if (letterOne.charAt(1) == '2') {
            String second = first + " Sophomore";
            System.out.print(second);
        }
        if (letterOne.charAt(1) == '3') {
            String second = first + " Junior";
            System.out.print(second);
        }
        if (letterOne.charAt(1) == '4') {
            String second = first + " Senior";
            System.out.print(second);
        }

    }

}
