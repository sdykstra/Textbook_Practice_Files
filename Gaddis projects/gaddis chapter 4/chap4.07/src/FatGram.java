
import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class FatGram {

    public static String percentOfFat(int fat, int totalCal) {
        String s;
        
        double percent = fat / totalCal;
        if (percent <= .30) {
            s = "your food is low in fat ";
        } else {
            s = " your food is not low in fat ";
        }

        return s;
    }

    public static void main(String[] args) {
        int totalCal, fatCal;

        Scanner keys = new Scanner(System.in);
        System.out.print("Please enter the amount of calories  in your food ");
        totalCal = keys.nextInt();

        System.out.print("Please enter the amount of fat calories in your food ");
        fatCal = keys.nextInt();

        System.out.print(percentOfFat(fatCal, totalCal));
    }
}
