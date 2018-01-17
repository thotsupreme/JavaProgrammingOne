//Peyton Annett
package Chapter6;
import java.util.Scanner;
/**
 * Program to check if password is valid
 * 
 * @author Peyton Annett
 */
public class C6_18 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Password: ");
        String password = input.next();
        boolean valid;
        //check length
        int len = password.length();
        if(len < 8){
            valid = false;
            System.out.print("Password must have at least eight characters");
        }
        
        
        
    }
}

