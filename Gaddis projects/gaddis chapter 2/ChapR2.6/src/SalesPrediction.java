
import java.util.Scanner;


public class SalesPrediction {


    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
       double sales, total, percent;
       System.out.print("Please enter the amount of total sales for the company :");
       sales = keyboard.nextDouble();
       
       
       percent = .62;
       total = sales*percent;
       
       System.out.printf( "The amount of esimated sales for the East Coast should be $%,.2f\n " , total);
    }
}
