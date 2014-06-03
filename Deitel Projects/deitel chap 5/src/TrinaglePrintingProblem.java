
/**
 *
 * @author FT
 */
public class TrinaglePrintingProblem {

    public static void main(String args[]) {
        int j = 1;
        int l;
        for (int i = 0; i < 10; i++) {
            l = 0;
            do {

                System.out.print("*");
                l++;
            } while (l < j);
            System.out.println();
            j++;
        }

        System.out.println();

        int a = 0;
        int b = 0;
        int c = 10;
        for (int i = 0; i < 10; i++) {
            b = c;
            do {

                System.out.print("*");
                b--;

            } while (b > a);
            System.out.println();
            c--;
        }
        System.out.println();

        int d = 0;
        int e = 0;
        int f = 10;
        int g = 0;
        int h = 1;

        for (int i = 0; i < 10; i++) {
            e = f;
            g = h;
            do {
                System.out.print("*");
                e--;

            } while (e > d);
            System.out.println();
            f--;
            while (g > 0) {
                System.out.print(" ");
                g--;
            }
            h++;

        }
        System.out.println();

        int m = 1;
        int n;
        int o = 0;
        int p = 10;
        for (int i = 0; i < 10; i++) {
            n = 0;
            o = p;
            while (o > 0) {
                System.out.print(" ");
                o--;
            }
            p--;
            do {

                System.out.print("*");
                n++;
            } while (n < m);
            System.out.println();
            m++;

            

        }

    }//end main
}
