
/**
 *
 * @author FT
 */
public class DiamondPrinting {

    public static void main(String args[]) {

      

            int a = 5;
            int c = 0;
            int d = 5;
            int e = 1;
            int f = 0;
            
           

                for (int b = 4; b >= 0; b--) {
                    c = d;
                    f = e;
                    while (c >= 0) {
                        System.out.print(" ");
                        c--;
                    }
                    d--;
                    while (f > 0) {
                        System.out.print("*");
                        f--;
                    }
                    e += 2;
                    System.out.println();
                }
                for (int b = 6; b >= 0; b--) {
                    c = d;
                    f = e;
                    while (c >= 0) {
                        System.out.print(" ");
                        c--;
                    }
                    d++;
                    while (f > 0) {
                        System.out.print("*");
                        f--;
                    }
                    e -= 2;
                    System.out.println();
                }
            

     

    }//end main
}
