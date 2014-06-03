
/*I don't know about this one it does not calculate pi i think I need a different
 * formula
 *
 * @author Scott Dykstra
 */
public class CalculationValueOfPie {

    public static void main(String args[]) {
        int n = 0;
        double pi = 0;
        for (n = 0; n < 200000; n++) {

                pi =4 + Math.sqrt(12.0) * Math.pow((1 / 3), n) / (2 * n - 1);

            System.out.printf("%.4f\n", pi);
        }

    }// end main
}