import java.util.Scanner;


public class LandCal {

    
    public static void main(String[] args)
    {
       Scanner keys = new Scanner(System.in);
        
        double acre, landTract, numAcre;
       // landTract = 389767;
        acre = 43560;
        
        System.out.print("Please enter your land in feet :");
        landTract = keys.nextDouble();
        
        
        numAcre = landTract/acre;
        System.out.printf("You have  %,.02f nember of Acres", numAcre);
        
        
        
    }
}
