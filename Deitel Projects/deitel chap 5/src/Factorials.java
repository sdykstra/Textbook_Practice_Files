
import java.util.Scanner;


/**
 *
 * @author FT
 */
public class Factorials {
    
    public static void main(String args[]){
        
    Scanner keys = new Scanner(System.in);
    
   
        System.out.println("Please enter the number that you want a factorial of.");
        int number = keys.nextInt();
        long product = 1;
        int productNum = 1;

        for (int i = 0; i < number; i++) {
            int temp = productNum;
         
            product = productNum * product;
            
            productNum++;
        }// end for loop
        System.out.println("Your factoral product is " + product);
    }//end main
    
}
