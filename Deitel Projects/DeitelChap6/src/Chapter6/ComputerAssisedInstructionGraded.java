package Chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 *
 * @author FT
 */
public class ComputerAssisedInstructionGraded {

    private static Scanner keys = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String args[]) {
        System.out.printf("Please use your brain to solve the next ten questions.\n"
                + "Please enter your diffaculty level 1 - 10. "
                + "Please enter the type of problem you want to solve.\n "
                + "1 for Addtion, 2 for Subtraction, "
                + "3 for multplcation, 4 for division\n "
                + "or 5 for a mix of all types. ");

        int diffNum = keys.nextInt();
        int type = keys.nextInt();
        int units = 10;
        double numRight = 0;

        if (type == 1) {
            numRight = addtion(diffNum, units);
        } else if (type == 2) {
            numRight = subtraction(diffNum, units);
        } else if (type == 3) {
            numRight = multplcation(diffNum, units);
        } else if (type == 4) {
            numRight = division(diffNum, units);
        } else {
            numRight = randomMix(diffNum);
        }
        gradeReturn(numRight, units);

    }//end main

    public static int multplcation(int diff, int units) {
        int num1 = 0;
        int num2 = 0;
        int numCorrect = 0;
        int numQuestions = units;


        int challenge = diff * 10;
        for (int i = 0; i < numQuestions; i++) {
            num1 = random.nextInt(challenge) + 1;
            num2 = random.nextInt(challenge) + 1;

            System.out.printf("What is %d * %d :\n", num1, num2);
            int awnser = keys.nextInt();

            int correctAnswer = num1 * num2;

          ifCorrect( awnser,  correctAnswer);


        }
        return numCorrect;
    }// end  multplcation

    public static int addtion(int diff, int units) {
        int num1 = 0;
        int num2 = 0;
        int numCorrect = 0;
        int numQuestions = units;


        int challenge = diff * 10;
        for (int i = 0; i < numQuestions; i++) {
            num1 = random.nextInt(challenge) + 1;
            num2 = random.nextInt(challenge) + 1;

            System.out.printf("What is %d + %d :\n", num1, num2);
            int awnser = keys.nextInt();

           
            int correctAnswer = num1 + num2;

          ifCorrect( awnser,  correctAnswer);
        }

        return numCorrect;

    }// end  addtion

    public static int subtraction(int diff, int units) {
        int num1 = 0;
        int num2 = 0;
        int numCorrect = 0;
        int numQuestions = units;


        int challenge = diff * 10;
        for (int i = 0; i < numQuestions; i++) {
            num1 = random.nextInt(challenge) + 1;
            num2 = random.nextInt(challenge) + 1;
            int awnser = 0;
            int correctAnswer = 0;
            if (num1 > num2) {
                System.out.printf("What is %d - %d :\n", num1, num2);
                awnser = keys.nextInt();
                correctAnswer = num1 - num2;
            } else {
                System.out.printf("What is %d - %d :\n", num2, num1);
                awnser = keys.nextInt();
                correctAnswer = num2 - num1;
            }



            

          ifCorrect( awnser,  correctAnswer);
        }
        return numCorrect;
    }// end  subtraction

    public static double division(int diff, int units) {
        int num1 = 0;
        int num2 = 0;
        double numCorrect = 0;
        int numQuestions = units;


        int challenge = diff * 10;
        for (int i = 0; i < numQuestions; i++) {
            num1 = random.nextInt(challenge) + 1;
            num2 = random.nextInt(challenge) + 1;
            double awnser = 0;
            double correctAnswer = 0;
            if (num1 > num2) {
                System.out.printf("What is %d / %d :\n", num1, num2);
                awnser = keys.nextInt();
                correctAnswer = num1 - num2;
            } else {
                System.out.printf("What is %d / %d :\n", num2, num1);
                awnser = keys.nextDouble();
                correctAnswer = num2 / num1;
            }



           
           

          ifCorrectDivison( awnser,  correctAnswer);
        }
        return numCorrect;

    }// end  division

    private static int randomMix(int diff) {
        int numCorrect = 0;

        Random randomNum = new Random();
        for (int j = 0; j < 10; j++) {
            int pickOne = randomNum.nextInt(4) + 1;

            switch (pickOne) {

                case 1:
                    numCorrect += addtion(diff, 1);


                    break;
                case 2:
                    numCorrect += subtraction(diff, 1);

                    break;
                case 3:
                    numCorrect += multplcation(diff, 1);


                    break;
                case 4:
                    numCorrect += division(diff, 1);

                    break;

                default:
                    break;
            }
        }

        return numCorrect;
    }

    public static double ifCorrect(int answer, int correctAnswer) {
        double numCorrect = 0;
        int count = 0;
        boolean correct = true;
        do {
            if (correctAnswer == answer) {
                if (count == 2) {
                    correct = false;
                    numCorrect = 0;
                } else if (count == 1) {
                    numCorrect = .5;
                } else {
                    numCorrect = 1;
                }
                goodwork();
                correct = false;
            } else {
                if (count == 2) {
                    doBetter();
                    correct = false;
                    numCorrect = 0;
                } else {
                    doBetter();
                    answer = keys.nextInt();
                }
            }
        } while (correct);
        return numCorrect;
    }
public static double ifCorrectDivison(double answer, double correctAnswer) {
        double numCorrect = 0;
        int count = 0;
        boolean correct = true;
        do {
            if (correctAnswer == answer) {
                if (count == 2) {
                    correct = false;
                    numCorrect = 0;
                } else if (count == 1) {
                    numCorrect = .5;
                } else {
                    numCorrect = 1;
                }
                goodwork();
                correct = false;
            } else {
                if (count == 2) {
                    doBetter();
                    correct = false;
                    numCorrect = 0;
                } else {
                    doBetter();
                    answer = keys.nextInt();
                }
            }
        } while (correct);
        return numCorrect;
    }

    public static void gradeReturn(double numCorrect, int numQuestions) {
        double grade = numCorrect / numQuestions;

        System.out.printf("Your grade is %.1f", grade);

        if (grade > 7.5) {
            System.out.printf(" Congratulations, \n you are ready to move up to the next level!\n");
        } else {
            System.out.println(" Please  ask your teacher for extra help.");
        }
        System.exit(0);

    }

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
}//end ComputerAssisedInstructionGraded