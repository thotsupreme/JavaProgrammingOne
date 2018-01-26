//Peyton Annett
 //7.9 find the smallest element
 package Chapter7;
 
 import java.util.Scanner;
 
 /**
  * Program to find the smallest element in an array
  *
  * @author Peyton Annett
  */
 public class C7_9 {
 
     /**
      * Main Method
      *
      * @param args arguments from command line prompt
      */
     public static void main(String[] args) {
         System.out.println("Enter ten numbers: ");
         Scanner input = new Scanner(System.in);
         double[] ten = new double[10];
 
         for (int i = 0; i < ten.length; i++) {
             ten[i] = input.nextDouble();
         }
         System.out.print("The minimum number is: " + min(ten));
     }
 
     /**
      * Method to find min
      *
      * @param array the array of inputs
      *
      * @return the smallest element
      */
     public static double min(double[] array) {
 
         double min = array[0];
 
         for (int i = 1; i < array.length; i++) {
             if (min > array[i]) {
                 min = array[i];
             }
         }
         return min;
     }
 }