package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Multiples {

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);

        System.out.printf("Please enter two number to find a multiple of the second number \n");
        int first = keys.nextInt();
        int second = keys.nextInt();

        int result = second % first;

        if (result == 0) {
            System.out.printf("True \n");
        } else {
            System.out.printf("False \n");
        }

    }// end main
}
