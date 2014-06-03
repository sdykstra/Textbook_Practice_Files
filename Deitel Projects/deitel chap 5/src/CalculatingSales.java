
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class CalculatingSales {

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);

        double one = 2.98;
        double two = 4.50;
        double three = 9.98;
        double four = 4.49;
        double five = 6.87;
        int quanity = 0;
        double cost = 0;
        double temp =  0;
        int productNum = 0;
        String stop = "null";

        System.out.println("Please enter your purchase choices");

        do {

            System.out.print("Please enter the product number: ");
            productNum = keys.nextInt();

            System.out.print("Please enter the quanity : ");
            quanity = keys.nextInt();

            System.out.println();



            switch (productNum) {
                case 1:
                    temp = quanity * one;
                    break;
                case 2:
                    temp = quanity * two;
                    break;
                case 3:
                    temp = quanity * three;
                    break;
                case 4:
                    temp = quanity * four;
                    break;
                case 5:
                    temp = quanity * five;
                    break;
            }
            cost += temp;
            stop = keys.nextLine();

            System.out.print("If you want to continue enter yes, otherwise type stop : ");
            stop = keys.nextLine();

            System.out.println();

        } while (!"stop".equals(stop));

        System.out.printf("The total cost of your Items is: $%.2f\n" , cost);
    }// end main
}
