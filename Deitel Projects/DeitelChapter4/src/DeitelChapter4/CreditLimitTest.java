package DeitelChapter4;


import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class CreditLimitTest {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        CreditLimitCal account1 = new CreditLimitCal();

        account1.setAccountNum(1000);
        account1.setCreditLimt(100);
        account1.adddCrrntMnthChrgs(45);
        System.out.println("add "+account1.begnMnthBal + "," + account1.totalBal + ", "
                + account1.crrntMnthChrgs);
        account1.adddCrrntMnthChrgs(50);
        account1.payBalance(95);
        System.out.println("pay"+account1.begnMnthBal + "," + account1.totalBal + ", "
                + account1.crrntMnthChrgs);
        account1.setEndMonth();
        System.out.println("end"+account1.begnMnthBal + "," + account1.totalBal + ", "
                + account1.crrntMnthChrgs);

        account1.adddCrrntMnthChrgs(45);
        account1.setEndMonth();
        System.out.println("end"+account1.begnMnthBal + "," + account1.totalBal + ", "
                + account1.crrntMnthChrgs);
        account1.adddCrrntMnthChrgs(50);
        System.out.println("add"+account1.begnMnthBal + "," + account1.totalBal + ", "
                + account1.crrntMnthChrgs);
        account1.payBalance(30);

        System.out.println(account1.begnMnthBal + "," + account1.totalBal + ", "
                + account1.crrntMnthChrgs);
         account1.setEndMonth();
        System.out.println("end"+account1.begnMnthBal + "," + account1.totalBal + ", "
                + account1.crrntMnthChrgs);
    }// end main
}// end CreditLimitTest
