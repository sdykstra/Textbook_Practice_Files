package FreezingOrBoilling;
import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class FreezingAndBoilingPoints {
    
    public static boolean isEthylFreezing(int temp){
        if( temp < -173){
            return true;
        }else{
            return false;
        }
    }//end isEthylFreezing

    public static boolean isEthylBoiling(int temp){
        if (temp> 172){
            return true;
        }else{
            return false;
        }
    }// end isEthylBoiling

    public static boolean isOxygenFreezing(int temp){
        if(temp< -362){
            return true;
        }else{
            return false;
        }
    }// end isOxygenFreezing

    public static boolean isOxygenBoiling(int temp){
        if(temp> -306){
            return true;
        }else {
            return false;
        }
    }// end isOxygenBoiling

    public static boolean isWaterFreezing(int temp){
        if(temp< 32){
            return true;
        }else{
            return false;
        }
    }// end isWaterFreezing


    public static boolean isWaterBoiling(int temp){
        if(temp> 212){
            return true;
        }else{
            return false;
        }
    }// end isWaterBoiling

    public static String isBoiling(int temp){
        String s = "The";

        if(isEthylBoiling(temp)){
            s += " Ethyl is boiling";
        }
        if(isOxygenBoiling(temp)){
            s+= " Oxygen is boiling ";
        }
        if(isWaterBoiling(temp)){
            s += " Water is boiling";
        }
   
        return s;
    }// end isBoiling

   public static String isFreezing(int temp){
        String s ="The ";

        if(isEthylFreezing(temp)){
            s += " Ethyl is freezing ";
        }
        if(isOxygenFreezing(temp)){
            s+= " Oxygen is freezing ";
        }
        if(isWaterFreezing(temp)){
            s += " Water is freezing ";
        }
        

        return s;
    }// end isFreezing


    public static void main (String[] args){
        Scanner keys = new Scanner(System.in);
        int temp = 0;
        System.out.println(" please enter a temp to test is if is frozen or boiling ");
        temp = keys.nextInt();

        System.out.print(isFreezing(temp));
        
        System.out.print(isBoiling(temp));
        
    }// end main
    
}// end FreezingAndBoilingPoints
