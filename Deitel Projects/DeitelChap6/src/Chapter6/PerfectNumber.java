package Chapter6;

/**
 *
 * @author FT
 */
public class PerfectNumber {

    public static void main(String args[]) {

        int num = 0;

        for (int i = 1; i <= 1000; i++) {
            // System.out.printf("While loop:\n ", num);

            int j = 0;
            num = i;
            int sumOfFactors = 0;

            while (j <= num) {
                j++;
                if (num > j) {
                    if (num % j == 0) {
                        sumOfFactors += (j);
                    }
                }
            }
            if (num == sumOfFactors) {
                System.out.printf("%d, ", num);
                if (i % 3 == 0) {
                    System.out.println();
                }
            }
        }
    }// end main
}//end PerfectNumber
