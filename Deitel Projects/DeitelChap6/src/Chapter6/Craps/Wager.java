package Chapter6.Craps;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Wager {

    Scanner keys = new Scanner(System.in);
    private int balance = 1000;

    public void makeWager(int bet) {
        if (bet <= balance) {
            balance -= bet;
        } else {
            System.out.printf("Please enter smaller wager, your balance is to low.\n");
            int newBet = keys.nextInt();
            makeWager(newBet);
        }
    }//end makeWager

    public int checkBalance() {
        return balance;
    }

    public void wonBet(int intialBet) {
        balance += intialBet + intialBet;
    }//end wonBet

    public void heckel() {
        Random randomNum = new Random();
        String s = null;
        int pickOne = randomNum.nextInt(25) + 1;

        switch (pickOne) {

            case 1:
                break;
            case 2:
                System.out.println("Hey your up big now! Time to cash in");
                break;
            case 10:
                break;
            case 11:
                System.out.println("Sorry you busted");
                break;
            case 16:
                break;
            case 17:
                System.out.println("Oh, goig for broke now!");
                break;
            case 18:
                System.out.println("Come on take a chance!");
                break;
            case 23:
                break;
            case 24:
                System.out.println("Don't you know that gambeling is not good for you.");
                break;
            default:
                break;
        }

    }// end heckel
}// end Wager
