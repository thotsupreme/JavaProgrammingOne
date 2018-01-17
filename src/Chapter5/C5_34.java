//Peyton Annett
package Chapter5;

/**
 * Program to play Rock Paper Scissors
 * 
 * @author Peyton Annett
 */
public class C5_34 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
    int compCount = 0;
    int userCount = 0;

    while (userCount <= 2 && compCount <= 2) {
      
      int computerNumber = (int)(Math.random() * 3);

      java.util.Scanner input = new java.util.Scanner(System.in);
      System.out.print("scissor (0), rock (1), paper (2): ");
      int userNumber = input.nextInt();

      switch (computerNumber) {
      case 0:
        if (userNumber == 0) {
          System.out.println("The computer is scissor. You are scissor. It's a draw");
        }
        else if (userNumber == 1) {
          System.out.println("The computer is scissor. You are rock. You won");
          userCount++;
        }
        else if (userNumber == 2) {
          System.out.println("The computer is scissor. You are paper. You lost");
          compCount++;
        }
        break;
      case 1:
        if (userNumber == 0) {
          System.out.println("The computer is rock. You are scissor. You lost");
          compCount++;
        }
        else if (userNumber == 1) {
          System.out.println("The computer chose rock. You chose rock. It's a draw");
        }
        else if (userNumber == 2) {
          System.out.println("The computer chose rock. You chose paper. You won");
          userCount++;
        }
        break;
      case 2:
        if (userNumber == 0) {
          System.out.println("The computer chose paper. You chose scissor. You won");
          userCount++;
        }
        else if (userNumber == 1) {
          System.out.println("The computer chose paper. You chose rock. You lost");
          compCount++;
        }
        else if (userNumber == 2) {
          System.out.println("The computer chose paper. You chose paper. It's a draw");
        }
        break;
      }
    }

    if (userCount > 2) {
      System.out.println("You won more than twice");
    }
    else{
      System.out.println("The computer won more than twice");
    }
  }
}
