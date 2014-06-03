package DeiteChapter3;


/**
 *
 * @author ft
 */
public class InvoiceTest {
    
    public static void main(String[] args){
        Invoice one = new Invoice();
        
        one.setDiscription("Hammer");
        one.setPartNum("1234");
        one.setItemPrice(7.50);
        one.setItemQuantity(45);
        
        System.out.printf("The name of your item is %s. \n", one.getDiscription());
        System.out.printf( "Your invoice amount is %.2f\n ", one.invoiceAmount());
        
    }
    
}
