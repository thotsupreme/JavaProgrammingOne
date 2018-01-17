//Peyton Annett
package Chapter5;
import java.util.Scanner;
/**
 * Program to reverse strings
 * 
 * @author Peyton Annett
 */
public class C5_46 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String first = input.nextLine();
        
        String reverse = "";
        for (int i = 0; i < first.length(); i++) {
            reverse = first.charAt(i) + reverse;
        }
    
        System.out.println("The reversed string is " + reverse);
    }
}
