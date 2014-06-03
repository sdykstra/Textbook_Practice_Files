
/**
 *
 * @author FT
 */
public class ModifiedCompoundInterest {

    public static void main(String args[]) {

        int amount;
        int principal = 1000;
        int rate = 5;

        System.out.printf("%s%22s%16s \n", "Year", "Amount on Deposit", "Interst Rate ");
        
        for (int year = 1; year <= 10; year++) {
            amount = principal * ((100 + rate)* year);
            
            int dollar = amount/100;
            int cents = amount%100;

            System.out.printf("%4d%20s%d%s%d%6d\n ", year,"$", dollar,".", cents, rate);
        }

        /*
         * use pennies and the find dollar and cents using the remainder
         *
         */
    }//end main
}
