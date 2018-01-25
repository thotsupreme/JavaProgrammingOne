
import java.util.Arrays;

/**
 * Program to sort hours
 *
 *
 * @author Peyton Annett
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};

        int[][] totals = {
            {34},
            {28},
            {20},
            {31},
            {32},
            {28},
            {37},
            {41}
        };

        String[] day = {"       Su  ", "M  ", "T  ", "W  ", "Th  ", "F  ", "Sa  ", "Total  "};

        //week hours
        int[] week = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                week[i] += hours[i][j];
            }
        }

        int[] indexList = new int[week.length];

        sort(week, indexList);

        //output
        for (int i = week.length - 1; i >= 0; i--) {
            System.out.println("Employee " + indexList[i] + ": "
                    + week[i]);

        }

        //display array
        for (int i = 0; i < day.length; i++) {
            System.out.print("\t" + day[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < hours.length; i++) {

            System.out.print("Employee " + i);
            for (int j = 0; j < hours[i].length; j++) {
                System.out.print("\t" + hours[i][j] + " ");
            }
            //totals
            for (int k = 0; k < totals[i].length; k++) {
                System.out.print("\t" + totals[i][k] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Method to sort hours by amount
     *
     * @param list list of hours
     * @param indexList indexed list
     */
    //sort the stuff
    static void sort(int[] list, int[] indexList) {
        int max;
        int xmax;

        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }

        for (int i = list.length - 1; i >= 1; i--) {

            max = list[i];
            xmax = i;

            for (int j = i - 1; j >= 0; j--) {
                if (max < list[j]) {
                    max = list[j];
                    xmax = j;
                }
            }

            if (xmax != i) {
                list[xmax] = list[i];
                list[i] = max;

                int temp = indexList[i];
                indexList[i] = indexList[xmax];
                indexList[xmax] = temp;
            }
        }
    }
}
