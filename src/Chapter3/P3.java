//Peyton Annett
package Chapter3;

import java.util.Scanner;

/**
 * Program to compare scores and assign a letter grade
 *
 * @author Peyton Annett
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        System.out.println("Enter a number: ");
        double value1 = input.nextDouble();
        System.out.println("Enter another number: ");
        double value2 = input.nextDouble();
        //if statements determining output
        if (value1 < value2) {
            System.out.println("The first number is less than the second");
        }
        if (value1 > value2) {
            System.out.println("The first number is greater than the second");
        }
        if (value1 == value2) {
            System.out.println("The first number is equal to the second");
        }
        if (value1 <= value2) {
            System.out.println("The frist number is less than or equal to the second");
        }
        if (value1 != value2) {
            System.out.println("The first number is not equal to the second");
        }
        if (value2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (value1 / value2 < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("Improper fraction");
        }
        //Display letter grades
        if (value1 >= 90) {
            System.out.println("A");
        } else if (value1 >= 80) {
            System.out.println("B");
        } else if (value1 >= 70) {
            System.out.println("C");
        } else if (value1 >= 60) {
            System.out.println("D");
        } else if (value1 < 59) {
            System.out.println("F");
        }
        //delcare number range
        if (value2 <= 100 && value2 >= 1) {
            System.out.println("In range");
        } else {
            System.out.println("Out of Range");
        }
    }
}
