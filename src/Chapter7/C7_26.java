//Peyton Annett
//7.26 strictly identical lists
package Chapter7;

import java.util.Scanner;

/**
 * Program to determine if two lists are identical
 *
 * @author Peyton Annett
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        if (sameList(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Method to determine if lists are identical
     *
     * @param list1 first list
     * @param list2 second list to be compared to first list
     * @return true if same false if different
     */
    public static boolean sameList(int[] list1, int[] list2) {

        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list2.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
