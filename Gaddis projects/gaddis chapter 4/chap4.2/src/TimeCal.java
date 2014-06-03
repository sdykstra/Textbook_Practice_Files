
import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class TimeCal {

    /*
    public TimeCal()
    {
    
    }
    
    public double figureTime(double fig)
    {
    num = fig;
    
    if (num< 60)
    {
    returnNum =num/60;
    
    
    }
    else if (num< 3600)
    {
    returnNum = num/3600;
    
    
    }  
    else if  ( num< 86400)
    {
    returnNum = num/86400;
    
    }
    return returnNum;
    }
    
     * 
     */
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        double num, returnNum;

        returnNum = 0;
        System.out.println("Please enter a time in seconds :");
        num = keys.nextDouble();

        keys.nextLine();

        if (num < 60) {
            returnNum = num;
System.out.printf("Your number is : %.0f  seconds ", returnNum);            
        } else if (num > 86400) {
            returnNum = num / 86400;
System.out.printf("Your number is : %.02f  days", returnNum);
        } else if (num > 3600) {
            returnNum = num / 3600;
System.out.printf("Your number is : %.02f  hours", returnNum);
        } else if (num > 60) {
            returnNum = num / 60;
System.out.printf("Your number is : %.02f minutes ", returnNum);
        }


    }
}