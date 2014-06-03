package DeiteChapter3;

import java.util.Scanner;

/**
 *
 * @author ft
 */
public class TargetHeartRateCalTest {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        TargetHeartRateCal person = new TargetHeartRateCal();


        System.out.println("Please enter your first name : ");
        person.setFirstName(keys.nextLine());

        System.out.println("Please enter your last name : ");
        person.setLastName(keys.nextLine());

        System.out.println("Please enter your birth month number : ");
        person.setMonth(keys.nextInt());

        System.out.println("Please enter your birth day : ");
        person.setDay(keys.nextInt());

        System.out.println("Please enter your birth year : ");
        person.setYear(keys.nextInt());

        System.out.printf("Hello %s %s your birthday is %s and age is %d. \n"
                + "Your maximum heart rate is %d.\n " +
                "Your target heart rate is %s.\n",
                person.firstName, person.lastName, person.displayBirthDate(),
                person.age(),person.maximumHeartRate(), 
                person.targetHeartRate());


    }
}
