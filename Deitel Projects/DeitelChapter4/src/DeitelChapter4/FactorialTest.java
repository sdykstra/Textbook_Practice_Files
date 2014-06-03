package DeitelChapter4;


import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class FactorialTest {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        Factorial factorial = new Factorial();
        int num, num1;
        System.out.print("Please enter a number for your probabilityNum:");
        num = keys.nextInt();
        System.out.print("Please enter second number for your probabilityNum:");
        num1 = keys.nextInt();
        System.out.println("Your probabilityNum is: "
                + factorial.probabilityNum(num, num1));

        int i;
        for(i =0; i<3; i++){
            System.out.println("print I:" +i);
        }

    }//end main
}//FactorialTest
