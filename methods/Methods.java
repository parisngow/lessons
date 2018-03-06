import java.util.Scanner;

/**
 * <h1>Methods</h1>
 * A program which retrieves, modifies and prints marks according to the user's input.
 *
 * @author me
 * @version 1.0
 * @since March 2nd, 2018
 */
public class Methods {
    public static void main(String[] args) {

        int[] marks = getMarks();

        printMarks(marks);

        modifyMarks(marks, 2);

        printMarks(marks);

        modifyMarks(marks, 5);

        printMarks(marks);

    }

    /**
     * getMarks
     * Retrieves marks from the user and stores them in an array.
     *
     * @return marks
     *      After getting marks from the user, it returns the array they are stored in so that they may be
     *      accessible outside of the method.
     */
    public static int[] getMarks() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }

        return marks;
    }

    /**
     * printMarks
     * Prints the values within the marks array.
     *
     * @param marks
     *      Takes an array of marks to print.
     */
    public static void printMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }

    /**
     * modifyMarks
     * Takes an array of marks and a value to increase each mark by. Changes the value of each mark by the desired
     * amount
     *
     * @param marks
     *      Takes an array of marks to modify.
     * @param amount
     *      Takes a value to increase or decrease the marks by.
     */
    public static void modifyMarks(int[] marks, int amount) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += amount;
        }
    }

}

