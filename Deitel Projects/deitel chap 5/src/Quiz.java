
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class Quiz {

    static Scanner keys = new Scanner(System.in);

    public static void main(String args[]) {
        int answerNum = 0;
        int correctNum = 0;
        
        System.out.println("This is a quiz with five questions");
        
        for (int i = 0; i < 5; i++) {
            answerNum = askQuestion();
            int num = keys.nextInt();
            if (num == answerNum) {
                correctNum++;
            }
        }
        System.out.printf("You got %d correct on this quiz.\n", correctNum);

    }//end main
    static int questionNumber = 0;

    public static int askQuestion() {
        int awnser = 0;
        questionNumber++;

        switch (questionNumber) {
            case 1:
                System.out.printf("question 1\n"
                        + " \n"
                        + "The Answer is 2\n"
                        + " \n"
                        + "\n\n");
                awnser = 2;
                break;
            case 2:
                System.out.printf("question 2\n"
                        + "\n"
                        + "The Answer is 2\n"
                        + "\n"
                        + "\n\n");
                awnser = 2;
                break;
            case 3:
                System.out.printf("question 3 \n"
                        + " \n"
                        + " \n"
                        + "The Answer is 3\n"
                        + " \n\n");
                awnser = 3;
                break;
            case 4:
                System.out.printf("question 4 \n"
                        + " \n"
                        + " \n"
                        + " \n"
                        + "The Answer is 4\n\n");
                awnser = 4;
                break;
            case 5:
                System.out.printf("question 5 \n"
                        + "The Answer is 1\n"
                        + " \n"
                        + " \n"
                        + "\n\n");
                awnser = 1;
                break;
        }
        return awnser;
    }//end Quiz
}