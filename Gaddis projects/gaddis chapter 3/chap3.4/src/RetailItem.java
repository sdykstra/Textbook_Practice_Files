


public class RetailItem {
    
    private String discription;
    private int unitsOnHand;
    private double price;
     
    public RetailItem(String dis, int uOH, double p)
    {
    discription = dis;
    unitsOnHand = uOH;
    price = p;
    }
    public String getItemInfo()
    {
        return discription + " " + unitsOnHand + " " + price; 
    }
}
