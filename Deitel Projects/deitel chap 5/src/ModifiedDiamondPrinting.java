
/**
 *
 * @author Scott Dykstra
 */
public class ModifiedDiamondPrinting {
     public static void main(String args[]) {

      

            int a = 5;
            int c = 0;
            int d = 5;
            int e = 1;
            int f = 0;
            
           

                for (int b = 7; b >= 0; b--) {
                    int w = 0;
                    w = e % 2;
                   // System.out.println(w);
                    if (w!=0){
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
                   
                    System.out.println();
                    }
                     e += 1;
                }
                e +=1;
                for (int b = 10; b >= 0; b--) {
                    c = d;
                    f = e;
                    int w = 0;
                    w = e % 2;
                   
                    //System.out.println(w);
                    if (w!=0){
                    
                    while (c >= 0) {
                        System.out.print(" ");
                        c--;
                    }
                    d++;
                    while (f > 0) {
                        System.out.print("*");
                        f--;
                    }
                    
                    System.out.println();
                }
            e -= 1;
                }
     

    }//end main
}
