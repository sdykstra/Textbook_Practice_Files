
import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        String name, city, age, college, animalType, petName, proffession;

        System.out.print("Plese enter your name ");
        name =keys.nextLine();
        System.out.print("Please enter the city that you live ");
        city = keys.nextLine();
        System.out.print("Please enter your age ");
        age = keys.nextLine();
        System.out.print("What college did you graduate from?  ");
        college = keys.nextLine();
        System.out.print("What type of pet do yo have? ");
        animalType = keys.nextLine();
        System.out.print("What is your pets name? ");
        petName = keys.nextLine();
        System.out.print("What is your proffession ? ");
        proffession = keys.nextLine();
        
        
        
        System.out.printf("There once was a person named %s who lived in \n" +
                " the city of %s. At the age of  %s, went to college  at %s. \n" +
                " %s graduated and went to work as a %s. Then, %s adopted an anmial \n " +
                "named %s. They both lived happily ever after!", 
                name, city, age, college, name, proffession,name, animalType, petName );
        keys.nextLine();


    }
}
