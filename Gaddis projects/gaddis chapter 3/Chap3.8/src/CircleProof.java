import java.util.Scanner;
/**
 * @author Scott Dykstra
 */
public class CircleProof 
{
    

    public static void main(String [] args)
    {
     Scanner keys = new Scanner(System.in);
        
    System.out.println("Please enter the radius of your circle :");
    double cirRad = keys.nextDouble();
    
    Circle a = new Circle(cirRad);
     
    System.out.printf("The area of your circle is %.2f.\n", a.getArea());
    System.out.printf("The diameter of your circle is %.2f.\n",a.getDiameter());
    System.out.printf("The circumference of your circle was %.2f.\n",a.getCircumference());
    
    }
    
}
