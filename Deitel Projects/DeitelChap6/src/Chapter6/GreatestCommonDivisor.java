package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Please enter your number to find the GCD");
        int num = keys.nextInt();
        int gcd = primeNum(num);
        
                System.out.println("Your GCD is: "+ gcd);

    }// end main

    public static int primeNum(int questionNum) {
        System.out.println("primeNum");

        int total = 0;
        int highest = 0;
        int mod = 0;
        for (int i = 1; i < questionNum; i++) {
            //System.out.printf("while loop at number %d\n", i);

            for (int k = 2; k <= i; k++) {

                int m = i % k;
                if (m == 0) {
                     // System.out.printf("kick up loop at number %d\n", i);
                    if (i != 2) {
                        break;
                    }
                }
                int j = i / k;
                if (j == 1 && i > highest) {
                           // System.out.println("primeNum mod if: "+ i);

                    mod = questionNum % i;
                    if (mod == 0) {
                       total= highest = i;

                    }
                }
            }
        }
        return total;

    }//end primeNum
}//end GreatestCommonDivisor
