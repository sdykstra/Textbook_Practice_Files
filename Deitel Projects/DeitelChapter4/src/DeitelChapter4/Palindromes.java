package DeitelChapter4;


import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class Palindromes {

    Scanner keys = new Scanner(System.in);
    int one, two, three, four, five;

    public void getNumber() {
        int remainder = 0;
        int num;
        System.out.println("Please enter a five digit Palindrome: ");
            num = keys.nextInt();
            
            remainder = num%10;
            five = remainder;
            num = num/10;
            remainder = num%10;
            four = remainder;
             num = num/10;
            remainder = num%10;
            three = remainder;
             num = num/10;
            remainder = num%10;
            two = remainder;
             num = num/10;
            remainder = num%10;
            one = remainder;
             num = num/10;
        
    }//end getNumber

    public void checkNum() {
        if (one == five && two == four) {
            System.out.println("That is a true palindrome ");
        } else {
            System.out.println("That is not a plaindrome");
        }
    }
}// end Palindromes
