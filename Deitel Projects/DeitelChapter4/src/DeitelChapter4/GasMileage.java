package DeitelChapter4;

import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class GasMileage {
    
    Scanner keys = new Scanner(System.in);
    int milesDriven, gallonsUsed, totalGallons, totalMiles ; 
    double mpg;
    
    public GasMileage(){
        milesDriven =0;
        gallonsUsed = 0;
    }
    
    public int getMilesDriven(){
        return milesDriven;
    }
    
    public int getGallonsUsed(){
        return gallonsUsed;
    }
    
    public int getTotalMiles(){
        return totalMiles;
    }
    
    public int getTotalGallons(){
        return totalGallons;
    }
    
    public void requestMilesDriven(){
        System.out.print("Please enter miles driven on this tank:");
        totalMiles += milesDriven = keys.nextInt(); 
    }
    
    public void requestGallonsUsed(){
        System.out.print("Please enter gallons used to fill tank:");
        totalGallons += gallonsUsed = keys.nextInt(); 
    }
    
    public void printGallons(){
        System.out.print("Your Total gallons used was: "+ totalGallons);        
    }
    
     public void returnMiles(){
        System.out.print("Your Total gallons used was: "+ totalMiles);        
    }
     
     public void currentMPG(){
         mpg = (double)totalMiles/ totalGallons;
         System.out.println("Your current MPG's is: "+ mpg);
     }
     
     public void totalMPG(){
         mpg = (double)milesDriven/ gallonsUsed;
         System.out.println("Your total MPG's is: "+ mpg);
     }
}// end GasMileage
