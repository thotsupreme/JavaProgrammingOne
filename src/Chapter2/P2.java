//Peyton Annett
package Chapter2;

import java.util.Scanner;

/**
 * Program to find the total cost of a meal plus tax and tip
 *
 * @author Peyton Annett
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare input variables
        System.out.print("Enter price of meal: ");
        double meal = input.nextDouble();
        System.out.print("Enter price of drink: ");
        double drink = input.nextDouble();
        System.out.print("Enter price of dessert: ");
        double dessert = input.nextDouble();

        //math
        double food = meal + drink + dessert;
        double tax = 0.10;
        double salesTax = food * tax;
        double foodNtax = food + salesTax;
        double tip = foodNtax * 0.15;
        double foodTip = foodNtax + tip;

        //output
        System.out.println("Food cost: $" + food);
        System.out.println("Tax is: $" + salesTax);
        System.out.println("Tip is: $" + tip);
        System.out.println("---------------------------");
        System.out.println("Total cost is: $" + foodTip);
    }
}
