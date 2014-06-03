
/**
 * @author Scott Dykstra
 */
public class TestScore 
{
    
    private double test1, test2, test3;
    
    public TestScore(double t1, double t2, double t3)
    {
        test1 = t1;
        test2 = t2;
        test3 = t3;
    }
    public  double testAverage()
    {
      double average;  
     average = (test1 +test2 +test3)/3;
     return average;
    }
    
    
}
