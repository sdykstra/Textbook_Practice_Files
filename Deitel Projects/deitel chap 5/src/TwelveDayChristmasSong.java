
/**
 *
 * @author FT
 */
public class TwelveDayChristmasSong {

    public static void main(String args[]) {
        int verse = 12;
        for (int i = 0; i < 12; i++) {
            System.out.print("On the twelfth day of Christmas, my true love gave to me...");
            switch (verse) {
                case 1:
                    System.out.printf("12 Drummers Drumming\n");
                case 2:
                    System.out.println("11 Pipers Piping");
                case 3:
                    System.out.println("10 Lords-a-Leaping");
                case 4:
                    System.out.println("9 Ladies Dancing");
                case 5:
                    System.out.println("8 Maids-a-Milking");
                case 6:
                    System.out.println("7 Swans-a-Swimming");
                case 7:
                    System.out.println("6 Geese-a-Laying");
                case 8:
                    System.out.println("5 Gold Rings");
                case 9:
                    System.out.println("4 Colly Birds");
                case 10:
                    System.out.println("3 French Hens");
                case 11:
                    System.out.println("2 Turtle Doves and");
                case 12:
                    System.out.println("A Partridge in a Pear Tree.");
                    System.out.printf("\n");
                    verse--;
            }
        }

    }//end main
}
