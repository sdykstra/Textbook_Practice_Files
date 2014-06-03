package DeitelChapter4;


/**
 *
 * @author Scott Dykstra
 */
public class CreditLimitCal {

    int accountNum, totalItems, lastMonthItems, crdLimit, creditsPaid;
    double begnMnthBal, crrntMnthChrgs, totalBal, currntMonthCredits;

    public CreditLimitCal() {

        accountNum = 0;
        crdLimit = 0;
        begnMnthBal = 0;
        crrntMnthChrgs = 0;
        lastMonthItems = 0;
        totalItems = 0;
        totalBal = 0;
    }

    public void setAccountNum(int num) {
        accountNum = num;
    }

    public void setCreditLimt(int num) {
        crdLimit = num;
    }

    public void adddCrrntMnthChrgs(int num) {
        double check = totalBal;
                check += num;
        if (check < crdLimit) {
            crrntMnthChrgs += num;
            totalBal += num;
            totalItems++;
        } else {
            System.out.println("Your balance is to high to complete this trans action");
        }
    }

    public void setEndMonth() {
        begnMnthBal = totalBal-=currntMonthCredits;
        crrntMnthChrgs = 0;
        currntMonthCredits =0;
       // calIntrest();
        lastMonthItems = totalItems;
        totalItems = 0;
    }

    public void payBalance(double num) {
        currntMonthCredits += num;
        creditsPaid++;
    }

    public void calIntrest() {
        //totalBal += (begnMnthBal * .05);
    }

    public int getNumItems() {
        return totalItems;
    }

    public int getLastMonthNumItems() {
        return lastMonthItems;
    }

    public String getCreditsPaid() {
        String s;
        s = "Total credits paid:" + currntMonthCredits
                + " Total times cedits applied ato account" + creditsPaid;
        return s;
    }
}// end CreditLimitCal
