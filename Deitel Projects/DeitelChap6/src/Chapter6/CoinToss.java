package Chapter6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class CoinToss {
    
    public static void main(String args[]){
        
        coinToss();
        
        
    }// end main
    
    public static void coinToss(){
        boolean play = false;
        Scanner keys = new Scanner(System.in);
        do{
        System.out.printf("If you want to flip the coin enter 'y' \n"
                + "other wise enter 'n' .\n");
       String choice = keys.next();
       
       if(  "y".equals(choice)){
           System.out.println(flip());
       }else if("n".equals(choice)){
           System.out.println("Thanks for playing");
           System.exit(0);
       }else{
           System.out.println("Please enter a vaild choice");
       }
    }while(!play);
        }// end coinToss
    
    public static String flip(){
    String coin = null; 
           Random randomNum = new Random();

    int toss = randomNum.nextInt(2) + 1;
    if(toss == 1){
       coin = "HEADS";
    }else{
             coin = "TAILS";
  
    }    
    
    return coin;
    
    }//end flip
    
    
}// end CoinToss
