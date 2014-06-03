package Chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class ComputerAssistedInstruction {

    private static Scanner keys = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String args[]) {
        multplcation();

    }//end main

    public static void multplcation() {
        int num1 = 0;
        int num2 = 0;
        int numCorrect = 0;

        System.out.printf("Please use your brain to solve the next ten questions.\n");

        for (int i = 0; i < 10; i++) {
            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;
            boolean correct = true;
            System.out.printf("What is %d * %d :\n", num1, num2);
            int awnser = keys.nextInt();

            int correctAnswer = num1 * num2;
            do {
                if (correctAnswer == awnser) {
                    numCorrect++;
                    goodwork();
                    correct = false;
                } else {
                    doBetter();
                    awnser = keys.nextInt();

                }
            } while (correct);

        }
        System.out.printf("You have solved all ten questions.\n Play again? y or n\n");
        String awnser = keys.next();
        if ("y".equals(awnser)) {

            multplcation();
        } else if ("n".equals(awnser)) {
            System.out.println("Thanks for playing");
            System.exit(0);
        } else {
            System.out.println("Please enter a vaild choice");
        }

    }// end  

    public static void goodwork() {
     Random randomNum = new Random();
        String s = null;
        int pickOne = randomNum.nextInt(4) + 1;

        switch (pickOne) {

            case 1:
                System.out.println("Very good!");

                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice Work!");

                break;
            case 4:
                System.out.println("Keep up the Good Work!");

                break;
            
            default:
                break;
        }

    }// end goodwork

    public static void doBetter() {
        Random randomNum = new Random();
        String s = null;
        int pickOne = randomNum.nextInt(4) + 1;

        switch (pickOne) {

            case 1:
                System.out.println("Wrong. Try once more.");

                break;
            case 2:
                System.out.println("No. Please try again");
                break;
            case 3:
                System.out.println("Dont give up!");

                break;
            case 4:
                System.out.println("No. Keep Trying");

                break;
            
            default:
                break;
        }

    }// end doBetter
}//end ComputerAssistedInstruction
