package Chapter4;

import java.util.Scanner;

/**
 * Program to display bidding
 *
 * @author Peyton Annett
 */
//Peyton Annett
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //First Bidder Info
        System.out.println("These details concern the first bidder");
        System.out.println("Enter name of first bidder: ");
        String name1 = input.nextLine();
        System.out.println("How many hours of work will the first bidder require?");
        int hour1 = input.nextInt();
        System.out.println("How much does the first bidder charge per hour: ");
        double charge1 = input.nextDouble();

        //Second Bidder Info
        System.out.println("These details concern the second bidder");
        System.out.println("Enter name of second bidder: ");
        String name2 = input.next();
        System.out.println("How many hours of work will the second bidder require?");
        int hour2 = input.nextInt();
        System.out.println("How much does the second bidder charge per hour?");
        double charge2 = input.nextDouble();

        //Calculate
        double firstCost = hour1 * charge1;
        double secondCost = hour2 * charge2;

        if (firstCost < secondCost) {
            System.out.println("The winner is " + name1);
            System.out.printf("$%.2f", firstCost);
        } else if (secondCost < firstCost) {
            System.out.println("The winner is " + name2);
            System.out.printf("Total Cost is $%.2f", secondCost);
        } else if (firstCost == secondCost) {
            if (hour1 < hour2) {
                System.out.println("The winner is " + name1 + "; " + hour1 + " hours");
                System.out.printf("Total Cost is $%.2f", firstCost);
            }
            if (hour1 > hour2) {
                System.out.println("Winner is " + name2 + "; " + hour2 + " hours");
                System.out.printf("Total Cost is $%.2f", secondCost);
            }
            if (hour1 == hour2) {
                System.out.println(name1 + " and " + name2 + " have identical bids");
                System.out.println("Number of Hours:");
                System.out.printf("First Bidder = %s", hour1);
                System.out.printf(" Second Bidder = %s", hour2);
                System.out.println("\nCost Per Hour:");
                System.out.printf("First Bidder: $%.2f", charge1);
                System.out.printf(" Second Bidder: $%.2f", charge2);
                System.out.println("\nTotal Cost:");
                System.out.printf("First bidder = $%.2f", firstCost);
                System.out.printf(" Second bidder = $%.2f", secondCost);
            }
        }

    }
}
