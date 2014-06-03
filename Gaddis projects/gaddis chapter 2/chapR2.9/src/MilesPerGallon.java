
import java.util.Scanner;

public class MilesPerGallon {


    
    public static void main(String[] args)  
    {
     
        Scanner keys = new Scanner(System.in);
        
        double miles , gallons , mpg;
        
        System.out.print("Please enter the number of miles traveled : ");
        miles = keys.nextDouble();
        
        System.out.print("Please enter the amount of gallons used :");
        gallons = keys.nextDouble();
        
        mpg = miles/gallons;
        System.out.print("You gas mileage per gallon is " + mpg);
    }
}
