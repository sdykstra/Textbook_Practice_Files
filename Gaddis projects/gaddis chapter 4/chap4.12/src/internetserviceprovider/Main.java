package internetserviceprovider;

import java.util.Scanner;

/**
 *
 * @author nod
 */
public class Main {

    public static double servicePack(String in, int hours) {
        in.toLowerCase();
        double bill = 0;
        if (in.equals("a")) {
            bill += 9.95;
            if (hours > 10) {
                bill += ((hours - 10) * 2);
            }
        } else if (in.equals("b")) {
            bill += 14.95;
            if (hours > 20) {
                bill += ((hours - 20) * 1);
            }
        } else if (in.equals("c")) {
            bill += 19.95;
        }
        return bill;
    }//end servicePack

    public static String priceCheck(String in, int hours) {
        in.toLowerCase();
        double saving = 0;

        if (in.equals("a")) {

            double a = 9.95;
            if (hours > 10) {
                a += ((hours - 10) * 2);
            }
            double b = 14.95;
            if (hours > 20) {
                b += ((hours - 20) * 1);
            }
            double c = 19.95;

            if (b < c && b < a) {
                return " you could save$ " + b + " with plan 'B'";
            } else if (c < b && c < a) {
                return " you could save$ " + c + " with plan 'C'";
            } else {
                return null;
            }
        } //end A
        else if (in.equals("b")) {

            double a = 9.95;
            if (hours > 10) {
                a += ((hours - 10) * 2);
            }
            double b = 14.95;
            if (hours > 20) {
                b += ((hours - 20) * 1);
            }
            double c = 19.95;
            if (a < c && a < b) {
                return " you could save$ " + a + " with plan 'A'";
            } else if (c < a && c < b) {
                return " you could save$ " + c + " with plan 'C'";
            } else {
                return null;
            }
        } // end B
        else if (in.equals("c")) {

            double a = 9.95;
            if (hours > 10) {
                a += ((hours - 10) * 2);
            }
            double b = 14.95;
            if (hours > 20) {
                b += ((hours - 20) * 1);
            }
            double c = 19.95;

            if (a < b && a < c) {
                return " you could save$ " + a + " with plan 'A'";
            } else if (b < a && b < c) {
                return " you could save$ " + b + " with plan 'B'";
            } else {
                return null;
            }

        }//end C

        return null;
    }// end priceCheck

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        String in;
        int hours;

        System.out.println("Please enter you plan type,either 'A', 'B', 'C' ");
        in = keys.next();

        System.out.println("Please enter the number of hours used this month ");
        hours = keys.nextInt();

        System.out.println("Your billing amount is $" + servicePack(in, hours));

        System.out.println(priceCheck(in, hours));


    }// end main
}
