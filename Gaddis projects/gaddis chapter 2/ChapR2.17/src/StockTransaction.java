



public class StockTransaction {

    public static void main(String[] args) {
        double numShares, commission, pricePaid, pricePerShare, comToPay, total, stockSold, priceDiff;
        
        numShares = 1000;
        pricePerShare = 32.87;
        commission = .02;
        
        pricePaid = numShares*pricePerShare;
        
        comToPay = pricePaid*commission;
        total = pricePaid + comToPay;
        
        System.out.printf("The Ammount spent on stocks was $%,.02f\n" ,pricePaid );
        
        System.out.printf("The Ammount of commision to be paid is $%,.02f\n" , comToPay);
        
        pricePerShare= 33.92;
        stockSold = numShares*pricePerShare;
        comToPay = stockSold*commission;
        priceDiff = stockSold- total-comToPay ;

        
        
        System.out.printf("The stock sold for $%,.02f\n" , stockSold);
        System.out.printf("The Ammount of commision to be paid form selling the stock was $%,.02f\n" , comToPay);
        System.out.printf("$%,.02f was the profit form the sale of the stock and paying both commissions \n ", priceDiff);        
        
    }
}
