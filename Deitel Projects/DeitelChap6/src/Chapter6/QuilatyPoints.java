package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class QuilatyPoints {

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);
        int grades = 0;
        System.out.printf("Please enter the number of grades you\n"
                + " want an averge score from.\n");
        int num = keys.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.printf("Please enter grade number %d\n", i+1);
            grades += keys.nextInt();
        }
        int total = grades / num;
        String s = null;

        switch (total/10) {
            case 9:
                s = "4";
                break;
            case 8:
                s = "3";
                break;
            case 7:
                s = "2";
                break;
            case 6:
                s = "1";
                break;
            case 0:
                s = "0";
                break;
        }
        System.out.printf("You earned %s quality points.\n", s);
    }//end main
}//end QuilatyPoints
