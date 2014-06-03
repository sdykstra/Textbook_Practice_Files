
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class BarChartPrinting {

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);

        int one = 0, two = 0, three = 0, four = 0, five = 0;

        System.out.println("Please enter five number to graph");

        System.out.println("Please enter first number");
        one = keys.nextInt();

        System.out.println("Please enter second number");
        two = keys.nextInt();

        System.out.println("Please enter third number");
        three = keys.nextInt();

        System.out.println("Please enter fourth number");
        four = keys.nextInt();

        System.out.println("Please enter fiths number");
        five = keys.nextInt();

        System.out.println(" Your bar graph is being produced");

        int j = one;
        for (int i = 0; i < j; i++) {

            System.out.print("*");
        }
        System.out.println();
        
        int k = two;
        for (int i = 0; i < k; i++) {

            System.out.print("*");
        }
        System.out.println();
        
        int l = three;
        for (int i = 0; i < l; i++) {

            System.out.print("*");
        }
        System.out.println();
       
        int m = four;
        for (int i = 0; i < m; i++) {

            System.out.print("*");
        }
        System.out.println();
        
        int n = five;
        for (int i = 0; i < n; i++) {

            System.out.print("*");
        }
        System.out.println();
        
        
        
    }//end main 
}
