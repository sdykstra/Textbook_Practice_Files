
import java.util.Scanner;


/**
 * @author Scott Dykstra
 */
public class SoftwareClass {
    
     public  static double customerCost(int num){
        double cost=0;
        
        if(num<10){
           cost = (num*99); 
        }
      else if (num<20){
            cost = (num*99)/.20;
        }else if (num<50){
            cost = (num*99)/.30;
        }else if (num<100){
            cost = (num*99)/.40;
        }else if (num>- 100){
            cost = (num*99)/.50;
        }
        return cost;
    } // end customer Cost

    
     public static void main(String[] args){
            
          
         
         Scanner keys = new Scanner(System.in);
         int total;
                 
         System.out.print(" please enter the number of units wanted :");
         total = keys.nextInt();
         
        System.out.println(" you total cost will be $"+customerCost(total));
         
         
         
     }// end main

     

}// end SoftwareClass
