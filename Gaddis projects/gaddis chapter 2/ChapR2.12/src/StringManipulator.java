
import java.util.Scanner;

public class StringManipulator {

   
    
    public static void main(String[] args) 
    {
      Scanner keyboard = new Scanner(System.in);  
        
      String cityName, cityChanged;
      char s;
      int stringSize;
      
      System.out.print("Please enter your city name ");
      cityName = keyboard.nextLine();
      
      stringSize = cityName.length();
      System.out.printf("Your city name has %d number of letters \n", stringSize);
      
      cityChanged = cityName.toLowerCase();
      System.out.println("The city name in lower case is " + cityChanged);
      
      cityChanged = cityName.toUpperCase();    
      System.out.println("The city name in all CAPS  is " + cityChanged);
      
      
      s = cityName.charAt(0);
      System.out.println("The first letter in the city name is " + s);
    }
}
