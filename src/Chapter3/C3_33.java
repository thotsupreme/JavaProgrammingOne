//Peyton Annett
package Chapter3;

import java.util.Scanner;

/**
 * Program to compare cost of packages
 *
 * @author Peyton Annett
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get values
        System.out.println("Enter Weight for package 1: ");
        double weight1 = input.nextDouble();
        System.out.println("Enter Price for package 1: ");
        double price1 = input.nextDouble();
        System.out.println("Enter Weight for package 2: ");
        double weight2 = input.nextDouble();
        System.out.println("Enter Price for package 2: ");
        double price2 = input.nextDouble();

        //math
        double package1 = weight1 / price1;
        double package2 = weight2 / price2;

        if (package1 > package2) {
            System.out.println("Package 1 has a better price");
        } else if (package2 > package1) {
            System.out.println("Package 2 has a better price");
        } else if (package1 == package2) {
            System.out.println("The packages are the same price per unit");
        }

    }
}
