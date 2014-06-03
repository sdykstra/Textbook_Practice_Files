
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class TaxPlanAlternatives {

    public static void main(String ars[]) {
        Scanner keys = new Scanner(System.in);
        double housing, foodcloths, cars, maintance, entertainment, utlities;
        boolean marrried = false;
        int children = 0;
        String child = null;

        System.out.printf("This program is to establish your taxes under \n"
                + "a fair tax program. Be as acurate as you can to get a better\n"
                + "idea on what you spend. This will help you have a better \n"
                + "idea of what you will be taxed on this new plan. This plan\n"
                + "only taxs you on perchases with no deductions. So the tax \n"
                + "will come out every time you are at the store.\n\n\n");

        System.out.printf("Please enter 2 if married, 1 other wise\n");
        int marriedNum = keys.nextInt();
        if (marriedNum == 1) {
            marrried = true;
        }


        System.out.printf("Do you have any children?\n");
        child = keys.next();

        if (child.equals("y") || child.equals("yes")) {
            System.out.printf("Please enter the number of children that you have.\n");
            children = keys.nextInt();
        }

        System.out.printf("How much does housing cost each year?\n");
        housing = keys.nextDouble();

        System.out.printf("How much do you spend on food and clothing?\n");
        foodcloths = keys.nextDouble();

        System.out.printf("How much does you car cost each year(payment/ mantance)\n");
        cars = keys.nextDouble();

        System.out.printf("What is your yearly maintance cost?\n");
        maintance = keys.nextDouble();

        System.out.printf("What do you spend on utlities each year?\n");
        utlities = keys.nextDouble();


        System.out.printf("What do you spend on entertainment including resturants?\n");
        entertainment = keys.nextDouble();

        System.out.println(" Ok now to figure out your tax.");
        double taxable = housing + foodcloths + cars + maintance + entertainment + utlities;
        
        double taxes = fairTax(taxable, children, marrried);
        System.out.printf("Your taxes under the fair tax plan would be $%.02f\n",taxes);

    }//end main

    public static double fairTax(double expences, int numChild, boolean married) {
        int prebate = 214;
        double tax = 0;
        if (married) {
            prebate *= 2;
        }
        if (numChild >= 0) {
            prebate += numChild * 76;
        }
        tax = expences - prebate;
        tax = tax*.23;
        return tax;
    }//end fairTax
}//end TaxPlanAlternatives
