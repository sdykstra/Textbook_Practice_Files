package DeiteChapter3;


import java.util.Scanner;

/**
 *
 * @author ft
 */
public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.50);

        System.out.printf("account1 balance: $%.2ff\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2ff\n", account2.getBalance());

        Scanner input = new Scanner(System.in);

        double depositAmount, withdrawlAmount;

        System.out.print("Enter the deposit amount for account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account1 balance \n\n", depositAmount);
        account1.credit(depositAmount);

        System.out.printf("account1 balcance %.2f\n", account1.getBalance());
        System.out.printf("account2 balcance %.2f\n", account2.getBalance());

        System.out.print("Enter the deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account1 balance \n\n", depositAmount);
        account2.credit(depositAmount);

        System.out.printf("account1 balcance %.2f\n", account1.getBalance());
        System.out.printf("account2 balcance %.2f\n", account2.getBalance());
        
        System.out.print("Enter the withdrawl amount for account1: ");
        withdrawlAmount = input.nextDouble();
        System.out.printf("\nchecking %.2f against account1 balance \n\n", withdrawlAmount);
        account1.debit(withdrawlAmount);
        
        System.out.printf("account1 balcance %.2f\n", account1.getBalance());
        System.out.printf("account2 balcance %.2f\n", account2.getBalance());
        
    }//end main
}// end Account class
