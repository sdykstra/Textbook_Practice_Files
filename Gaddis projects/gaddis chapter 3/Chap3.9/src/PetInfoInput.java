import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class PetInfoInput {

    
    
     
    
    public static void main(String[] args)
    {
       Scanner keys = new Scanner(System.in);
       
       String name, age, type;
       
        
        System.out.println("Please enter your pet inforamtion at the promps.");
        System.out.println("Please enter you pet name : ");
           name = keys.nextLine();
                
         System.out.println("Please enter your aminal type ");
         type = keys.nextLine();
         
         System.out.println("Please enter your aminal's age ");
         age = keys.nextLine();
         
         Pet a = new Pet(name, age, type);
                
         System.out.println(a.toString());
    }
    
}
