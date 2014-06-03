package DeitelChapter4;

import java.util.Scanner;
/**
 *
 * @author Scott Dykstra
 */
public class FindTheLargetNum {
    Scanner keys = new Scanner(System.in);
    
    int num = 0;
    
    public void FindLargeNumTillDone(){
        int numA;
        
        System.out.print("Please enter first number " +
                " or enter -1 to end input:");
        numA = keys.nextInt();
        
       while(numA > 0){
       if(num< numA){
            num = numA;
        }
        System.out.print("Please enter next number " +
                " or enter -1 to end input:");
         numA = keys.nextInt();
    }
    }//FindLargeNumTillDone 
    
    
        public void FindLargestNum(){
        int numA;
        int counter =0;
        
        System.out.print("Please enter first number ");
        numA = keys.nextInt();
        
        while(  counter <= 9){
        if(num< numA){
            num = numA;
        }
        System.out.print("Please enter next number;");
         numA = keys.nextInt();       
        counter++;
    }
    }// FindLargestNum
    
    public int LargestNUmResults(){
        return num;
    }
   }//end FindLargestNum
