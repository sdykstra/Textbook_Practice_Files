package DeiteChapter3;

import java.util.Scanner;
/**
 *
 * @author ft
 */
public class HealthProfileTest {
    
    public static void main(String [] args){
        
       Scanner keys = new Scanner(System.in);
        HealthProfile person = new HealthProfile();


        System.out.print("Please enter your first name: ");
        person.setFirstName(keys.nextLine());

        System.out.print("Please enter your last name: ");
        person.setLastName(keys.nextLine());
        
        System.out.print("Please enter your gender: ");
        person.setGender(keys.nextLine());
        
        System.out.print("Please enter your birth month number: ");
        person.setMonth(keys.nextInt());

        System.out.print("Please enter your birth day: ");
        person.setDay(keys.nextInt());

        System.out.print("Please enter your birth year: ");
        person.setYear(keys.nextInt());

        System.out.print("Please enter your height in inches: ");
        person.setHeight(keys.nextInt());
        
        System.out.print("Please enter your weight in pounds: ");
        person.setWeight(keys.nextInt());
        
        System.out.printf("Hello %s %s\n Please check to make sure your information"+
                " is correct.\n ", person.firstName, person.lastName);
        System.out.printf ("Birthday: %s\n Age: %d \n Gender: %s\n"+
                " Height: %d\n Weight: %d\n",person.getBirthDate(),
                person.getAge(),person.getGender(), person.getHeight(), 
                person.getWeight());
                
        System.out.printf("Your maximum heart rate is %d.\n" +
                "Your target heart rate is %s.\n", person.maximumHeartRate(), 
                person.targetHeartRate());
        System.out.println(person.BMI());
 
        
    }// end main class
    
}// end HealthProfileTest
