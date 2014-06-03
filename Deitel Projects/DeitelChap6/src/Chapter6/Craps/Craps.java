package Chapter6.Craps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Craps {

    Scanner keys = new Scanner(System.in);
    public Wager wager = new Wager();
    ;
    private static final Random randomNumbers = new Random();

    //enumeration with constants that represnt the game status
    private enum Status {

        CONTINUE, WON, LOST
    };
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public void play() {
        int myPoint = 0;
        Status gameStatus;
        int bet = 0;
        int sumOfDie =0;
        if (wager.checkBalance() ==0){
            System.out.println("You are out of money you lost.");
            System.exit(0);
        }else{
        System.out.printf("Please place you bet your current balance is %d\n", wager.checkBalance());
        bet = keys.nextInt();
        wager.makeWager(bet);
        sumOfDie = rollDice();
    }
        switch (sumOfDie) {
            case SEVEN:// win with 7 on first roll
            case YO_LEVEN:// win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:// lose with 2 on first roll
            case TREY:// lose with 3 on first roll
            case BOX_CARS:// lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default:// did not win or los, so remember point
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDie;
                System.out.printf("Point is %d\n", myPoint);
                break;
        }// end switch



        // while game not complete

        while (gameStatus == Status.CONTINUE) {

            sumOfDie = rollDice();
            wager.heckel();
            if (sumOfDie == myPoint) {
                gameStatus = Status.WON;
                wager.wonBet(bet);
                wager.heckel();
            } else if (sumOfDie == myPoint) {
                gameStatus = Status.LOST;
                // wager.heckel();
            }
            // wager.heckel();

            if (gameStatus == Status.WON) {
                //wager.wonBet(bet);
                System.out.printf("Player Wins! \n");
                // wager.heckel();
                System.out.printf("Your account balance is now %d\n", wager.checkBalance());
            } else {
                System.out.printf("Player loses \n "
                        + "Your account balance is now %d\n", wager.checkBalance());
                // wager.heckel();

            }

            System.out.printf(" Do roll again?\n"
                    + " 'y' or 'n' \n");
            String awnser = keys.next();
            if ("y".equals(awnser)) {
                gameStatus = Status.CONTINUE;
                play();
            } else if ("n".equals(awnser)) {
                System.out.println("Thanks for playing");
                System.exit(0);
            } else {
                System.out.println("Please enter a vaild choice");
            }

        }// end while game not complete





    }// end play

    public int rollDice() {
        int die1 = randomNumbers.nextInt(6) + 1;
        int die2 = randomNumbers.nextInt(6) + 1;
        int sum = die1 + die2;

        System.out.printf("Player rolled: %d + %d = %d\n", die1, die2, sum);

        return sum;
    }// end rollDie
}// end Craps
