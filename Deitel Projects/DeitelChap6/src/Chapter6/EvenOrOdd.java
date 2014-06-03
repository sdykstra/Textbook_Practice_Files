package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class EvenOrOdd {

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);

        System.out.printf("Please enter a number to find odd or even \n");
        int first = keys.nextInt();
        

        int result = first % 2;

        if (result == 0) {
            System.out.printf("True \n");
        } else {
            System.out.printf("False \n");
        }

    }// end main
}
