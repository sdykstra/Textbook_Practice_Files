package DeitelChapter4;

/**
 *
 * @author Scott Dykstra
 */
public class SalesComissCal {
        
    int standardPay =200;
    double commissionsPay, grossSales;
    
    public SalesComissCal(){
        grossSales=0;
    }
    public double getPayCheckTotal(){
        double totalPay=0;
        commissionsPay=(grossSales*.09);
        totalPay= commissionsPay+standardPay;
        
        return totalPay;
    }
    public void addToGrossSales(double sale){
       grossSales+=sale; 
    }
}
     