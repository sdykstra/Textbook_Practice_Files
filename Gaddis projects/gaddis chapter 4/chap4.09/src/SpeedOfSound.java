
import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class SpeedOfSound {


    private  static double time;

    public  static double getSpeedInAir(int distance) {

        return time = distance/1100.0;
    }

    public static double getSpeedInWater(int distance) {

        return time = distance/4900.0;
    }

    public static double getSpeedInSteel(int distance) {

        return time = distance/16400.00;
    }

    public  static double getSpeed(String name, int distance) {
      name = name.toLowerCase();
      
        if (name.equals("air")) {
            time = getSpeedInAir(distance);
        } else if (name.equals("water")) {
            time = getSpeedInWater(distance);
        } else if (name.equals("steel")) {
            time = getSpeedInSteel(distance);
        } 
        return time;
    }// end getSpeed

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);


        System.out.print("To find the time it woulf take to travel through a "+
                " type materal enter 'air' , 'water' or 'steel' ");
        String name = keys.next();
 
        System.out.println(" Now enter the distance traveled ");
        int distance = keys.nextInt();

        
        System.out.print("The speed through "+ name+"  was "+getSpeed(name, distance));
    }// end main
}// end SpeedOfSound
