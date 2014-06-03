import java.util.Scanner;


public class FoodTaxFig {

    
    
    public static void main(String[] args)
    {  
      Scanner keyboard = new Scanner(System.in);  
      
      double tax, foodBill, tip, taxBillTotal, tipTotal, total;
      
      tax = .0625;
      
      System.out.print("Please enter the amount of your food bill ");
      foodBill = keyboard.nextDouble();
      
      taxBillTotal = tax*foodBill;
      tipTotal = (taxBillTotal+ foodBill)*(.15);
      total = taxBillTotal + tipTotal + foodBill;
      
      System.out.printf("Your food bill is $%.02f , \n you are paying $%.02f in" +
              " Tax  \n and should pay a tip of $%.02f\n the total for the meal" +
              " is $%.02f\n ",foodBill ,taxBillTotal , tipTotal, total);
        
    }
}
