import java.util.Scanner;
/**
 *
 * @author ft
 */
public class Income {


    public static void main(String[] args) 
    {
      Scanner keyboard = new Scanner(System.in);
      double income;
      System.out.print("Please enter your annual income :");
      income = keyboard.nextDouble();
      System.out.printf("Your income is : $ %,.2f\n ", income);
        
    }
}
