import java.util.Scanner;
/**
 * @author Scott Dykstra
 */
public class RomanNum {

     public static void main (String [] args)
    {
       
    Scanner keys = new Scanner(System.in);
            
       
    System.out.println("Please enter a number one through ten to see Roman numeral :");
    int x = keys.nextInt();
    
    switch(x){
    
    case 1:
        System.out.println("I");
        break;
    case 2:
     System.out.println("II");
        break;
    case 3 :
    System.out.println("III");
        break;
    case 4:
    System.out.print("IV");
        break;
    case 5:
     System.out.println("V");
        break;
    case 6:
     System.out.println("VI");
        break;
    case 7:
    System.out.println("VII");
        break;
    case 8:
     System.out.println("IIX");
        break;
    case 9:
      System.out.println("IX");
        break;
    case 10:
     System.out.println("X");
        break;
    
    default:
     System.out.println("That number is not between one and ten!");

    
}
 
}
}