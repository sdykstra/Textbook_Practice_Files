
import java.util.Scanner;

public class CricuitBoardProfit {

  
    
    public static void main(String[] args) 
    {
     Scanner keys = new Scanner(System.in);   
     double profit, retailPrice;
     
     System.out.println("Please enter the Retail price for circuit board  ");
     retailPrice = keys.nextDouble();
     
     profit = retailPrice*.04;
     
     
     System.out.printf("The profit for the circuit boasrd will be $%,.02f " , profit);
        
    }
}
