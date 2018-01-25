
//Peyton Annett
//7.1 assign grades
import java.util.Scanner;

/**
 * Program to assign grades based on scores
 *
 * @author Peyton Annett
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] score = new int[n];
        int best = 0;

        System.out.print("Enter " + n + " scores:");

        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            if (best < score[i]) {
                best = score[i];
            }
        }
        //Processing grades

        char grade;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= best - 10) {
                grade = 'A';
            } else if (score[i] >= best - 20) {
                grade = 'B';
            } else if (score[i] >= best - 30) {
                grade = 'C';
            } else if (score[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i + " score is "
                    + score[i] + " and grade is " + grade);
        }
    }
}
