package DeiteChapter3;


public class Account {

    private double balance;

    public Account(double initalBalance) {
        if (initalBalance > 0.0) {
            balance = initalBalance;
        }

    }// end constructor

    public void credit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double debitAmount) {

        if (debitAmount < balance) {
            balance = -debitAmount;
        } else {
            System.out.println("The withdrawl amount is more then the balance");

        }
    }
}
