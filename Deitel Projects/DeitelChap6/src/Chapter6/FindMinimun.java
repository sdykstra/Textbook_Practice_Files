package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class FindMinimun {

    public static float minimum3(float one, float two, float three) {

        float smallest = 0;

        if (one < two) {
            smallest = one;
        } else {
            smallest = two;
        }
        if (smallest > three) {
            smallest = three;
        }

        return smallest;
    }//end minimum3

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);

        System.out.printf("Please enter three floating point number to find smallest\n");
        float num1 = keys.nextFloat();
        float num2 = keys.nextFloat();
        float num3 = keys.nextFloat();

        System.out.printf(" the smallest number is: %f", minimum3(num1, num2, num3));


    }// end main
}//end FindMinimun
