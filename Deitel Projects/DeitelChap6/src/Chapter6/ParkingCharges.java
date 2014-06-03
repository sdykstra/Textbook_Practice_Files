package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class ParkingCharges {

    public static void main(String args[]) {
        Scanner keys = new Scanner(System.in);

        int numParkers = 0;
        int totalParkers = 0;
        double todaysFee = 0;
        
        System.out.println("Please enter the number of parkers for the day");
        numParkers = keys.nextInt();

        do {

            int hours = 0;
            System.out.println("Please enter the number of hours parked: ");
            hours = keys.nextInt();
            todaysFee = calculateCharges(hours);
            System.out.printf("The fee for %d hours parked is $%.2f\n ", hours, currentfee);
            System.out.printf("The current amount of fees owed is $%.2f \n", todaysFee);

            totalParkers++;
        } while (numParkers > totalParkers);


        System.out.printf("The Fianl total for parking is %d number of parkers"
                + " and $%.2f collected in fees charged.\n", numParkers, todaysFee);

    }//end main 
    static double minFee = 2.00;
    static double hourlyFee = .5;
    static int max = 10;
    static double fee = 0;
    static double currentfee = 0;

    public static double calculateCharges(int numHours) {

        currentfee = 0;
        currentfee = minFee;

        if (numHours < 24) {
            numHours -= 3;
            currentfee += hourlyFee * numHours;
        } else if (numHours == 24) {
            currentfee = max;
        } else if (numHours > 10) {
            currentfee += hourlyFee * ((numHours % 24) - 3);
            currentfee += max * (numHours / 24);
        }
        fee += currentfee;
        return fee;
    }
}
