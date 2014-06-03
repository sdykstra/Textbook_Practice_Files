package DeiteChapter3;


/**
 *
 * @author ft
 */
public class Invoice {

    String partNum, partDiscription;
    int itemQuantity;
    double itemPrice;

    public Invoice() {
        partNum = null;
        partDiscription = null;
        itemQuantity = 0;
        itemPrice = 0;
    }

    public void setPartNum(String num) {
        partNum = num;
    }

    public void setDiscription(String discription) {
        partDiscription = discription;
    }

    public void setItemQuantity(int quantity) {
        itemQuantity = quantity;
    }

    public void setItemPrice(double price) {
        if (price > 0) {
            itemPrice = price;
        }
    }

    public String getPartNum() {
        return partNum;
    }

    public String getDiscription() {
        return partDiscription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double setItemPrice() {
        return itemPrice;
    }

    public double invoiceAmount() {
        double total;
        total = itemQuantity * itemPrice;
        return total;
    }
}// end Invoice
