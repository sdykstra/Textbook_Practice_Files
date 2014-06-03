package DistanceTraveled;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author nod
 */
public class DistanceTraveled {

    public static double getDistance(double time, int speed) {

        double distance = 0;

        distance = time * speed;


        return distance;
    }// end getDistance

    public static void main(String[] args) {

        Scanner keys = new Scanner(System.in);
        double time;
        int speed;
        System.out.println("Please enter the time that you traveled");
        time = keys.nextDouble();
        while (time < 1) {
            System.out.println("Please enter a vaild time that you traveled");
            time = keys.nextDouble();
        }

        System.out.println("Please enter the average speed. ");
        speed = keys.nextInt();
        while (speed < 1) {
            System.out.println("Please enter a vaild speed.");
            speed = keys.nextInt();
        }
        try{


        PrintWriter out =new PrintWriter("Data");

        out.printf("You traveled %.2f miles on your trip.", getDistance(time, speed));
     
        System.out.printf("You traveled %.2f miles on your trip.", getDistance(time, speed));

                out.close();
                System.exit(0);
            } catch (Exception ex) {
                System.out.println("Problem saving to [" + "Data" + "]" + ex);

                System.exit(10000);
            }

    }// end main
}// end DistanceTraveled

