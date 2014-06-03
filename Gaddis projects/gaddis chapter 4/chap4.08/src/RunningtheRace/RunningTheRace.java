package RunningtheRace;

import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class RunningTheRace {

    public static String findTheWinner(String name1, String name2,
            String name3, double time1, double time2, double time3) {

        String s = null;
        if (time1 > time2 && time1 > time3) {
            s = "the winner is " + name1;
            if (time2 > time3) {
                s += ", with  " + name2 + "in second and " + name3 + "in third";
            } else if (time3 > time2) {
                s += ", with  " + name3 + "in second and " + name2 + "in third";
            }
        } else if (time2 > time1 && time2 > time3) {
            s = "the winner is " + name2;
            if (time1 > time3) {
                s += ", with  " + name1 + "in second and " + name3+ "in third";
            } else if (time3 > time1) {
                s += ", with  " + name3 + "in second and " + name1+ "in third";
            }
        } else if (time3 > time2 && time3 > time1) {
            s = "the winner is "+ name3;
            if (time2 > time1) {
                s += ", with  " + name2 + "in second and " + name1+ "in third";
            } else if (time1 > time2) {
                s += ", with  " + name1 + "in second and " + name2+ "in third";
            }
        }


        return s;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String runner1, runner2, runner3;
        double time1, time2, time3;

        System.out.println("Please enter the runners name ");
        runner1 = keyboard.nextLine();
        System.out.println("Please enter that runners time in seconds ");
        time1 = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.println("Please enter the runners name ");
        runner2 = keyboard.nextLine();
        System.out.println("Please enter that runners time in seconds ");
        time2 = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.println("Please enter the runners name ");
        runner3 = keyboard.nextLine();
        System.out.println("Please enter that runners time in seconds ");
        time3 = keyboard.nextDouble();



        System.out.println(findTheWinner(runner1, runner2, runner3, time1, time2, time3));
    }
}
