
/**
 *
 * @author FT
 */
public class CompoundInterest {

    public static void main(String args[]) {

        double amount;
        double principal = 1000.0;


        System.out.printf("%s%22s%16s \n", "Year", "Amount on Deposit", "Interst Rate");
        for (int rate = 5; rate <= 10; rate++) {

            for (int year = 1; year <= 10; year++) {
                amount = principal * Math.pow(1.0 + (.01*rate), year);

                System.out.printf("%4d%,22.2f%6d\n ", year, amount, rate);
            }// inter for loop
        }
    }// end main
}
