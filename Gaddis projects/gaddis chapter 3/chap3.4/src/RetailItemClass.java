/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott Dykstra
 */
public class RetailItemClass {
    
    public static void main (String [] args)
    {
        String item;
        int unitCount;
        double price;
        
        item = "Jacket";
        unitCount = 12;
        price = 59.95;
        
        RetailItem jacket = new RetailItem(item, unitCount, price);
       
        
        item = "designer Jeans";
        unitCount = 40;
        price = 34.95;
        
        RetailItem jeans = new RetailItem(item, unitCount, price);
        
        item = "Shirt";
        unitCount = 20;
        price = 24.95;
        
        RetailItem shirt = new RetailItem(item, unitCount, price);
        

        System.out.print(shirt.getItemInfo());
        
    }
    
}
