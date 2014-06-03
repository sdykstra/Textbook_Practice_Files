package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class SeparatingDigits {

    static int a = 0;
    static int b = 0;
    static int quotient = 0;
    static int remainder = 0;

    public static int calculateQuotient(int aIn, int bIn) {
        quotient = aIn / bIn;
        return quotient;
    }// end calculateQuotient

    public static int calculateRemainder(int aIn, int bIn) {
        remainder = aIn % bIn;
        return remainder;
    }// end calculateRemainder

    public static void displayDigits(int aIn, int bIn) {

        int quoti = calculateQuotient(aIn, bIn);
        int rema = calculateRemainder(aIn, bIn);

        int tenThousands = quoti / 10000;
        quoti %= 10000;
        int thousand = quoti / 1000;
        quoti %= 1000;
        int hundred = quoti / 100;
        quoti %= 100;
        int tens = quoti / 10;
        quoti %= 10;
        int ones = quoti;
        if (tenThousands > 0) {
            System.out.printf("%d  %d  %d  %d  %d", tenThousands, thousand, hundred, tens, ones);
        } else if (thousand > 0) {
            System.out.printf("%d  %d  %d  %d", thousand, hundred, tens, ones);
        } else if (hundred > 0) {
            System.out.printf("%d  %d  %d", hundred, tens, ones);
        } else if (tens > 0) {
            System.out.printf("%d  %d", tens, ones);
        } else if (ones > 0) {
            System.out.printf("%d", ones);
        }

        tenThousands = rema / 10000;
        rema %= 10000;
        thousand = rema / 1000;
        rema %= 1000;
        hundred = rema / 100;
        rema %= 100;
        tens = rema / 10;
        rema %= 10;
        ones = rema;


        if (tenThousands > 0) {
            System.out.printf("  R %d  %d  %d  %d  %d\n", tenThousands, thousand, hundred, tens, ones);
        } else if (thousand > 0) {
            System.out.printf("  R  %d  %d  %d  %d\n", thousand, hundred, tens, ones);
        } else if (hundred > 0) {
            System.out.printf("  R  %d  %d  %d\n", hundred, tens, ones);
        } else if (tens > 0) {
            System.out.printf("  R  %d  %d\n", tens, ones);
        } else if (ones > 0) {
            System.out.printf("  R  %d\n", ones);
        }


    }//end displayDigits

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);

        System.out.printf("Please enter a number less then 100,000 and a divisor : \n");
        a = keys.nextInt();
        b = keys.nextInt();


        displayDigits(a, b);

    }// end main
}// end SeparatingDigits
