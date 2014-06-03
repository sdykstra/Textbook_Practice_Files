package Chapter6;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class SqurePrinting {
    
    public static void main (String args []){
        
        Scanner keys = new Scanner(System.in);
        
        System.out.printf("Please enter square size\n");
        int size = keys.nextInt();
        
         System.out.println("Please enter  sysmbol to print @,#,$,%,&,*");
        char fill = keys.next().charAt(0);
        
        for(int i = 0; i < size; i++){
            
            for(int j = 0; j<size; j++){
                System.out.print(fill);
            }
            System.out.println("");
        }
        
    }//end main
    
}
