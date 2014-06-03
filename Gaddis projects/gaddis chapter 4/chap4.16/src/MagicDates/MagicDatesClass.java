package MagicDates;

import java.util.Scanner;

/**
 *
 * @author ft
 */
public class MagicDatesClass {

    public static boolean magicDate(int d, int m, int y) {

        int both = (d * m);
        if ( both == y) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int month, day, year;

        System.out.println("Please your birth year as to digits");
        year = keyboard.nextInt();

        System.out.println("Please enter your birth month using numbers. ");
        month = keyboard.nextInt();

        System.out.println("Please enter birthday day date");
        day = keyboard.nextInt();
        
        if(magicDate(day, month, year)){
            System.out.println("Your birthday is a Magic Number");
        }else{ 
            System.out.println("Sorry your birhtday is not a Magic Number");
        }

    }
}
