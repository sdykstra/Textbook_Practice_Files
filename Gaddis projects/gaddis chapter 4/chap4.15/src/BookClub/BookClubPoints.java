package BookClub;

import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class BookClubPoints {

    public static int bookPoints(int num) {

        if (num == 1) {
            return 5;
        } else if (num == 2) {
            return 15;
        } else if (num == 3) {
            return 30;
        } else if (num >= 4) {
            return 60;
        }
        return 0;
    }// end bookPoint
    
    public static void main(String []args){
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Please enter the number of books you bought the month.");
        int num = keys.nextInt();
        
        System.out.printf("You recieved %d points for your pruchases this month. \n" , bookPoints(num));
    }//end main
}

