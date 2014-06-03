
import java.util.Scanner;

/**
 * Scott Dykstra
 */
public class OddIntegers {

    public static void main(String args[]) {
        Scanner keys = new Scanner(System.in);

        System.out.println("Please enter top number to sum the odd");
        int number = keys.nextInt();
        int remainder = 0;
        int product = 1;
        int productNum = 1;

        for (int i = 0; i < number; i++) {
            int temp = productNum;
            remainder = temp % 2;
            if (remainder >= 1) {
            product = productNum * product;
             }
            productNum++;
        }// end for loop
        System.out.println("Your product of odds is " + product);
    }//end main
}
