package Chapter6;


import java.util.Scanner;

/**
 *
 * @author FT
 */
public class CirlcleArea {

    public static void main(String args []){
        
        Scanner keys = new Scanner(System.in);
        
        System.out.printf("Please enter the radius of your circle: \n");
                int radius = keys.nextInt();
               System.out.printf("The area for your circle is: %.2f\n",circleRadius(radius));
       
    }//end main
    
    public static double circleRadius(int cirRadius){
        
        double area = Math.PI*(Math.pow(cirRadius,2));
        return area;
    }//end circleRadius
    
}// end CirlcleArea
