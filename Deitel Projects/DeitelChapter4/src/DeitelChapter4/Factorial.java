package DeitelChapter4;


/**
 *
 * @author Scott Dykstra
 */
public class Factorial {

    public double figureFactorial(int num) {
        double value = 1;

        while (num != 0) {

            value *= num;
            num--;

        }// end while
        return value;
    }
    
    public double eValue(int num){
        double e =1;
        
        while(num !=0){
           e += 1/(figureFactorial(num)) ;
            num--;
        }// end while
        return e;
    }// eValue
    
     public double eToThePower( int power){
        double e =1;
        int num1;
       int num = power;
       
       
        while(num !=0){
            num1 =num;
            int powerCB = power;
            
            while(num1 != 0){
                powerCB *= power;
                num1--;
            }            
            
           e += powerCB/(figureFactorial(num)) ;
            num--;
        }// end while
        return e;
    }// eValue
    
     
      public double probabilityNum( int n, int s){
        double e =1;
        int num = n-s;
        e = (figureFactorial(n)/(figureFactorial(s)*(figureFactorial(num))));
        return e;
    }// probabilityNum
}//end Factorial
