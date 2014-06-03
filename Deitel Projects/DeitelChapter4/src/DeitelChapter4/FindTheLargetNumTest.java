package DeitelChapter4;

/*
 *
 * @author Scott Dykstra
 */
public class FindTheLargetNumTest {
    
    public static void main(String[] args){
        
        FindTheLargetNum number = new FindTheLargetNum();
        
        number.FindLargestNum();
        System.out.println("largest number" + number.LargestNUmResults());
        
        number.FindLargeNumTillDone();
       System.out.println("largest number" + number.LargestNUmResults());
        
    }// end main
    
}// FindTheLargetNumTest
