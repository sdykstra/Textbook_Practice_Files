
/**
 *
 * @author FT
 */
public class ModifiedTrianglePrinting {

    public static void main(String args[]) {
        int j = 1;
        int l;
        int a = 0;
        int b = 0;
        int c = 10;
        int d = 0;
        int e = 0;
        int f = 10;
        int g = 0;
        int h = 1;
        int m = 1;
        int n;
        int o = 0;
        int p = 10;
        for (int i = 0; i < 10; i++) {
            // first triangle 

            l = 0;
            do {

                System.out.print("*");
                l++;
            } while (l < j);
            j++;
//second triangle
            b = c;

            System.out.printf("%5s", "");
            do {

                System.out.print("*");
                b--;

            } while (b > a);
            c--;
// third trangle
            e = f;
            g = h;

            System.out.printf("%5s", "");
            do {
                System.out.print("*");
                e--;

            } while (e > d);

            f--;
            while (g > 0) {
                System.out.print(" ");
                g--;
            }
            h++;

// fourth triangle
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
                m++;

            System.out.println();

        }

    }//end main
}
