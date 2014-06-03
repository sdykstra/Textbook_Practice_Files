package DiceSim;
import java.util.Random;

/**
 *
 * @author nod
 */
public class DiceSim {
  public static void main( String[] args)
  {
      Random r = new Random(  );

      Random e = new Random(  );
     int die1 = 1+ r.nextInt(6);
     int die2 = 1 + e.nextInt(6);


    
System.out.println( " your die numbers are "+ die1 +" and "+ die2);
    

  }

}
