package Chapter4;

import java.util.Scanner;

/**
 * Program to find substrings
 *
 * @author Peyton Annett
 */
//4.22 substrings
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();

        ///////System.out.println("Search1="+s1.toLowerCase().contains(s2.toLowerCase()));
        //boolean search = s1.toLowerCase().contains(s2.toLowerCase()));
        boolean isFound = s1.indexOf(s2) != -1 ? true : false;

        if (isFound == true) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }
}
