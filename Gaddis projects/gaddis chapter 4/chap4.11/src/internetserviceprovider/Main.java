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
    }

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
       String in;
        int hours;

        System.out.println("Please enter you plan type,either 'A', 'B', 'C' ");
        in = keys.next();

        System.out.println("Please enter the number of hours used this month ");
        hours = keys.nextInt();

        System.out.println("Your billing amount is $"+servicePack(in, hours));
    }// end main
}
