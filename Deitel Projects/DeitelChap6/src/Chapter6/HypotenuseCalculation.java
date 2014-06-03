package Chapter6;

import java.util.Scanner;
/**
 *
 * @author FT
 */
public class HypotenuseCalculation {
    
    public double hyppotenuse( double side1, double side2){
       double hypotManual = 0;
        double hypotMathMethod = 0;
        
        hypotManual = Math.sqrt((Math.pow(side1, side1))+(Math.pow(side2, side2) ));
        
     hypotMathMethod = Math.hypot(side1, side2);
     
     return hypotManual;
     
        
    }// end main 
    
}
