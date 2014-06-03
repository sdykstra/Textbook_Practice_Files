package Chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class GuessTheNumber {

    private static Scanner keys = new Scanner(System.in);

    public static void main(String args[]) {
        guessingGame();

    }//end main

    public static void guessingGame() {
        boolean play = true;
        Random randomNum = new Random();
        int numToGuess = randomNum.nextInt(1000) + 1;
        System.out.printf("This is the guessing game, please guess a number between \n"
                + "1 and 1000. I will help along the way. Good luck. ;0 \n"
                + "\n\n\n please make your guess:");
        int countGuesses = 0;
        do {
            int guess = keys.nextInt();
            countGuesses++;
            if (guess == numToGuess) {
                if (countGuesses < 10) {
                    System.out.println("Either you know the secert or you got lucky.");
                } else if (countGuesses == 10) {
                    System.out.println("Aha, you  know the secert.");

                } else {
                    System.out.println("You could have done better.");

                }

                System.out.printf("Hooray now that you have guessed the number!\n"
                        + "\n Do you want to play again.\n"
                        + "put 'y' if yes other ways 'n' \n");
                String awnser = keys.next();
                if ("y".equals(awnser)) {
                    play = false;
                    guessingGame();
                } else if ("n".equals(awnser)) {
                    System.out.println("Thanks for playing");
                    System.exit(0);
                } else {
                    System.out.println("Please enter a vaild choice");
                }
            } else if (guess < numToGuess) {
                System.out.printf("Your number is too small. Please guess again.\n");
            } else {
                System.out.printf("Your number is too LARGE. Please guess again.\n");
            }

        } while (play);
    }
}//end GuessTheNumber
