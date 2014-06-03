
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class BinaryConvertorTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BinaryConvertor numCon = new BinaryConvertor();

        int num = 0;

        System.out.print(" Please enter a binary number to convert: ");
        num = input.nextInt();

        System.out.println(" The decimal value of your binary number is:" + numCon.convertor(num));




    }// end main
}// end BinaryConvertortest
