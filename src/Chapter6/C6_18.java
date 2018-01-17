//Peyton Annett
package Chapter6;

/**
 * Program to check if password is valid
 * 
 * @author Peyton Annett
 */
public class C6_18 {
  public static void main(String[] args) {
    //enter a password and store it
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a string for password: ");
    String pass = input.nextLine();

    if (validPassword(pass)) {
      System.out.println("Valid password");
    }
    else {
      System.out.println("Invalid password");
    }
  }

  // Check if password is valid
  
  /**
   * 
   * @param pass password string
   * @return whether the password is valid
   */
  public static boolean validPassword(String pass) {
    // Only letters and digits?
    for (int i = 0; i < pass.length(); i++) {
      if (!Character.isLetter(pass.charAt(i)) && 
          !Character.isDigit(pass.charAt(i)))
        return false;
    }
    
    // Check length
    if (pass.length() < 8)
      return false;
    
    // Count the number of digits
    int count = 0;
    for (int i = 0; i < pass.length(); i++) {
      if (Character.isDigit(pass.charAt(i)))
        count++;
    }
    
    if (count >= 2)
      return true;
    else 
      return false;
  }
}
