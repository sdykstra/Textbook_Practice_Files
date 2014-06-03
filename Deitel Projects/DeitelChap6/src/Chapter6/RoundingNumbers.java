package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class RoundingNumbers {

    public static void main(String args[]) {
        Scanner keys = new Scanner(System.in);

        double number = 0;

        System.out.printf("Pleaseend a double type number to round\n");
        number = keys.nextDouble();

        double y = Math.floor(number + .5);
        double x = Math.floor(number * 10 ) / 10;
        double z = Math.floor(number * 100) / 100;
        double w = Math.floor(number*1000)/1000;


        double addedPointFive = number + .5;
        System.out.printf("The number that you enter was %.2f\n and the number "
                + "that was rounded was %.2f giving us a rounded number of: %.1f \n", number, addedPointFive, y);

        System.out.printf(" Rounded to the tenth place: %f\n", x);
        System.out.printf("Rounded to the hundreth place: %f \n", z);
        System.out.printf("Rounded to the thousands place: %f\n", w);
        
    }// end main
}
