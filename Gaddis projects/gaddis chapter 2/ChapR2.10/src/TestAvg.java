import java.util.Scanner;



public class TestAvg {

    public static void main(String[] args)
    {
       
        Scanner keys = new Scanner(System.in);
        
        
        int test1, test2, test3, avg;
        
        System.out.print("Please enter the first test grade : ");
        test1 = keys.nextInt();
        
        System.out.print("Please enter the second test grade : ");
        test2 = keys.nextInt();
                
        System.out.print("Please enter the third test grade : ");
        test3 = keys.nextInt();
        
        
        avg = ((test1+ test2 + test3)/3);
        System.out.print("The average test grade is : " + avg);
        
                
    }
}
