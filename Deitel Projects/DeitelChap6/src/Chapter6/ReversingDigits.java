package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class ReversingDigits {

    static Scanner keys = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your number to reverse.");
        int number = keys.nextInt();
        System.out.printf("Your number reveresed is: ");
        
      do {
           // System.out.println("in while loop");

            int num = number % 10;
            System.out.print(num);

            number /= 10;
           // System.out.print(number);
        }while (number != 0);
    }// end main
}//end ReversingDigits
