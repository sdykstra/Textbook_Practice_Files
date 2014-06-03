package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class DistanceBetweenPoints {

    public static Scanner keys = new Scanner(System.in);
    static double x1 = 0;
    static double y1 = 0;
    static double x2 = 0;
    static double y2 = 0;
    static double x = 0;
    static double y = 0;

    public static void main(String args[]) {
        getPoints();
        double distance = getDistance();
        System.out.printf("The distance between your points is %.02f\n", distance);
    }//end main

    public static void getPoints() {
        System.out.printf("Please enter your points \n"
                + "(x1,y1) and (x2,y2) with a space between each number.\n");
        x1 = keys.nextDouble();
        y1 = keys.nextDouble();
        x2 = keys.nextDouble();
        y2 = keys.nextDouble();
        System.out.printf("(x1= %.1f, y1= %.1f) and (x2= %.1f, y2= %.1f)\n"
                + "Are your number in the correct spots?\n y or n\n", x1, y1, x2, y2);
        String awnser = keys.next();

        if ("n".equals(awnser)) {
            getPoints();
        }

    }// end getPoints

    public static double getDistance() {
        double c = 0;
        x = x1 - x2;
        y = y1 - y2;
        c = (x * x + y * y);
        return Math.sqrt(c);
    }//end getDistance
}//end DistanceBetweenPoints
