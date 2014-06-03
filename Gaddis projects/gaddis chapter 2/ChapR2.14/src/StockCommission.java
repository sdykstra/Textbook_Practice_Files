


public class StockCommission {

  
    
    
    public static void main(String[] args) 
    {
       
        double numShares, commission, pricePaid, pricePerShare, comToPay, total;
        
        numShares = 600;
        pricePerShare = 21.77;
        commission = .02;
        
        pricePaid = numShares*pricePerShare;
        
        comToPay = pricePaid*commission;
        
        total = pricePaid + comToPay;
        
        System.out.printf("The Ammount spent on stocks was $%,.02f\n" ,pricePaid );
        
        System.out.printf("The Ammount of commision to be paid is $%,.02f\n" , comToPay);
        
        System.out.printf("The total amount paid was $%,.02f\n" , total);
        
        
    }
}
