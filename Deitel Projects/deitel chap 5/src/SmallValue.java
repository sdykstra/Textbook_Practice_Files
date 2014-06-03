
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class SmallValue {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        int bigger = 0;

        System.out.println("Please enter the number of values to sort");
        int numberIn = keys.nextInt();
        System.out.println("please enter first number");
        int startNum = keys.nextInt();
        int number = startNum;

        for (int i = 0; i < numberIn; i++) {

            System.out.println("Please enter next number");
            int nextNum = keys.nextInt();

            if (number >= nextNum) {
                number = nextNum;

            } else if (number < nextNum) {
                if (nextNum > bigger) {
                    bigger = nextNum;
                }
            }
        }// end for loop
        System.out.println("Your Smallest number is the number " + number);
        System.out.println("Your biggest number was " + bigger);
    }// end main
}//end Small Value
