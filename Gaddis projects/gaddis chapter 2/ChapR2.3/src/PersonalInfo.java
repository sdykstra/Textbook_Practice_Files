import java.util.Scanner;


public class PersonalInfo {


    public static void main(String[] args) 
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        
      String fullName, streetName, state, collegeMajor;
      int phoneNum, zipCode, houseNum;
      
      System.out.print("Please enter your full name :");
      fullName = keyboard.nextLine();
      
      System.out.print("Please enter your house nummber :");
      houseNum = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter your street name :");
      streetName = keyboard.nextLine();
      
      System.out.print("Please enter you zip code :");
      zipCode = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the state the you live :");
      state = keyboard.nextLine();
      
      System.out.print("Please enter your telephone without dashes : ");
      phoneNum = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print(" Please enter your College Major :");
      collegeMajor = keyboard.nextLine();
      
      System.out.printf("Please check the information that you entered: \n your name is %s\n" 
               + " your street address is %d %s  %s %d \n and your phone number is %d\n" 
            +  "Lastly you College Major is %s", fullName, houseNum, streetName, state, zipCode, phoneNum, collegeMajor );
      
      
    }
}
