//Peyton Annett
package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit
 *
 * @author Peyton Annett
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double Celsius = input.nextDouble();

        //Convert Celsius to Fahrenheit
        double fahrenheit = (9 / 5) * Celsius + 32;
        System.out.println(Celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }

}
