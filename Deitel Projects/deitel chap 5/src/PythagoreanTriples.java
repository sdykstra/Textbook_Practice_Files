
/**
 *
 * @author FT
 */
public class PythagoreanTriples {

    public static void main(String args[]) {

        int side1 = 0;
        int side2 = 0;
        int hypotenuse = 0;
        System.out.printf("%s%10s%15s\n", "side1", "side2", "hypotenuse");
        for (int n = 1; n <= 500; n++) {
            side1 = n;
            for (int m = 1; m <= 500; m++) {
                side2 = m;
                for (int h = 1; h <= 500; h++) {
                    hypotenuse = h;
                    if ((hypotenuse) == (Math.sqrt((side2*side2) + (side1*side1)))
                            && side1 <= 500 && side2 <= 500 && hypotenuse <= 500) {
                        System.out.printf("%d%10d%10d\n", side1, side2, hypotenuse);
                    }//end if statement 
                }// for h
            }//for m
        }// for n
    }//end main
}
