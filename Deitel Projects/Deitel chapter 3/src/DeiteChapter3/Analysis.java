package DeiteChapter3;

import java.util.Scanner;


public class Analysis {

    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    
    int passes = 0;
    int failures = 0;
    int studentCounter = 1;
    int result;
    
    while( studentCounter <= 10){
    
    System.out.print("Enter result( 1 = pass, 2 = fail):");
    result = input.nextInt();
    
    if (result == 1){
        passes++;
    }else{
        failures++;
    }
    
    
    studentCounter++;
}// end while
    
    System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
    
    if (passes >8){
        System.out.println("Bonus to instructor");
    }
    
    }// end main

}// end Analysis


