package BMI;
import java.util.Scanner;
/**
 *
 * @author nod
 */
public class BodyMassIndex {
    
   
    
    public static double BMI(double h, double w){
        
       double bmi =  w *(703/(h*h));
       return bmi; 
    }

    public static void main(String[]args){
      double height, weight;

      Scanner keys = new Scanner(System.in);

      System.out.println("Please enter your height in inches ");
      height = keys.nextDouble();

      System.out.println("Please enter your weight in pounds ");
      weight = keys.nextDouble();
      double percent = BMI(height, weight);
      if(percent < 18.5){
          System.out.printf("Your BMI is %.2f you are under weight!\n" ,percent);
      }else if(percent< 25){
          System.out.printf("Your BMI is %.2f your weight is optimal!\n", percent);
      }else{
          System.out.printf("Your BMI is %.2f you are obese.\n ", percent);
      }

    }//end main

}// end BodyMassIndex
