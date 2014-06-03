
import java.util.Scanner;

/**
 * @author Scott Dykstra
 */
public class TestAverage {

    public static void main(String[] args) 
    {
        Scanner keys = new Scanner(System.in);
        double test1, test2, test3;

        System.out.println("Please enter 1st test score: ");
        test1 = keys.nextDouble();

        System.out.println("Please enter 2nd test score: ");
        test2 = keys.nextDouble();

        System.out.println("Please enter 3rd test score: ");
        test3 = keys.nextDouble();
        
        TestScore a = new TestScore( test1, test2, test3);
        
        System.out.printf("The average for the three test is %.2f ", a.testAverage());
        
    }
}
