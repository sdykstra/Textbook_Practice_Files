
import java.util.Scanner;



public class SalesTax {

    
    
    public static void main(String[] args)
    {
      Scanner keys = new Scanner(System.in);
        
       double purchase, stateTax, countyTax, totalTax, 
               totalState, totalCounty, totalSale; 
       
       stateTax = .04;
       countyTax =.02;
       
       System.out.print("Please enter the amount of the purchase :");
       purchase = keys.nextDouble();
       
       totalState = stateTax*purchase;
       totalCounty = countyTax*purchase;
       totalTax = totalState + totalCounty;
       totalSale = purchase + totalTax;
       System.out.printf("You made a purchase for the amount of $%,.02f " , purchase);
       System.out.printf(" and paid $%,.02f in state tax and $%,.02f in county tax \n " +
                    "The total tax paid was $%.02f "+
               " and your total sale was $%,.02f " , totalState , totalCounty , totalTax, totalSale );
      
       
       
    }
}
