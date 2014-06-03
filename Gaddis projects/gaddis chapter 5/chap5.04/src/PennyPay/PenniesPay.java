
package PennyPay;

import java.util.Scanner;

/**
 *
 * @author ft
 */
public class PenniesPay {
    

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int days;
                
       double pay =.01;
        int k = 2;
        
        System.out.printf("Please enter the number of days worked. \n");
        days = key.nextInt();
        
        
        while(days<1){
        System.out.printf("Please enter a valid number of days worked. \n");
        days = key.nextInt();
        }
        
       for(k=1; k<=days; k++){
           
           System.out.printf("%d \t\t %.02f\n", k,pay );
           pay = pay*2;
       }
        
        
    }//end main
}// end PenniesPay
