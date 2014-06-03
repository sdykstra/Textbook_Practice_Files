package Hotel;

import java.util.Scanner;

/**
 *
 * @author ft
 */
public class HotelOccupancy {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double floors = 0, rooms = 0, occuped = 0;
        System.out.println("Please enter the number of floor for your hotel. ");
        floors = key.nextInt();

        for (int k = 1; k <= floors; k++) {
            System.out.printf("Please enter the number of rooms on floor %d number. \n ", k);
            rooms += key.nextInt();


            System.out.print("Please enter the number of rooms on floor that have guest. \n");
            occuped += key.nextInt();

            while (rooms < occuped) {
                System.out.print("Please enter the correct number of rooms on floor that have guest. \n");
                occuped += key.nextInt();
            }
        }

        System.out.printf("The hotel has a total of %.0f rooms. \n", rooms);
        System.out.printf("The hotel has a total  of %.0f rooms with guest. \n ", occuped);

        double vacant = rooms - occuped;

        System.out.printf("The hotel has %.02f number of empty rooms. \n", vacant);

        double occRate = 0;
        occRate = (occuped / rooms)*100;

       
                 
     

        System.out.printf("The Hotel is %.0f percent full.\n", occRate);

    }// end main
}// end HotelOccupancy
