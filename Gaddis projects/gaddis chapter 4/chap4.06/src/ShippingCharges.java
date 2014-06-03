
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ShippingCharges {
    
    /*
        public double shipppingCharges(double weight){
         double weightFee=0;
         if (weight <2){
             weightFee = (weight * 1.10);
         } else if (weight <= 6){
             weightFee = (weight * 2.20);
         } else if (weight < 10){
             weightFee = (weight * 3.70);
         }else if (weight >=10){
             weightFee = (weight * 4.80);
         }
         
         
         return weightFee;
     }
     *  code that was asked for by chapter 4.6 rewritten to make program for
     * packages. Currently unable turn into excutible file.
     */
    
    
    
    
    
    

    public static double shipppingCharges(double weight) {
        double weightFee = 0;

        if (weight < 50) {
            weightFee = 72.5;
        } else {

            weightFee = (weight * 1.45);
        }

        return weightFee;
    }

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        double weightIn, price, total;
        int numPack;
        String inputString;

        inputString = JOptionPane.showInputDialog(" Please "
                + "enter the weight of your package ");
        weightIn = Double.parseDouble(inputString);
        price = shipppingCharges(weightIn);

        inputString = JOptionPane.showInputDialog(" Please enter"
                + "the number packages that you have ");
        numPack = Integer.parseInt(inputString);

        total = price + (numPack * 20);

        JOptionPane.showMessageDialog(null, "Your package cost will be $"
                + price + " the insurance is $15 per"
                + " package and the tax is $5 dollars per package. "
                + "Your total package cost is $" + total);


    }
}
