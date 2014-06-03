package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class TempConvertor {

    static double celsius = 0;
    static double fahrenheit = 0;

    public static double getCelsius(int fehren) {
        celsius = 5.0 / 9.0 * (fehren - 32);
        return celsius;
    }

    public static double getFahrenheit(int celsiusIn) {
        fahrenheit = 9.0 / 5.0 * (celsiusIn + 32);
        return fahrenheit;
    }

    public static double figTemp(String in, int intIn) {

        double tempOut = 0;


        if ("C".equals(in)) {
            tempOut = getFahrenheit(intIn);

        } else if ("F".equals(in)) {
            tempOut = getCelsius(intIn);

        } else {
            tempOut = 99999;
        }


        return tempOut;
    }// end figTemp

    public static void main(String args[]) {

        Scanner keys = new Scanner(System.in);
        double convertedNum = 0;

        do {
            System.out.println(" Please enter F or C then your number to convert");
            String value = keys.next();
            int numValue = keys.nextInt();

            convertedNum = figTemp(value, numValue);

            if (convertedNum == 99999) {
                System.out.println("Plese enter valid inputType");
            } else if ("F".equals(value)) {
                System.out.printf("Your fahrenheit number is converted to :%.3f in celsius\n",  convertedNum);
            } else {
                System.out.printf("Your celsius number is converted to :%.3f in fahrenheit\n",  convertedNum);

            }
        } while (convertedNum == 99999);
    }//end main
}
