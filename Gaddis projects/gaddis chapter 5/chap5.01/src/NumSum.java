
import java.util.Scanner;

public class NumSum
{
    public static void main (String[] args)
    {
    Scanner keys = new Scanner(System.in);

int number = 0;

System.out.println("Please enter a whole number and I will return its sum from zero ");
number = keys.nextInt();


    int numAdd =0;
    int numTotal = 0;
for(int k=0; k<= number; k++)
 {

    numAdd += k;
    numTotal = numAdd;
 }

   System.out.println("Your number is " + numTotal);
}
