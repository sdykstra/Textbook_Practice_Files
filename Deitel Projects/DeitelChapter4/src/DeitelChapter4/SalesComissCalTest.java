package DeitelChapter4;

import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 */
public class SalesComissCalTest {
    public static void main(String[] args){
        
        SalesComissCal salesPerson1 = new SalesComissCal();
        
        salesPerson1.addToGrossSales(239.99);
        salesPerson1.addToGrossSales(129.75);
        salesPerson1.addToGrossSales(99.95);
        salesPerson1.addToGrossSales(350.89);
        
        System.out.println(salesPerson1.grossSales);
       
        System.out.printf("your pay for the month is %.2f\n", salesPerson1.getPayCheckTotal());
        System.out.println(salesPerson1.commissionsPay);
    }// end main
    
}//end SalesComissCalTest
