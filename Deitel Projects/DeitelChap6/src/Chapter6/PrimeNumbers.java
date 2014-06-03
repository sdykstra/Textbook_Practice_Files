package Chapter6;

/**
 *
 * @author FT
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int total = 0;
        int highest = 0;
        int counter = 0;
        for (int i = 1; i < 10000; i++) {
            //System.out.printf("while loop at number %d\n", i);

            for (int k = 2; k <= i; k++) {

                int m = i % k;
                if (m == 0) {
                 //   System.out.printf("kick up loop at number %d\n", i);
                    if (i != 2) {
                        break;
                    }

                }
                int j = i / k;
                if (j == 1 && i > highest) {
                    highest = i;
                    if (highest > 2) {
                        System.out.print(", ");
                         counter++;
                    }
                    System.out.print(i);
                    total++;
                    k = i;
                    if (counter%10 == 0&&i!=2) {
                        System.out.println();
                    }

                }

            }
           
        }
        System.out.printf("\nThe total number of prime numbers was %d and the "
                + "number of number\n that you need to test to make sure that "
                + "you found each\n one was %d.\n", total, highest + 1);
    }//end main
}// end PrimeNumbers
