
import java.util.Scanner;

public class BankCharges {
    
    int numChecks;
    double bankBalance;
    
    public class Account{
        public Account (int num, double balance){
    numChecks = num;
    bankBalance = balance; 
        }
    }
    
    public  static double checkFee(int num, double balance){
        double fee=10;
        if ( balance< 400){
            fee += 15;
        }
        if(num<20){
           fee += (num*.10); 
        }
      else if (num<39){
            fee += (num*.08);
        }else if (num<59){
            fee += (num*.06);
        }else if (num>60){
            fee += (num*.04);
        }
        return fee;
    } 
     
    public static void main(String[] args){
        
        Scanner keys = new Scanner(System.in);
        double balance;
        int numChecks;
        
        
        System.out.println(" Please enter your bank balance ");
        balance = keys.nextDouble();
        
        System.out.println("Please enter the number of checks writen ");
        numChecks = keys.nextInt();
        
        System.out.print("Yor bank fees for the month equal : $"+ checkFee(numChecks, balance));
        
        
    }
    
}
