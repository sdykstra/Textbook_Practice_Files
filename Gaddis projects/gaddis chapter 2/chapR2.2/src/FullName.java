import java.util.Scanner;
/**
 *
 * @author ft
 */
public class FullName {


    public static void main(String[] args) 
    {
        
       Scanner keyboard = new Scanner(System.in); 
        
       String name, firstName, secondName, lastName;
       char f1, s2, l3;
       
       System.out.print("Please enter your first name: ");
       name = keyboard.nextLine();
       firstName = name;
       System.out.print(" Plese enter you second name ");
       name = keyboard.nextLine();
       secondName = name;
       System.out.print("Please enter your last name ");
       name = keyboard.nextLine();
       lastName = name;
       System.out.println("Your full name is " + firstName+ " "  + secondName + " " + lastName);
       
       f1 = firstName.charAt(0);
       s2 = secondName.charAt(0);
       l3 = lastName.charAt(0);
       
       System.out.println("Your initials are " + f1 + " "+ s2 + " " + l3);
       
    }
}
