package Chapter6;

import java.util.Random;

/**
 *
 * @author FT
 */
public class RandomNumberGenerator {

    public static void main(String args[]) {
        Random randomNum = new Random();
 
        int one = randomNum.nextInt(2) + 1;
        int two = randomNum.nextInt(100) + 1;
        int three = randomNum.nextInt(9);
        int four = randomNum.nextInt(112) + 1000;
        int five = randomNum.nextInt(1) - 1;
        int six = randomNum.nextInt(14) - 3;

System.out.printf("1 <= %d <=2 \n",one);
System.out.printf("1 <=%d <= 100\n",two);
System.out.printf("0 <= %d <= 9\n",three);
System.out.printf("1000 <= %d <= 1112\n",four);
System.out.printf("-1 <=%d <= 1\n",five);
System.out.printf("-3 <= %d <= 11\n",six);


        int even = 2*(randomNum.nextInt(5) +1);
System.out.printf("print even %d\n",even);


  int odd =( 2*(randomNum.nextInt(5) +1))+1;
System.out.printf("print even %d\n",odd);

 int oddDoubled =((2*(randomNum.nextInt(5) +1))+1)*2;
System.out.printf("print even %d\n", oddDoubled);

    }//end main
}
