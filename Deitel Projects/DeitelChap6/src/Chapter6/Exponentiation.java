package Chapter6;

/**
 *
 * @author FT
 */
public class Exponentiation {

    public int exponentMultiplyer(int integer, int base) {

        int product = 1;
        for (int i = 0; i < base; i++) {
            product *= integer;
        }
        return product;

    }//end exponentMultiplyer
}
